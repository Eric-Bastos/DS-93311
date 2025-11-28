import os
import tkinter as tk
from tkinter import messagebox

FILENAME = 'funcionarios.txt'
FIELDS = ['id', 'nome', 'cargo', 'salario', 'contato']


def ensure_file():
    if not os.path.exists(FILENAME):
        open(FILENAME, 'w', encoding='utf-8').close()


def load_records():
    ensure_file()
    records = []
    with open(FILENAME, 'r', encoding='utf-8') as f:
        for line in f:
            line = line.rstrip('\n')
            if not line:
                continue
            parts = line.split('|')
            rec = dict(zip(FIELDS, parts))
            records.append(rec)
    return records


def save_records(records):
    with open(FILENAME, 'w', encoding='utf-8') as f:
        for r in records:
            line = '|'.join([str(r.get(k, '')) for k in FIELDS])
            f.write(line + '\n')


def get_next_id(records):
    if not records:
        return '1'
    ids = [int(r['id']) for r in records if r.get('id') and r['id'].isdigit()]
    return str(max(ids) + 1) if ids else '1'


def open_funcionarios_window(master=None):
    ensure_file()
    win = tk.Toplevel(master)
    win.title('Funcionários')
    win.geometry('700x420')

    left = tk.Frame(win)
    left.pack(side='left', fill='both', expand=True, padx=8, pady=8)
    right = tk.Frame(win)
    right.pack(side='right', fill='y', padx=8, pady=8)

    lb = tk.Listbox(left)
    lb.pack(side='left', fill='both', expand=True)
    sb = tk.Scrollbar(left, command=lb.yview)
    sb.pack(side='right', fill='y')
    lb.config(yscrollcommand=sb.set)

    entries = {}


    def refresh():
        lb.delete(0, 'end')
        for r in load_records():
            lb.insert('end', f"{r['id']} - {r['nome']} - {r['cargo']}")


    def on_add():
        records = load_records()
        new = {k: '' for k in FIELDS}
        new['id'] = get_next_id(records)
        for k in FIELDS:
            if k == 'id':
                continue
            new[k] = entries[k].get().strip()
        records.append(new)
        save_records(records)
        refresh()


    def on_select(evt):
        sel = lb.curselection()
        if not sel:
            return
        idx = sel[0]
        records = load_records()
        r = records[idx]
        for k in FIELDS:
            if k == 'id':
                continue
            entries[k].delete(0, 'end')
            entries[k].insert(0, r.get(k, ''))


    def on_update():
        sel = lb.curselection()
        if not sel:
            messagebox.showinfo('Info', 'Selecione um registro para atualizar')
            return
        idx = sel[0]
        records = load_records()
        r = records[idx]
        for k in FIELDS:
            if k == 'id':
                continue
            r[k] = entries[k].get().strip()
        save_records(records)
        refresh()


    def on_delete():
        sel = lb.curselection()
        if not sel:
            messagebox.showinfo('Info', 'Selecione um registro para excluir')
            return
        idx = sel[0]
        records = load_records()
        del records[idx]
        save_records(records)
        refresh()


    for i, field in enumerate(FIELDS):
        if field == 'id':
            continue
        lbl = tk.Label(right, text=field.capitalize())
        lbl.pack(anchor='w')
        ent = tk.Entry(right)
        ent.pack(fill='x')
        entries[field] = ent

    tk.Button(right, text='Adicionar', command=on_add).pack(fill='x', pady=6)
    tk.Button(right, text='Atualizar', command=on_update).pack(fill='x', pady=6)
    tk.Button(right, text='Excluir', command=on_delete).pack(fill='x', pady=6)
    tk.Button(right, text='Fechar', command=win.destroy).pack(fill='x', pady=6)

    lb.bind('<<ListboxSelect>>', on_select)
    refresh()

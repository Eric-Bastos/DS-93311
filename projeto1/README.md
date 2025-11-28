# Sistema simples CRUD (Tkinter + CustomTkinter)

Arquivos entregues (todos na mesma pasta):

- `main.py` (tela inicial com `customtkinter`)
- `caminhoes.py`
- `pecas.py`
- `fornecedores.py`
- `funcionarios.py`
- `clientes.py`
- `saidas.py`
- Arquivos TXT: `caminhoes.txt`, `pecas.txt`, `fornecedores.txt`, `funcionarios.txt`, `clientes.txt`, `saidas.txt`
- `requirements.txt`

Como usar:

1. Instale dependências (recomendo criar um venv):

```powershell
python -m venv .venv; .\.venv\Scripts\Activate.ps1; pip install -r requirements.txt
```

2. Execute a aplicação:

```powershell
python main.py
```

Observações:
- Cada módulo usa arquivos TXT simples, um registro por linha, campos separados por `|`.
- A interface principal (`main.py`) usa `customtkinter`, já os formulários de CRUD usam `tkinter` puro para garantir compatibilidade.
- Todos os arquivos ficam na mesma pasta (sem subpastas), conforme solicitado.

Se quiser, eu posso:
- Ajustar campos de cada entidade para requisitos reais (ex.: validar e-mails, preços numéricos etc.).
- Implementar pesquisa/filtro ou exportação CSV.

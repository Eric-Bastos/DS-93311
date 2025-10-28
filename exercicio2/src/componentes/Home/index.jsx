// exercicio2\src\componentes\Home\index.jsx //
import React , {useState} from 'react';
import './style.css'

function Home() {
    const [nome,SetNome] = useState('');
    const [telefone,SetTelefone] = useState('');

    const [Usuarios,SetUsuarios] = useState ([]);

    const handleSubmit = (event) => {
        event.preventDefault();
        if (nome && telefone) {
            SetUsuarios([...Usuarios, { nome, telefone }]);
            SetNome('');
            SetTelefone('');
        }
    };
    return (
        <div className="central">
            <div className='container'>
            <h2>Cadastro de Usuários</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Nome"
                    value={nome}
                    onChange={(e) => SetNome(e.target.value)}
                />
                <input
                    type="text"
                    placeholder="Telefone"
                    value={telefone}
                    onChange={(e) => SetTelefone(e.target.value)}
                />
                <div className="buttons-container">
                    <button type="submit">Adicionar</button>
                    <button type="button" onClick={() => SetUsuarios([])}>Limpar Lista</button>
                </div>
            </form>
            <hr />
            <h3>Lista de Usuários</h3>
            <ul>
                {Usuarios.map((usuario, index) => (
                    <li key={index}>
                        {usuario.nome} - {usuario.telefone}
                    </li>
                ))}
            </ul>
        </div>
        </div>
    )
}

export default Home;



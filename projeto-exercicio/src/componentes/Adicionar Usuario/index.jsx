// src\componentes\Adicionar Usuario\index.jsx 

import React,  { useState } from 'react'
import './style.css'

function AdicionarUsuario() {
    const [nome, SetNome] = useState('');
    const [email, SetEmail] = useState('');

    const [Usuarios, SetUsuarios] = useState([]);

    const handleSubmit = (event) => {
        event.preventDefault();
        if (nome && email) {
            SetUsuarios([...Usuarios, { nome, email }]);
            SetNome('');
            SetEmail('');
        }

    };

    return (
        <div className="central">
            <div className='container'>
            <h2>Adicionar Usuário</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    placeholder="Nome"
                    value={nome}
                    onChange={(e) => SetNome(e.target.value)}
                />
                <input
                    type="email"
                    placeholder="Email"
                    value={email}
                    onChange={(e) => SetEmail(e.target.value)}
                />
                <button type="submit">Adicionar</button>
            </form>
            <hr />
            <h3>Usuarios Adicionados</h3>
            <ul>
                {Usuarios.map((usuario, index) => (
                    <li key={index}>
                        {usuario.nome} - {usuario.email}
                        </li>
                ))}
            </ul>
        </div>
        </div>


    );
}
export default AdicionarUsuario;

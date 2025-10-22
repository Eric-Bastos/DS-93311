// projeto\src\components\InfoAluno\index.jsx
import { useState } from 'react';
import './style.css';


function InfoAluno(){
   // const nome = "Eric";
   // const idade = 20;
   // const curso = "Desenvolvimento Web";

const [nome, setNome] = useState("Eric");
const [idade, setIdade] = useState("20");
const [curso, setCurso] = useState("Desenvolvimento Web");



    return(
        <div className="info-aluno">
            <h2>Informações do Aluno</h2>
            <p>Nome: {nome}</p>
            <p>Idade: {idade}</p>
            <p>Curso: {curso}</p> 
        </div>
      
    );
}

export default InfoAluno;
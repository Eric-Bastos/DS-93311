// projeto\src\components\InfoCurso\index.jsx

// Dados do curso
// Nome:
// Carga Horária:
// Local:
// Data de Início:
// Data de Término:

import { useState } from 'react';
import './style.css';

function InfoCurso(){
    const [nomeCurso, setNomeCurso] = useState("Desenvolvimento Web");
    const [cargaHoraria, setCargaHoraria] = useState("120 horas");
    const [local, setLocal] = useState("Online");
    const [dataInicio, setDataInicio] = useState("01/09/2024");
    const [dataTermino, setDataTermino] = useState("31/12/2024");
    return(
        <div className="info-curso">
            <h2>Informações do Curso</h2>
            <p>Nome: {nomeCurso}</p>
            <p>Carga Horária: {cargaHoraria}</p>
            <p>Local: {local}</p>
            <p>Data de Início: {dataInicio}</p>
            <p>Data de Término: {dataTermino}</p>
        </div>
    );
}

export default InfoCurso;
    
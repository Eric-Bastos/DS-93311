// exercicio2\src\componentes\Footer\index.jsx //

import './style.css'

function Footer() {
    return (
        <footer className="footer">
            <p>&copy; {new Date().getFullYear()} Minha Empresa. Todos os direitos reservados.
                <br />Desenvolvido por Equipe de Desenvolvimento
                <br />CNPJ: 12.345.678/0001-99
                <br />Endereço: Rua Exemplo, 123, Cidade, Estado, CEP 12345-678
                
               

            </p>

        </footer>
    )
}

export default Footer;

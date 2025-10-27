// src\componentes\Footer\index.jsx
import './style.css'

function Footer() {
  return (
    <footer className="footer-container">
      <p>&copy; {new Date().getFullYear()} Todos os direitos reservados.
        <br /> Desenvolvido por Eric
        <br /> CNPJ: 00.000.000/0001-00


      </p>
      
    </footer>
  );
}

export default Footer;
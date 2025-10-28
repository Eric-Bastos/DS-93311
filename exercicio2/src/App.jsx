import './App.css'
import Footer from './componentes/Footer'
import Header from './componentes/Header'
import Home from './componentes/Home'

function App() {


  return (
    <>
      <Header />
      <main className='main'>
        <h1>Administração</h1>
        <Home />
      </main>
      <Footer />
    </>
  )
}

export default App




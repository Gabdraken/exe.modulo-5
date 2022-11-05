import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Banner from './componente/layout/banner';
import Footer from './componente/layout/Footer';
import Home from './componente/layout/Home';
import Navega from './componente/layout/navbar';
import Cadastro from './componente/layout/pages/Cadastro';
import Dest from './componente/layout/pages/Destinos';

function App() {
  return (
    <Router>
      <Banner />
      <Navega />


      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Dest" element={<Dest />} />
        <Route path="/Cadastro" element={<Cadastro/>} />
      </Routes>
      <Footer />
    </Router>
  );
}

export default App;

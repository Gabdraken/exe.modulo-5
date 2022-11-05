import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';

function Navega() {
  return (
    <>
      <Navbar bg="primary" variant="dark">
        <Container>
          <Navbar.Brand href="/">Milias a Mill</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="/Dest">Destinos</Nav.Link>
            <Nav.Link href="/Cadastro">Cadastramento</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
    </>
  );
}

export default Navega;
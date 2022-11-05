import Card from 'react-bootstrap/Card';

function Jumbo() {
  return (
    <Card style={{ width: '100%' }}>
      <Card.Body>
        <Card.Title>Estamos a mil</Card.Title>
        <Card.Subtitle className="mb-2 text-muted">O que está esperando? Venha fazer parte dessa familia tão agitada! Com a gente não existe férias chatas!</Card.Subtitle>
        <Card.Text>
          Já penseou em aproveitar o melhor do mundo? Faça já seu cadastro e garanta promoções íncriveis só para você!
        </Card.Text>
        <Card.Link href="/Cadastro">Faça aqui seu cadastro</Card.Link>
      </Card.Body>
    </Card>
  );
}

export default Jumbo;
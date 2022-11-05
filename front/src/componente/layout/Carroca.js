import Carousel from 'react-bootstrap/Carousel';

function Carroceu() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://i0.wp.com/meupatrimonio.com.br/wp-content/uploads/2022/01/12-materia-blog.png?fit=800%2C400&ssl=1"
          alt="First slide"
        />
        <Carousel.Caption>
          <h3>Memórias incríveis</h3>
          
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://www.cvc.com.br/dicas-de-viagem/wp-content/uploads/2019/10/shutterstock_383680390.jpg" alt="Second slide"
        />

        <Carousel.Caption>
          <h3>Momentos mágicos</h3>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="https://www.folhavitoria.com.br/geral/blogs/folha-viagem/wp-content/uploads/2018/12/Mala-de-viagem-900x400-800x400.jpg"
          alt="Third slide"
        />

        <Carousel.Caption>
          <h3>Lugares novos!</h3>
          
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

export default Carroceu;
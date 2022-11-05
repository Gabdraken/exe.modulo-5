import Badge from 'react-bootstrap/Badge';
import ListGroup from 'react-bootstrap/ListGroup';

function Lista() {
  return (
    <ListGroup as="ol" numbered>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">200R$</div>
          Rio/São Paulo
        </div>
        <Badge bg="primary" pill>
          15%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">800R$</div>
          Amazonas/Rio Grande do Sul
        </div>
        <Badge bg="primary" pill>
          10%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">520R$</div>
          Parana/Minas Gerais
        </div>
        <Badge bg="primary" pill>
          5%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">570R$</div>
          Minas Gerais/Pernambuco
        </div>
        <Badge bg="primary" pill>
          10%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">1000R$</div>
          Acre/Rio de Janeiro
        </div>
        <Badge bg="primary" pill>
          15%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">450R$</div>
          Bahia/Mato Grosso
        </div>
        <Badge bg="primary" pill>
          5%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">520$</div>
          Rondonia/Amapá
        </div>
        <Badge bg="primary" pill>
          5%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">600R$</div>
          Santa Catarina/Rio de Janeiro
        </div>
        <Badge bg="primary" pill>
          10%off
        </Badge>
      </ListGroup.Item>

      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">521R$</div>
          São Paulo/Brasilia
        </div>
        <Badge bg="primary" pill>
          5%off
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start"
      >
        <div className="ms-2 me-auto">
          <div className="fw-bold">550R$</div>
          Brasilia/Amazonas
        </div>
        <Badge bg="primary" pill>
          10%off
        </Badge>
      </ListGroup.Item>
      
    </ListGroup>
  );
}

export default Lista;
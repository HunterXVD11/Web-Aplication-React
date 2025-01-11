import { useLocation, useNavigate } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.css';
import React from "react";
import useIngressoStore from "../store/produtoStore";
import Ingresso from "../interfaces/produto";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faArrowAltCircleLeft } from "@fortawesome/free-solid-svg-icons/faArrowAltCircleLeft";
import { Card, Col, Row } from "react-bootstrap";
import '../styles/CardFilmes.css';

const DetalhesFilmes = () => {
    const location = useLocation();
    const navigate = useNavigate();

    var ingresso = location.state.data;

    const handleVoltar = () => {
        navigate(-1);
    };

    return (
        <>
            <div className="container mt-4">
                <button onClick={handleVoltar} className="btn btn-vermelho mb-3">
                    <FontAwesomeIcon icon={faArrowAltCircleLeft} /> Voltar
                </button>
                <Card className="card-detalhe " style={{backgroundColor: "#1b1b1b"}}>
                    <h1 className="mb-4 w">{ingresso.nome}</h1>
                    <Row className="mb-3">
                        <Col md={6}>
                            <img src={ingresso.image} alt={ingresso.nome} className="card-image-filme" style={{width: '250px'}} />
                        </Col>
                        <Col md={6}>
                            <iframe
                                className="media-video"
                                width="100%"
                                height="315"
                                src= {ingresso.trailer}
                                title="YouTube video player"
                                allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share">
                            </iframe>
                        </Col>
                    </Row>
                    <Row>
                        <Col md={6}>
                            <p className="w"><strong>Ano de Lançamento:</strong> {ingresso.anoLancamento}</p>
                            <p className="w"><strong>Diretor:</strong> {ingresso.diretor}</p>
                            <p className="w"><strong>Gênero:</strong> {ingresso.genero}</p>
                        </Col>
                        <Col md={6}>
                            <p className="w">{ingresso.descricao}</p>
                        </Col>
                    </Row>
                </Card>

            </div>
        </>
    );
}

export default DetalhesFilmes;

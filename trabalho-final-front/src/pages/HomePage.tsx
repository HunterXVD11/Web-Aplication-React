import React from "react";
import { Carousel } from "react-bootstrap";
import { Outlet } from "react-router-dom";
import '../styles/Carrossel.css'

const HomePage = () => {
  return (
    <>
      <Carousel style={{ marginTop: "69px" }} className='d-none d-md-block mb-4'>
      <Carousel.Item>
          <img className="d-block mx-auto carousel-image"  src="https://rollingstone.uol.com.br/media/uploads/2024/05/nova-york-e-destruida-em-novo-trailer-de-um-lugar-silencioso-dia-um-foto-divulgacaoparamount-pictures.jpg" />
          <Carousel.Caption>
            <h3>O diretor de Um Lugar Silencioso: Dia Um fala sobre a possibilidade de uma sequência. “Um musical animado de Frodo sempre será uma opção”</h3>
            <p>terça-feira, 9 de julho de 2024</p>
          </Carousel.Caption>
        </Carousel.Item>
        {/* <Carousel.Item>
          <img className="d-block mx-auto carousel-image" src="https://www.centrodeartes.uff.br/wp-content/uploads/2023/12/Banner-Cinema-2.png" />
        </Carousel.Item> */}
        <Carousel.Item>
          <img className="d-block mx-auto carousel-image"  src="https://ingresso-a.akamaihd.net/b2b/production/uploads/article/image/2260/d38a2ed4ff394bf0caa140cd77060bf9.jpg" />
          <Carousel.Caption>
            <h3>Divertidamente 2 quebra recordes de bilheteria em 2024 e se torna uma das animações mais rentáveis do cinema</h3>
            <p>segunda-feira, 1 de julho de 2024</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img className="d-block mx-auto carousel-image"  src="https://movieplayer.net-cdn.it/t/images/2024/02/08/cattivissimo-me-4-tutto-quello-sappiamo-sequel_jpeg_1600x900_crop_q85.jpg" />
          <Carousel.Caption>
            <h3>Meu Malvado Favorito 4 tem a maior estreia da franquia no Brasil</h3>
            <p>terça-feira, 9 de julho de 2024</p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>
      <div>
        <Outlet></Outlet>
      </div>
    </>
  )
}

export default HomePage;

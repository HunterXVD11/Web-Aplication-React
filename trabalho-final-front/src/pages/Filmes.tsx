import React from 'react';
import { useNavigate, useParams } from "react-router-dom";
import useProdutos from '../hooks/useProduto';
import Produto from '../interfaces/produto'; 
import { Link } from 'react-router-dom';
import '../styles/CardFilmes.css';
import DetalhesFilmes from './DetalhesFilmes';
import { width } from '@fortawesome/free-solid-svg-icons/faArrowAltCircleLeft';

const Filmes = () => {
  const { data: produtos, isLoading, error } = useProdutos();
  const navigate = useNavigate();
  const DetalhesFilmes = (produto: Produto) => {
    navigate(`/detalhesFilmes`, { state: { data: produto } })
  }

  if (isLoading) {
    return <div>Carregando...</div>;
  }
  
  if (error) {
    return <div>Erro ao carregar os produtos: {error.message}</div>;
  }

  if (!produtos || produtos.length === 0) {
    return <div>Nenhum produto encontrado.</div>;
  }

  return (
    <div className="container w">
      <h3 className='titulo-ingressos'>Filmes</h3>
      <div className="card-container-filme">
        {produtos.map(produto => (
          // <Link to={`/filme/${produto.id}`} key={produto.id} style={{ textDecoration: 'none' }}>
            <div className="card-filme">
              <img src={produto.image} alt={produto.nome} className="card-image-filme" />
              <div className="card-body-filme">
                <h5 className="card-title-filme">{produto.nome}</h5>
              </div>
              <div>
              <button
        className="btn btn-vermelho w-100"
        onClick={() => DetalhesFilmes(produto)}
        
        >
        Ver mais
        </button>
              </div>
            </div>
          //</Link> */}
        
        ))}
      </div>
    </div>
  );
};

export default Filmes;

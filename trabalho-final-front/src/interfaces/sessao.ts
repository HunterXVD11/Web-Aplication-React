import Produto from './produto'
interface Sessao {
    id: number;
    tituloFilme: string;
    horaInicio: string;
    tempoFilme?: number;
    produto: Produto;
}
export default Sessao;
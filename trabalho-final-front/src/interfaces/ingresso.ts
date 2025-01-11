import Sessao from "./sessao";

interface Ingresso {
    codIngresso?: number;
    preco: number;
    assento: number;
    dataCompra: Date;
    sessao: Sessao;
}
export default Ingresso;
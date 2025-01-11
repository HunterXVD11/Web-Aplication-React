import Categoria from "./categoria";

interface Produto{
    id?: number;
    nome: string;
    anoLancamento: number;
    diretor: string;
    genero: string;
    descricao: string;
    trailer: string;
    image: string;
    nota: number;
    categoria: Categoria;
}
export default Produto
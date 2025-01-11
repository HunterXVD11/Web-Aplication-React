import { create } from "zustand";
import Produto from "../interfaces/produto";

interface ProdutoStore {
    pagina: number;
    tituloFilme: string;
    produtoSelecionado: Produto;
    tamanho: number;

    setPagina: (pagina: number) => void;
    setTituloFilme: (tituloFilme: string) => void;
    setProdutoSelecionado: (produtoSelecionado: Produto) => void; // Renomeado aqui
}

const useProdutoStore = create<ProdutoStore>((set) => ({
    pagina: 0,
    tituloFilme: "",
    produtoSelecionado: {} as Produto,
    tamanho: 5,
    setPagina: (pagina: number) => set(() => ({ pagina })),
    setTituloFilme: (tituloFilme: string) => set(() => ({ tituloFilme })),
    setProdutoSelecionado: (produtoSelecionado: Produto) => set(() => ({ produtoSelecionado })) // Renomeado aqui
}));

export default useProdutoStore;

// import { useInfiniteQuery } from "@tanstack/react-query";
// import Produto from "../interfaces/produto";
// import useApiProduto from "./useApiProduto";

// interface QueryString {
//   tamanho: number;
//   pagina?: number;
//   nome?: string; // Adicionado para permitir busca por nome do produto
// }

// const useProdutosPaginados = (query: QueryString) => {
//   const { recuperarProdutosPaginados } = useApiProduto();

//   return useInfiniteQuery<ResultadoPaginado<Produto>>({
//     queryKey: ["produtos", "paginacao", JSON.stringify(query)],
//     queryFn: ({ pageParam = 0 }) =>
//       recuperarProdutosPaginados({
//         params: {
//           pagina: pageParam,
//           tamanho: query.tamanho,
//           nome: query.nome // Passando nome como um parâmetro opcional
//         },
//       }),
//       staleTime: 10_000,
//       keepPreviousData: true,
    
//     getNextPageParam: (lastPage) => {
//       return lastPage.paginaCorrente < lastPage.totalDePaginas -1 ? 
//         lastPage.paginaCorrente + 1 : undefined;
//     }
//   });
// };

// export default useProdutosPaginados;
import { useQuery } from "@tanstack/react-query";
import Item from "../interfaces/produto";
import { URL_PRODUTOS } from "../util/constants";
import useApi from "./useApiProduto";

interface ItensPaginados {
  totalDeProdutos: number;
  totalDePaginas: number;
  paginaCorrente: number;
  produtos: Item[];
}
interface QueryString {
  pagina: number;
  tamanho: number;
}

const useItensPaginados = (query: QueryString) => {
  const { recuperarPagina } = useApi<Item>(URL_PRODUTOS);

  return useQuery({
    queryKey: ["produtos", "paginacao", query],
    queryFn: () =>
      recuperarPagina({
        params: {
          // pagina: query.pagina,
          // tamanho: query.tamanho,
          // nome: query.nome
          ...query,
        },
      }),
    staleTime: 10_000,

  });
};
export default useItensPaginados;
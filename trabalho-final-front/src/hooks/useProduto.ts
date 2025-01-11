// import { useQuery } from "@tanstack/react-query";
// import Produto from "../interfaces/produto";
// import axios from "axios";


// const useItens = () => useQuery({
//     queryKey: ['itens'],
//     queryFn: () => axios
//         .get<Produto[]>("http://localhost:8080/produtos")
//         .then(res=>res.data),
//     staleTime: 10_000
// });
// export default useItens;

// hooks/useProdutos.js
// import { useQuery } from '@tanstack/react-query';
// import axios from 'axios';

// const fetchProduto = async () => {
//     const { data } = await axios.get('http://localhost:8080/produtos'); // Ajuste a URL conforme sua API
//     return data;
// };

// export default function useProdutos() {
//     return useQuery(['produtos'], fetchProduto);
// }

// hooks/useProduto.js

// import { useQuery } from '@tanstack/react-query';
// import axios from 'axios';

// const fetchProdutos = async () => {
//     const { data } = await axios.get('http://localhost:8080/produtos'); // Certifique-se que esta URL está correta
//     return data;
// };

// const useProdutos = () => {
//     return useQuery(['produtos'], fetchProdutos, {
//         initialData: []  // Define dados iniciais como um array vazio
//     });
// };

// export default useProdutos;

// hooks/useProdutos.js
import { useQuery } from "@tanstack/react-query";
import axios from "axios";
import Produto from "../interfaces/produto";

const fetchProdutos = () => axios.get<Produto[]>("http://localhost:8080/produtos").then(res => res.data);

const useProdutos = () => {
  return useQuery<Produto[], Error>({
    queryKey: ['produtos'],
    queryFn: fetchProdutos,
    staleTime: 10_000  
  });
};

export default useProdutos;



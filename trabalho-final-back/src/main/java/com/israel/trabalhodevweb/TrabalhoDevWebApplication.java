package com.israel.trabalhodevweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.israel.trabalhodevweb.modelo.Carrinho;
import com.israel.trabalhodevweb.modelo.Categoria;
import com.israel.trabalhodevweb.modelo.Ingresso;
import com.israel.trabalhodevweb.modelo.Item_carrinho;
import com.israel.trabalhodevweb.modelo.Produto;
import com.israel.trabalhodevweb.modelo.Sessao;
import com.israel.trabalhodevweb.repository.CarrinhoRepository;
import com.israel.trabalhodevweb.repository.IngressoRepository;
import com.israel.trabalhodevweb.repository.Item_CarrinhoRepository;
import com.israel.trabalhodevweb.repository.SessaoRepository;
import com.israel.trabalhodevweb.repository.CategoriaRepository;
import com.israel.trabalhodevweb.repository.ProdutoRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class TrabalhoDevWebApplication implements CommandLineRunner {

	@Autowired
    IngressoRepository ingressoRepository;

    @Autowired
    SessaoRepository sessaoRepository;

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private Item_CarrinhoRepository item_carrinhoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


	public static void main(String[] args) {
		SpringApplication.run(TrabalhoDevWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

                
        //Categoria
        Categoria comedia = new Categoria("comedia","comedia");
        categoriaRepository.save(comedia);

        Categoria aventura = new Categoria("aventura","aventura");
        categoriaRepository.save(aventura);

        Categoria terror = new Categoria("terror","terror");
        categoriaRepository.save(terror);

        Categoria romance = new Categoria("romance","romance");
        categoriaRepository.save(romance);

        Categoria ficcao = new Categoria("ficcao","ficcao");
        categoriaRepository.save(ficcao);

        Categoria acao = new Categoria("acao","acao");
        categoriaRepository.save(acao);


        //Produto
        Produto deadpool = new Produto("Deadpool e Wolverine",2024,"Shawn Levy","comedia","Wolverine está se recuperando quando cruza seu caminho com Deadpool. Juntos, eles formam uma equipe e enfrentam um inimigo em comum.",9,"https://www.youtube.com/embed/Y__D3UrVLQE?si=MbMcBKA2brnwbLQu","https://cinepop.com.br/wp-content/uploads/2024/05/deadpool-e-wolverine-poster.jpg",comedia);
        produtoRepository.save(deadpool);

        Produto umLugar = new Produto("Um Lugar Silencioso:Dia Um",2024,"Michael Sarnoski","terror","Uma mulher luta pela sobrevivência durante uma invasão alienígena na cidade de Nova York.",8,"https://www.youtube.com/embed/k9fXMmtyWwc?si=neYBJ2tPOeO8faG8?autoplay=1","https://br.web.img3.acsta.net/img/3d/a5/3da55e2824a79a6b3ba13b44c551d3b3.jpg",terror);
        produtoRepository.save(umLugar);

        Produto divertidamente = new Produto("Divertidamente 2",2024,"Kelsey Mann","aventura","Com um salto temporal, Riley se encontra mais velha, passando pela tão temida adolescência. Junto com o amadurecimento, a sala de controle também está passando por uma adaptação para dar lugar a algo totalmente inesperado: novas emoções.",9,"https://www.youtube.com/embed/yAZxx8t9zig?si=afU4XpDEt0BRFaCP?autoplay=1","https://lumiere-a.akamaihd.net/v1/images/gife454xsaa8wv-_3e8071e7.jpeg",aventura);
        produtoRepository.save(divertidamente);

        Produto malvado = new Produto("Meu Malvado Favorito 4",2024,"Chris Renaud","aventura","Gru dá as boas-vindas a um novo membro da família, Gru Jr., que pretende atormentar seu pai. No entanto, sua existência pacífica logo desmorona quando um mentor do crime escapa da prisão e jura vingança contra Gru.",9,"https://www.youtube.com/embed/XEG0tWu9yKw?si=SGnjO48FHU-yhaA3?autoplay=1","https://ingresso-a.akamaihd.net/prd/img/movie/meu-malvado-favorito-4/4d756249-3b88-4b59-baa2-527f5e3d4c3e.webp",aventura);
        produtoRepository.save(malvado);

        Produto gladiador = new Produto("Gladiador 2",2024,"Ridley Scott","ação","Gladiator 2 é um futuro filme épico americano dirigido por Ridley Scott. Sendo sequência de Gladiator, o filme foi escrito por David Scarpa e estrelado por Paul Mescal, Denzel Washington, Connie Nielsen, Joseph Quinn e Pedro Pascal.",9,"https://www.youtube.com/embed/hu0N3n2Ifpk?si=hDNHgxrQd4GC81sQ","https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2024/07/gladiador-2_c61501.png?w=361",acao);
        produtoRepository.save(gladiador);


        //Sessao
        Sessao divertidamente1 = new Sessao("Divertidamente 2","11:00", 120,divertidamente);
        sessaoRepository.save(divertidamente1);

        Sessao malvado1 = new Sessao("Meu Malvado Favorito 4","12:00", 120,malvado);
        sessaoRepository.save(malvado1);

        Sessao gladiador1 = new Sessao("Gladiador 2","13:00", 120,gladiador);
        sessaoRepository.save(gladiador1);

        Sessao deadpool1 = new Sessao("Deadpool e Wolverine","14:00", 120,deadpool);
        sessaoRepository.save(deadpool1);

        Sessao deadpool2 = new Sessao("Deadpool e Wolverine","15:00", 120,deadpool);
        sessaoRepository.save(deadpool2);

        Sessao deadpool3 = new Sessao("Deadpool e Wolverine","16:00", 120,deadpool);
        sessaoRepository.save(deadpool3);

        Sessao umLugar1 = new Sessao("Um Lugar Silencioso:Dia Um","17:00", 120,umLugar);
        sessaoRepository.save(umLugar1);

        Sessao umLugar2 = new Sessao("Um Lugar Silencioso:Dia Um","18:00", 120,umLugar);
        sessaoRepository.save(umLugar2);

        Sessao umLugar3 = new Sessao("Um Lugar Silencioso:Dia Um","19:00", 120,umLugar);
        sessaoRepository.save(umLugar3);


        //Ingresso
        Ingresso ingresso = new Ingresso(
                10,
                BigDecimal.valueOf(16.15),
                deadpool1,
                LocalDate.now()
        );
        ingressoRepository.save(ingresso);

        Ingresso ingresso2 = new Ingresso(
                10,
                BigDecimal.valueOf(16.15),
                malvado1,
                LocalDate.now()
        );
        ingressoRepository.save(ingresso2);


        //Carrinho
        Carrinho carrinho = new Carrinho(
                LocalDate.now()
        );


        //Item Carrinho
        carrinhoRepository.save(carrinho);
        Item_carrinho item1 = new Item_carrinho(
                3,
                carrinho,
                ingresso
        );
        item_carrinhoRepository.save(item1);

        Item_carrinho item2 = new Item_carrinho(
                3,
                carrinho,
                ingresso2
        );
        item_carrinhoRepository.save(item2);

    }
}

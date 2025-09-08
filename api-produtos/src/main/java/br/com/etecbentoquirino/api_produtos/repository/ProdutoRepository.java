package br.com.etecbentoquirino.api_produtos.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etecbentoquirino.api_produtos.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    List<Produto> findByNome(String Nome);
    List<Produto> findByNomeContaining(String parteDoNome);
}
package br.com.etecbentoquirino.api_produtos.repository;
import br.com.etecbentoquirino.api_produtos.model.Produto;
    public class ProdutoRepository{

        public interface ProdutoRepository extends JpaRepository<Produto, Long>{

            
        }
    }

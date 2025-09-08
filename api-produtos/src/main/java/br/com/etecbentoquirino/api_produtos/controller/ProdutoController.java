package br.com.etecbentoquirino.api_produtos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import br.com.etecbentoquirino.api_produtos.model.Produto;
import br.com.etecbentoquirino.api_produtos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    
    private final ProdutoRepository repository;
    public ProdutoController(ProdutoRepository repository){
        this.repository = repository;
    }
    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return repository.save(produto);
        }
        
    @GetMapping
    public List<Produto> listar(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
   
}

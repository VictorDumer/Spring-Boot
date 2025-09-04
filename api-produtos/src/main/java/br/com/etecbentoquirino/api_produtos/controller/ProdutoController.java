package br.com.etecbentoquirino.api_produtos.controller;

import org.aspectj.apache.bcel.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etecbentoquirino.api_produtos.repository.*;
import br.com.etecbentoquirino.api_produtos.model.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    public ProdutoController(){

    }

    private ProdutoRepository repository;
    
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

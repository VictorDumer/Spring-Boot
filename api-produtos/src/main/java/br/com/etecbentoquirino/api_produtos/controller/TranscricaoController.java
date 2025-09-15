package br.com.etecbentoquirino.api_produtos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import br.com.etecbentoquirino.api_produtos.model.Transcricao;
import br.com.etecbentoquirino.api_produtos.repository.TranscricaoRepository;

@RestController
@RequestMapping("/transcricoes")
public class TranscricaoController {

    private final TranscricaoRepository repository;

     public TranscricaoController(TranscricaoRepository repository){
        this.repository = repository;
    }
    
    @PostMapping
    public Transcricao criar(@RequestBody Transcricao transcricao){
        return repository.save(transcricao);
        }
        
    @GetMapping
    public List<Transcricao> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Transcricao buscar(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Transcricao atualizar(@PathVariable Long id, @RequestBody Transcricao novaTranscricao){
        return repository.findById(id).map(transcricao ->{
            transcricao.setTranscricao(novaTranscricao.getTranscricao());
            return repository.save(transcricao);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}

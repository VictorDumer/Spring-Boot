package br.com.etecbentoquirino.api_produtos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.etecbentoquirino.api_produtos.model.Transcricao;

public interface TranscricaoRepository extends JpaRepository<Transcricao, Long> {
    List<Transcricao> findBytranscricaoContaining(String transcricao);
}
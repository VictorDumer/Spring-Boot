package br.com.etecbentoquirino.api_produtos;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJpaAuditing
@SpringBootApplication
public class ApiProdutosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProdutosApplication.class, args);
    }
}

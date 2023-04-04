package br.com.alura.projectalura;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRespository extends MongoRepository<Linguagem, String> {
    
}

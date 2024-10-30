package br.edu.fatec.pg.Aplicacao.JPA.services;

import br.edu.fatec.pg.Aplicacao.JPA.models.Cep;
import br.edu.fatec.pg.Aplicacao.JPA.repository.CepRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    
    @Autowired
    private CepRepository cepRepository;

    // Salva um novo CEP se não existir
public Cep saveCep(Cep cep) {
    if (cep == null) {
        return null; // Caso o cep não exista
    }
    // Verifica se o CEP já existe
    if (cepRepository.existsByCodigo(cep.getCodigo())) {
        return null;
    }
    return cepRepository.save(cep); // Salva o novo CEP
}

    // Retorna todos os CEPs
    public List<Cep> findAllCeps() {
        return cepRepository.findAll();
    }

}

package br.edu.fatecpg.spring.ConsomeAPI.service;

import br.edu.fatecpg.spring.ConsomeAPI.model.Filme;
import br.edu.fatecpg.spring.ConsomeAPI.model.Serie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDado implements IConvertDado {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDado(String json, Class<T> classe) throws JsonProcessingException {
        return mapper.readValue(json, classe);
    }

    public Filme retornarFilme(String json) throws JsonProcessingException {
        return obterDado(json, Filme.class);
    }

    public Serie retornarSerie(String json) throws JsonProcessingException {
        return obterDado(json, Serie.class);
    }
}
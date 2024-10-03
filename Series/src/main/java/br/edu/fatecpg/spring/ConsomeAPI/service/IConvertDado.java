package br.edu.fatecpg.spring.ConsomeAPI.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConvertDado {
    <T> T obterDado(String json, Class<T> classe) throws JsonProcessingException;
}
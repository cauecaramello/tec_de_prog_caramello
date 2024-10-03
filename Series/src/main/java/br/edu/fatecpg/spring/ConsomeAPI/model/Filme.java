package br.edu.fatecpg.spring.ConsomeAPI.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Filme(
        @JsonAlias("Title") String nome,
        @JsonAlias("Runtime") String duracao,
        @JsonAlias("Year") String ano,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Actors") String atores,
        @JsonAlias("Plot") String sinopse,
        @JsonAlias("Poster") String poster) {

    @Override
    public String toString() {
        return "Filme{" +
                "Nome: '" + nome + '\'' +
                ", Tempo de duração: '" + duracao + '\'' +
                ", Ano: '" + ano + '\'' +
                ", Gênero: '" + genero + '\'' +
                ", Atores: '" + atores + '\'' +
                ", Sinopse: '" + sinopse + '\'' +
                ", Poster: '" + poster + '\'' +
                '}';
    }
}

package br.edu.fatec.pg.Aplicacao.JPA.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true) // Ignora campos não reconhecidos
@Table(name = "ceps")
public class Cep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("cep")
    private String codigo; // Armazena o CEP
    @Column(name = "logradouro")  
    private String logradouro;
    @Column(name = "bairro")  
    private String bairro;
    @Column(name = "localidade")  
    private String localidade;
    @Column(name = "uf")  

    private String uf;

    public Cep() {} // Construtor padrão exigido pelo JPA

    // Construtor para criação a partir dos dados da API
    public Cep(String codigo, String logradouro, String bairro, String localidade, String uf) {
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }
  
    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "CEP: " + codigo + "\nLogradouro: " + logradouro + "\nBairro: " + bairro + 
               "\nLocalidade: " + localidade + "\nUF: " + uf + "\n";
    }
}

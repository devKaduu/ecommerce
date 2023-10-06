package com.github.acnaweb.ecommerce.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ClientDTO {
    private Long id;
    private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
    private Instant dataCadastro;
    private boolean ativo;
}

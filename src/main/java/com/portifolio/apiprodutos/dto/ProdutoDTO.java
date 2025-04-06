package com.portifolio.apiprodutos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProdutoDTO {

@NotBlank(message = "Nome é Obrigatorio")
private String nome;

@Positive(message = "O preço deve ser maior que zero")
private Double preco;

@NotBlank(message = "Descrição é Obrigatorio")
private String descricao;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Double getPreco() {
    return preco;
}

public void setPreco(Double preco) {
    this.preco = preco;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}
}

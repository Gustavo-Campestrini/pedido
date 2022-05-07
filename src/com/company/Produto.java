package com.company;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}

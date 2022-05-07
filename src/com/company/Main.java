package com.company;

public class Main {

    public static void main(String[] args) {
        final Cliente clienteRoberto = new Cliente();
        clienteRoberto.nome = "Roberto";
        clienteRoberto.CPF = "08341741970";

        final Produto produtoPao = new Produto();
        produtoPao.nome = "Pao";
        produtoPao.quantidadeEmEstoque = 200;
        produtoPao.preco = 2.99;

        final Produto produtoCebola = new Produto();
        produtoCebola.nome = "cebola";
        produtoCebola.quantidadeEmEstoque = 300;
        produtoCebola.preco = 3.89;

        final Pedido pedidofinal = new Pedido();
        pedidofinal.codigo = "1";
        pedidofinal.cliente = clienteRoberto;
        pedidofinal.produtos = new Produto[]{produtoCebola, produtoCebola, produtoPao};
    }
}


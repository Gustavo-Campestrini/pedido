package com.company;

import java.util.Arrays;

public class Pedido {
    private String codigo;
    private Cliente cliente;
    private Produto[] produtos = new Produto[0];

    public Pedido(String codigo, Cliente cliente, Produto[] produtos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void adicionarProdutos(Produto novoProduto) {
        this.produtos = Arrays.copyOf(this.produtos, this.produtos.length + 1);
        this.produtos[this.produtos.length - 1] = novoProduto;
    }

    public double valor_total() {
        double somaTotal = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            somaTotal = somaTotal + this.produtos[i].getPreco();
        }
        return somaTotal;
    }

    public void produtosPedido() {
        System.out.println("Produtos:");
        for (int i = 0; i < this.produtos.length; i++) {
            System.out.println(this.produtos[i].getNome());
        }
    }

}

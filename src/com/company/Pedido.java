package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pedido {
    String codigo;
    Cliente cliente;
    Produto[] produtos = new Produto[0];

    void adicionarProdutos(Produto novoProduto) {
        this.produtos = Arrays.copyOf(this.produtos, this.produtos.length + 1);
        this.produtos[this.produtos.length - 1] = novoProduto;
    }

    double valor_total() {
        double somaTotal = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            somaTotal = somaTotal + this.produtos[i].preco;
        }
        return somaTotal;
    }

}


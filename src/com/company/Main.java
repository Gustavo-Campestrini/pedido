package com.company;

public class Main {

    public static void main(String[] args) {
        final Cliente clienteRoberto = new Cliente("Roberto", "9128390182");

        final Produto produtoPao = new Produto("Pao", 2.99, 200);

        final Produto produtoCebola = new Produto("cebola", 3.89, 300);

        final Pedido pedidofinal = new Pedido("1", clienteRoberto, new Produto[]{produtoCebola, produtoCebola, produtoPao});
        System.out.printf("Codigo do pedido: " + pedidofinal.getCodigo());
        System.out.println("\nNome do cliente: " + pedidofinal.getCliente().getNome());
        System.out.println("\nCPF do cliente: " + pedidofinal.getCliente().getCPF());
        pedidofinal.produtosPedido();
    }
}


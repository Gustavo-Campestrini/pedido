package com.company;

public class Cliente {
    String nome;
    String CPF;

    public Cliente(String nome, String CPF) {
        if (CPF == null) {
            throw new IllegalArgumentException("CPF em branco");
        } else {
            this.CPF = CPF;
        }
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}

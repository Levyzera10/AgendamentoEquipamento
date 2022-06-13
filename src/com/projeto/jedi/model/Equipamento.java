package com.projeto.jedi.model;

public class Equipamento {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}

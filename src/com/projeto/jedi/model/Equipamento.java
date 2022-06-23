package com.projeto.jedi.model;

public class Equipamento {

    private String id;
    private String nome;
    private String fabricante;


    public Equipamento(String id, String nome, String fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public Equipamento() {

    }

    public String getFabricante() {

        return fabricante;
    }

    public void setFabricante(String fabricante) {

        this.fabricante = fabricante;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.id + "-" + this.nome + "-" + this.fabricante;
    }

    public String descricaoEquipamento() {
        return " Id: " + this.id + "\n nome: " + this.nome + "\n Fabricante: " + this.fabricante;
    }
}

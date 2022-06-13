package com.projeto.jedi.repositories;

import com.projeto.jedi.model.Equipamento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EquipamentoRepository {

    public File arquivo;

    public EquipamentoRepository() throws IOException {
        File diretorio = new File("C:\\Users\\Curumin\\Documents\\Projetos\\projetocadastro");
        File arquivo = new File(diretorio + "/teste.txt");

        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        this.arquivo = arquivo;
    }

    public void getAll() {

    }

    public void save(Equipamento equipamento) throws IOException {

        FileWriter fw = new FileWriter(this.arquivo , true);
        BufferedWriter bw = new BufferedWriter(fw);


        bw.write(equipamento.toString());
        bw.newLine();

        bw.close();
        fw.close();
    }

    public void update() {

    }

    public void delete() {

    }

}

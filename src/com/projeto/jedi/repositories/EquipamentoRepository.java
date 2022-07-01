package com.projeto.jedi.repositories;

import com.projeto.jedi.model.Equipamento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoRepository {

    public File arquivo;

    public EquipamentoRepository() throws IOException {
        File diretorio = new File("./src/com/projeto/jedi/arquivos");
        File arquivo = new File(diretorio + "/equipamentos.txt");

        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        this.arquivo = arquivo;
    }

    public List<Equipamento> getAll() throws IOException {

        FileReader fr = new FileReader(this.arquivo);
        BufferedReader bf = new BufferedReader(fr);

        List<Equipamento> equipamentoList = new ArrayList<>();

        while (bf.ready()) {

            String linha = bf.readLine();
            String[] linhaSplit = linha.split("-");

            Equipamento equipamento = new Equipamento(linhaSplit[0], linhaSplit[1], linhaSplit[2]);
            equipamentoList.add(equipamento);

        }

        bf.close();
        fr.close();
        return equipamentoList;
    }

    public void save(Equipamento equipamento) throws IOException {

        FileWriter fw = new FileWriter(this.arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);


        bw.write(equipamento.toString());
        bw.newLine();

        bw.close();
        fw.close();
    }

    public void update(Equipamento equipamento) throws IOException {
        List<Equipamento> listaDeEquipamentos;
        FileWriter fw = new FileWriter(this.arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(equipamento.toString());
        bw.newLine();

        bw.close();
        fw.close();

    }

    public void delete() {

    }

}

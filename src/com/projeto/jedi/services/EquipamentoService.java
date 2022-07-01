package com.projeto.jedi.services;

import com.projeto.jedi.model.Equipamento;
import com.projeto.jedi.repositories.EquipamentoRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EquipamentoService {

    public EquipamentoRepository equipamentoRepository;
    Scanner scanner;

    public EquipamentoService() throws IOException {
        equipamentoRepository = new EquipamentoRepository();
        scanner = new Scanner(System.in);
    }

    public void listarEquipamento() throws IOException {
        System.out.println("Listar Equipamento");

        List<Equipamento> equipamentoList = equipamentoRepository.getAll();
        for (Equipamento equipamento : equipamentoList) {
            System.out.println(equipamento.descricaoEquipamento());
        }
    }

    public void salvarEquipamento() throws IOException {
        Equipamento equipamento = new Equipamento();

        System.out.println("Digite o ID do equipamento : ");
        equipamento.setId(scanner.nextLine());

        System.out.println("Digite o nome do equipamento :");
        equipamento.setNome(scanner.nextLine());

        System.out.println("Digite o fabricante :");
        equipamento.setFabricante(scanner.nextLine());

        equipamentoRepository.save(equipamento);


    }

    public void alterarEquipamento() throws IOException {
        System.out.println("Alterar equipamento");

    }

    public void deletarEquipamento() {
        System.out.println("Deletar");
        equipamentoRepository.delete();

    }
}

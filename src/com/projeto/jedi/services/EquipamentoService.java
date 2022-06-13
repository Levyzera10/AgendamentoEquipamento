package com.projeto.jedi.services;

import com.projeto.jedi.model.Equipamento;
import com.projeto.jedi.repositories.EquipamentoRepository;

import java.io.IOException;
import java.util.Scanner;

public class EquipamentoService {

    public EquipamentoRepository equipamentoRepository;
    Scanner scanner;

    public EquipamentoService() throws IOException {
        equipamentoRepository = new EquipamentoRepository();
        scanner = new Scanner(System.in);
    }

    public void listarEquipamento() {
        System.out.println("Listar Equipamento");

        equipamentoRepository.getAll();

    }

    public void salvarEquipamento() throws IOException {
        Equipamento equipamento = new Equipamento();

        System.out.println("Digite o nome do equipamento : ");
        equipamento.setNome(scanner.nextLine());

        equipamentoRepository.save(equipamento);


    }

    public void alterarEquipamento() {
        System.out.println("Alterar equipamento");
        equipamentoRepository.update();
    }

    public void deletarEquipamento() {
        System.out.println("Deletar");
        equipamentoRepository.delete();

    }
}

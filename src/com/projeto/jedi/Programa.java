package com.projeto.jedi;

import com.projeto.jedi.services.EquipamentoService;

import java.io.IOException;
import java.util.Scanner;

public class Programa {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        EquipamentoService equipamentoService = new EquipamentoService();

        Boolean sistema = true;
        while (sistema) {

            System.out.println("Escolha uma opção: ");
            System.out.println("1- Login");
            System.out.println("2- Adicionar equipamento");
            System.out.println("3- Alterar equipamento");
            System.out.println("4- Salvar");
            System.out.println("5- Deletar");

            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    sistema = false;
                    break;
                case "2":
                    equipamentoService.listarEquipamento();
                    break;
                case "3":
                    equipamentoService.alterarEquipamento();
                    break;
                case"4":
                    equipamentoService.salvarEquipamento();
                    break;
                case"5":
                    equipamentoService.deletarEquipamento();
                    break;
                default:
                    System.out.println("Opção inválido");
            }
        }
    }
}
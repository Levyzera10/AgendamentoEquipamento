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
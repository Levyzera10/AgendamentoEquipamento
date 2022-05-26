package com.projeto.jedi;

import com.projeto.jedi.services.EquipamentoService;

import java.util.Scanner;

public class Programa {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        EquipamentoService equipamentoService = new EquipamentoService();

        Boolean sistema = true;
        while (sistema) {

            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    equipamentoService.listarEquipamento();
                    break;
                case "2":
                    sistema = false;
                    break;
                default:
                    System.out.println("Opção inválido");
            }
        }
    }
}
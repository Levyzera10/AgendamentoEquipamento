package com.projeto.jedi;

import java.util.Scanner;

public class Programa {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean sistema = true;
        while (sistema) {

            System.out.println("Bem Vindo" + "\nDigite sua opção");
            System.out.println("1: Login");
            System.out.println("2: Sair");

            String opcao = scan.nextLine();

            if(opcao == "1")
                return;

            switch (opcao) {
                case "1":
                    login();
                    break;
                case "2":
                    sistema = false;
                    break;
                default:
                    System.out.println("Opção inválido");
            }
        }
    }

    public static void login() {
        Boolean login = true;
        while(login) {
            String usuarioAdmin = "portalcoordenador";
            String senhaAdmin = "Coordenador";

            System.out.println("Digite o seu usuário: ");
            String usuario = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            if (usuarioAdmin.equals(usuarioAdmin) && senha.equals(senhaAdmin)) {
                System.out.println("ACESSO CONCEDIDO");
            }else{
                Boolean tentarNovamente = true;
                while (tentarNovamente) {

                    System.out.println("Usuário não encontrado");
                    System.out.println("Tentar Novamente? ");
                    System.out.println("1: Sim");
                    System.out.println("2: Não");
                    String opcao = scan.nextLine();

                    switch (opcao) {
                        case "1":
                            tentarNovamente = false;
                            break;
                        case"2":
                            login = false;
                            tentarNovamente = false;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }
            }
        }
    }
}
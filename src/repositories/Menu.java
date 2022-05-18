package repositories;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Boolean menu = true;
        while (menu) {

            System.out.println("Portal do Coordenador " + "\nDigite uma opção");
            System.out.println("|=================================|");
            System.out.println("| Opção 1 - Login                 |");
            System.out.println("| Opção 2 - Sair                  |");
            System.out.println("|=================================|");

            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    login();
                    break;

                case "2":
                    menu = false;
                    break;
                default:
                    System.out.println("Número Inválido");
            }
        }

    }

    public static void login() {
        Boolean login = true;
        while (login) {
            String usuarioAdmin = "portalcoordenador";
            String senhaAdmin = "Coordenador";

            System.out.println("Digite um usuário: ");
            String usuario = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            if (usuario.equals(usuarioAdmin) && senha.equals(senhaAdmin)) {
                System.out.println("Usuário logado");
                System.out.println("ACESSO PERMITIDO");
            } else {
                Boolean tentarNovamente = true;
                while (tentarNovamente) {

                    System.out.println("Usuário não encontrado");
                    System.out.println("Deseja tentar novamente");
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
                            System.out.println("Número Inválido");
                    }
                }
            }
        }
    }
}

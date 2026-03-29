package Aula_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaisController controller = new PaisController();
        PaisView view = new PaisView();

        int escolha = -1;

        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar país");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover da lista");
            System.out.println("4. Limpar lista");
            System.out.println("0. Sair");

            System.out.println("Qual a sua escolha?");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:{
                    System.out.println("Qual o nome do país? ");
                    String nome = sc.nextLine();
                    System.out.println("Qual o nome da capital? ");
                    String capital = sc.nextLine();
                    controller.adicionarPaises(nome,capital);
                    break;
                }
                case 2:{
                    controller.imprimirPaises();
                    break;
                }
                case 3:{
                    System.out.println("Qual o nom do país que deseja remover?");
                    String nomeRemover = sc.nextLine();
                    controller.removerPais(nomeRemover);
                    break;
                }
                case 4:{
                    controller.limparPais();
                    System.out.println("Limpeza feita!");
                    break;
                }
            }
        }while (escolha != 0);
    }
}

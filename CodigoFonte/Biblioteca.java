import java.util.Scanner;

public class Biblioteca {

    public void mostrarTelaBiblioteca(Scanner scanner) {
        int opcao;

        do {
            System.out.println("------------------------------------"); 
            System.out.println("|           UFPA MUSIC             |");
            System.out.println("------------------------------------");    
            System.out.println("|         TELA BIBLIOTECA          |");
            System.out.println("------------------------------------");    
            System.out.println("+                                  +");
            System.out.println("+      1 - Playlist                +");
            System.out.println("+      2 - Artistas                +");
            System.out.println("+      3 - Álbuns                  +");
            System.out.println("+      4 - Músicas                 +");
            System.out.println("+      5 - Downloads               +");
            System.out.println("+      6 - Adições recentes        +");
            System.out.println("+      0 - Voltar para Home        +");
            System.out.println("+                                  +");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Estrutura if-else para verificar a opção escolhida
            if (opcao == 1) {
                System.out.println("Playlist");
            } else if (opcao == 2) {
                System.out.println("Artistas");
            } else if (opcao == 3) {
                System.out.println("Álbuns");
            } else if (opcao == 4) {
                System.out.println("Músicas");
            } else if (opcao == 5) {
                System.out.println("Downloads");
            } else if (opcao == 6) {
                System.out.println("Adições recentes");
            } else if (opcao == 0) {
                System.out.println("Volta para Tela de Home...");
            } else {
                System.out.println("Opção inválida. Tente outra opção.");
            }
        } while (opcao != 0);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inicio inicio = new Inicio();  // Criação da instância da tela de início
        Biblioteca biblioteca = new Biblioteca();
        Pesquisar pesquisa = new Pesquisar();

        int opcao;

        while (true) {
            // Exibindo o menu
            System.out.println("------------------------------------"); 
            System.out.println("|           UFPA MUSIC             |");
            System.out.println("------------------------------------");    
            System.out.println("|           TELA HOME              |");
            System.out.println("------------------------------------");
            System.out.println("+                                  +");
            System.out.println("+         1 - Inicio               +");
            System.out.println("+         2 - Biblioteca           +");
            System.out.println("+         3 - Pesquisar            +");
            System.out.println("+         0 - Fechar               +");
            System.out.println("+                                  +");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            // Lendo a opção do usuário
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Estrutura if-else para verificar a opção escolhida
            if (opcao == 1) {
                // Vai para a tela de Inicio ao selecionar 1 
                System.out.println("Tela 'Inicio'.");
                inicio.mostrarTelaInicio(scanner);  // Chama a tela de início
            } else if (opcao == 2) {
                // Vai para a tela da Biblioteca ao selecionar 2
                System.out.println("Tela 'Biblioteca'.");
                biblioteca.mostrarTelaBiblioteca(scanner);
            } else if (opcao == 3) {
                // Vai para a tela de Pesquisa ao selecionar 3
                System.out.println("Tela 'Pesquisar'.");
                pesquisa.mostrarTelaPesquisa(scanner);
            } else if (opcao == 0) {
                // Fecha o aplicativo
                System.out.println("Fechou o App.");
                scanner.close();
                return; // Encerra o programa
            } else {
                // Opção inválida
                System.out.println("Opção inválida. Tente outra opção do menu.");
            }
        }
    }
}

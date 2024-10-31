import java.util.Scanner;

public class Inicio {
    // Reproduções recentes e recomendações
    private Reproducoes reproducoesRecentes = new Reproducoes();
    private Recomendacoes recomendacoes = new Recomendacoes();
    private Conta conta = new Conta();

    // Exibe a tela de início e permite voltar ao menu principal
    public void mostrarTelaInicio(Scanner scanner) {
        int opcao;

        do {
            System.out.println("------------------------------------"); 
            System.out.println("|           UFPA MUSIC             |");
            System.out.println("------------------------------------");    
            System.out.println("|           TELA INICIO            |");
            System.out.println("------------------------------------"); 
            System.out.println("+                                  +");
            System.out.println("+      1 - Reproduções Recentes    +");
            System.out.println("+      2 - Recomendações           +");
            System.out.println("+      3 - Entrar na Conta         +");
            System.out.println("+      0 - Voltar para Home        +");
            System.out.println("+                                  +");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            // Estrutura if-else para verificar a opção escolhida
            if (opcao == 1) {
                reproducoesRecentes.mostrarTelaReproducoesRecentes();
            } else if (opcao == 2) {
                recomendacoes.mostrarTelaRecomendacoes(scanner);
            } else if (opcao == 3) {
                conta.mostrarTelaConta();
            } else if (opcao == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida! Entre as opções do menu.");
            }
        } while (opcao != 0);
    }
}

import java.util.Scanner;

public class Pesquisar {

    //A ideia aqui é a pesquisa retornar o que tiver na biblioteca, recomendados etc
    


    public void mostrarTelaPesquisa(Scanner scanner){
        int opcao;

        do {
        System.out.println("------------------------------------"); 
        System.out.println("|           UFPA MUSIC             |");
        System.out.println("------------------------------------");    
        System.out.println("|           TELA PESQUISA          |");
        System.out.println("------------------------------------");
        System.out.println("+                                  +");
        System.out.println("+    1 - Digite o que procura      +");
        System.out.println("+    0 - Voltar para Tela Home     +");
        System.out.println("+                                  +");
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Esolha uma opção: ");
        opcao = scanner.nextInt();


        }while (opcao != 0);

        

    }

}
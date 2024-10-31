import java.util.Scanner;

public class Recomendacoes {
    // Instância da classe Album para ações do álbum
    Album acoesAlbum = new Album(null, 0, null);

    // Método para exibir a tela de recomendações e interagir com o usuário
    public void mostrarTelaRecomendacoes(Scanner scanner) {
        int opcao;
        do {
            System.out.println("-----------------------------------------"); 
            System.out.println("|                UFPA MUSIC             |");
            System.out.println("-----------------------------------------");    
            System.out.println("|           TELA RECOMENDAÇÕES          |");
            System.out.println("-----------------------------------------\n");
            System.out.println("++ Lista de Recomendações de Gêneros, Artistas e Album ++\n");
            System.out.println("A - ROCK - Artista: Ira! - Album: Acústico Ira!");
            System.out.println("B - POP - Artista: Pabllo Vittar - Album: Não Para Não");
            System.out.println("C - RAP - Artista: FBC - Album: BAILE");
            System.out.println("D - KPOP - Artista: TWICE - Album: READY TO BE");
            System.out.println("E - TECHNO - Artista: PICTUREPLANE - Album: TREE PHYSICAL");
            System.out.println("-----------------------------------------"); 
            System.out.println("+ Qual opção deseja realizar com as recomendações? +");
            System.out.println("+                                  +");
            System.out.println("+  1 - Salvar em Biblioteca        +");
            System.out.println("   2 - Reproduzir Album do Artista +");
            System.out.println("+  0 - Voltar para Tela Home       +");
            System.out.println("+                                  +");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Estrutura if-else para verificar a opção escolhida
            if (opcao == 1) {
                System.out.println("Escolha qual album deseja salvar em biblioteca:... ");
                // salvarEmBiblioteca(scanner); // Implementar o método de salvar em biblioteca
            } else if (opcao == 2) {
                System.out.println("Escolha qual album deseja reproduzir: ");
                // Reproduzir o álbum do artista de forma aleatória ou em ordem
                acoesAlbum.reproduzirMusicaDoAlbumEmAleatorio();
                acoesAlbum.reproduzirMusicaDoAlbumEmOrdem();
            } else if (opcao == 0) {
                System.out.println("Voltando para Tela Home...");
            } else {
                System.out.println("Opção inválida! Entre as opções do menu.");
            }
        } while (opcao != 0);
    }
}


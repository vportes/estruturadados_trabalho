import java.util.Scanner;

/*
Aluno: Vinícius Portes Carvalho do Nascimento
 */

public class trabalho {
    static String nomes[][] = new String[6][4];
    static Scanner teclado = new Scanner(System.in);

    public static void inserir(){
        System.out.println("Insira os elementos da matriz: ");
        for (int linha = 0; linha < nomes.length; linha++){
            for(int coluna = 0; coluna < nomes[linha].length; coluna++){
                System.out.print("Linha " + linha + " coluna " + coluna+": ");
                nomes[linha][coluna] = teclado.nextLine();
            }
        }
    }

    public static void mostrarNomes(){
        for (int linha = 0; linha < nomes.length; linha++) {
            for (int coluna = 0; coluna < nomes[linha].length; coluna++) {
                System.out.println("Linha "+linha+" coluna "+coluna+" = "+nomes[linha][coluna]);
            }
        }
    }

    public static void pesquisarNome(){
        boolean encontrado = false;
        String buscar = "";
        System.out.print("Digite o nome a ser encontrado: ");
        buscar = teclado.nextLine();
        for (int linha = 0; linha < nomes.length; linha++) {
            for (int coluna = 0; coluna < nomes[linha].length; coluna++) {
                if (buscar.equals(nomes[linha][coluna])){
                    System.out.println(buscar+" está na linha "+linha +", coluna "+coluna+".");
                    encontrado = true;
                }
            }
        }
        if (!encontrado){
            System.out.println("Nome não encontrado.");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("\n1 - Inserir nomes");
            System.out.println("2 - Mostrar nomes");
            System.out.println("3 - Pesquisar nome");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao){
                case 1:
                    inserir();
                    break;
                case 2:
                    mostrarNomes();
                    break;
                case 3:
                    pesquisarNome();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }
    }
}
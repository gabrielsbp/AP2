import java.util.Scanner;

public class DetectorConteudo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        if (contemPalavrasImproprias(frase)) {
            System.out.println("Conteúdo impróprio.");
        } else {
            System.out.println("Conteúdo liberado.");
        }
    }

    /**
     * Método para verificar se uma frase contém palavras impróprias como "sexo" ou "sexual".
     * @param frase A frase a ser verificada.
     * @return true se a frase contém palavras impróprias, false caso contrário.
     */
    public static boolean contemPalavrasImproprias(String frase) {
        String fraseLowerCase = frase.toLowerCase();

        return fraseLowerCase.contains("sexo") || fraseLowerCase.contains("sexual");
    }
}
import java.util.Scanner;

public class InversorFrases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        String fraseSemEspacos = frase.replaceAll("\\s+", "");

       String fraseInvertida = inverterFrase(fraseSemEspacos);

        System.out.println("Frase invertida: " + fraseInvertida);
    }

    /**
     * Método para inverter uma String.
     * @param str A String a ser invertida.
     * @return A String invertida.
     */
    public static String inverterFrase(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
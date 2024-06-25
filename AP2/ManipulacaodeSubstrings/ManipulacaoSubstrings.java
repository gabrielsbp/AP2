import java.util.Scanner;

public class ManipulacaoSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        scanner.close();

        String substringExcluindoUltimo = obterSubstringExcluindoUltimo(input);
        System.out.println("Substring excluindo o último caractere: " + substringExcluindoUltimo);
    }

    /**
     * Método para obter um substring de uma string excluindo o último caractere.
     * @param str A string original.
     * @return O substring composto por todos os caracteres exceto o último.
     */
    public static String obterSubstringExcluindoUltimo(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            return str.substring(0, str.length() - 1);
        }
    }
}
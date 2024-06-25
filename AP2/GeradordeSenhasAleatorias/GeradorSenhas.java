import java.util.Random;

public class GeradorSenhas {

    public static void main(String[] args) {
        GeradorSenhas generator = new GeradorSenhas();

        String senha = generator.gerarSenhaNumerica();
        System.out.println("Senha gerada: " + senha);
    }

    public String gerarSenhaNumerica() {
        Random random = new Random();

        int numDigitos = random.nextInt(6) + 5; 

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < numDigitos; i++) {
            int digito = random.nextInt(10); 
            senha.append(digito);
        }

        return senha.toString();
    }
}
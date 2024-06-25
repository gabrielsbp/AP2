import java.util.Random;

public class SimuladorDados {

    public static void main(String[] args) {
        SimuladorDados simulator = new SimuladorDados();

        int resultadoFinal = simulator.simularJogadas();

        System.out.println("Resultado final da simulação: " + resultadoFinal);
    }
       public int simularJogadas() {
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < 3; i++) {
           int resultadoJogada = random.nextInt(6) + 1;
            System.out.println("Jogada " + (i + 1) + ": " + resultadoJogada);
            soma += resultadoJogada;
        }

        return soma;
    }
}
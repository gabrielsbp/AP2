import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecoFarmacia {

    public static void main(String[] args) {
        PrecoFarmacia priceIncrease = new PrecoFarmacia();

        priceIncrease.aumentarPrecos();
    }

    public void aumentarPrecos() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true) {
            System.out.print("Digite o valor do produto (ou 0 para encerrar): ");
            double valorProduto = scanner.nextDouble();

            if (valorProduto == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            double novoPreco = valorProduto * 1.12;

            String novoPrecoFormatado = df.format(novoPreco);
            novoPreco = Double.parseDouble(novoPrecoFormatado);

            System.out.println("Novo preço com aumento de 12%: R$ " + novoPreco);
        }

        scanner.close();
    }
}
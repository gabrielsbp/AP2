import java.util.Scanner;

public class ConversorRadianos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em radianos: ");
        double anguloRadianos = scanner.nextDouble();

         scanner.close();

        double anguloGraus = Math.toDegrees(anguloRadianos);

         System.out.println(anguloRadianos + " radianos é equivalente a " + anguloGraus + " graus.");
    }
}
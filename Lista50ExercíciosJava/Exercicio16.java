import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do veículo: ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado.");
        }

        scanner.close();
    }
}

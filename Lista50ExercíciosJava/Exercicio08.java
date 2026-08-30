import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.println("Dobro: " + dobro);
        System.out.println("Metade: " + metade);

        scanner.close();
    }
}

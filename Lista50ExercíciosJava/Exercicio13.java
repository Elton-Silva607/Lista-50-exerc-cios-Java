import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        scanner.close();
    }
}

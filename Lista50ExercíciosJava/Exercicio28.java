import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque <= saldo) {
            double saldoRestante = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo restante: R$ " + saldoRestante);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        scanner.close();
    }
}

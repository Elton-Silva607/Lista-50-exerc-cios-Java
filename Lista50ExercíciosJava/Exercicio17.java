import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        scanner.close();
    }
}

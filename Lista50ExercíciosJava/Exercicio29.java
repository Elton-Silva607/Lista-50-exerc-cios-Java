import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorFinal;

        if (valorCompra >= 200) {
            valorFinal = valorCompra * 0.90;
        } else {
            valorFinal = valorCompra;
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);

        scanner.close();
    }
}

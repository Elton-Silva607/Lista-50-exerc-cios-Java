import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto;

        if (valorCompra <= 100) {
            percentualDesconto = 0;
        } else if (valorCompra <= 300) {
            percentualDesconto = 0.05;
        } else if (valorCompra <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total da compra: R$ " + valorTotal);

        scanner.close();
    }
}

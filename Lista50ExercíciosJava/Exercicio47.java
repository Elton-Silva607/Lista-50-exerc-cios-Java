import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("1 - Hambúrguer - R$ 25,00");
        System.out.println("2 - Pizza - R$ 40,00");
        System.out.println("3 - Salada - R$ 18,00");
        System.out.println("4 - Refrigerante - R$ 8,00");

        System.out.print("Digite a opção escolhida: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        String nomeItem;
        double preco;

        switch (opcao) {
            case 1:
                nomeItem = "Hambúrguer";
                preco = 25.00;
                break;
            case 2:
                nomeItem = "Pizza";
                preco = 40.00;
                break;
            case 3:
                nomeItem = "Salada";
                preco = 18.00;
                break;
            case 4:
                nomeItem = "Refrigerante";
                preco = 8.00;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        double valorTotal = preco * quantidade;

        System.out.println("Item: " + nomeItem);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total do pedido: R$ " + valorTotal);

        scanner.close();
    }
}

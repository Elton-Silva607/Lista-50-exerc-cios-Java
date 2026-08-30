import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e mora em " + cidade + ".");

        scanner.close();
    }
}

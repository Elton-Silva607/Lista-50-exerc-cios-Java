import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você possui CNH? (true/false): ");
        boolean temCnh = scanner.nextBoolean();

        if (idade >= 18 && temCnh) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = scanner.nextInt();

        if (idade <= 10) {
            System.out.println("Categoria: infantil.");
        } else if (idade <= 15) {
            System.out.println("Categoria: juvenil.");
        } else if (idade <= 20) {
            System.out.println("Categoria: júnior.");
        } else if (idade <= 35) {
            System.out.println("Categoria: profissional.");
        } else {
            System.out.println("Categoria: sênior.");
        }

        scanner.close();
    }
}

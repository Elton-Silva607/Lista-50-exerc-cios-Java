import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do usuário: ");
        double salario = scanner.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salário baixo.");
        } else if (salario <= 3000) {
            System.out.println("Salário médio.");
        } else if (salario <= 7000) {
            System.out.println("Salário bom.");
        } else {
            System.out.println("Salário alto.");
        }

        scanner.close();
    }
}

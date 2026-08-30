import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite a presença do aluno (%): ");
        double presenca = scanner.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}

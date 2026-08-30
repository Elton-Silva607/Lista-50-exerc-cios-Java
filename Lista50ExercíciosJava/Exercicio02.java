import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        System.out.println("O aluno " + nome + ", de " + idade + " anos, obteve nota final " + notaFinal + ".");

        scanner.close();
    }
}

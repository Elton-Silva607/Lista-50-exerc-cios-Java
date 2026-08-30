import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("O funcionário está ativo? (true/false): ");
        boolean ativo = scanner.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Ativo na empresa: " + (ativo ? "Sim" : "Não"));

        scanner.close();
    }
}

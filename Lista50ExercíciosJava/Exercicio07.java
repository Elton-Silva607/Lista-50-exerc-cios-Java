import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor ganho por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite quantas horas trabalhou no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("Salário bruto: R$ " + salarioBruto);

        scanner.close();
    }
}

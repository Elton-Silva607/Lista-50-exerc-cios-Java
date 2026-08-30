import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Planos disponíveis:");
        System.out.println("1 - Básico - R$ 29,90 por mês");
        System.out.println("2 - Intermediário - R$ 59,90 por mês");
        System.out.println("3 - Premium - R$ 99,90 por mês");

        System.out.print("Digite o plano escolhido: ");
        int plano = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        String nomePlano;
        double valorMensal;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Intermediário";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                System.out.println("Plano inválido.");
                scanner.close();
                return;
        }

        double valorSemDesconto = valorMensal * meses;
        double valorDesconto = 0;
        double valorFinal = valorSemDesconto;

        if (meses >= 12) {
            valorDesconto = valorSemDesconto * 0.10;
            valorFinal = valorSemDesconto - valorDesconto;
        }

        System.out.println("Nome do plano: " + nomePlano);
        System.out.println("Valor mensal: R$ " + valorMensal);
        System.out.println("Quantidade de meses: " + meses);
        System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final do contrato: R$ " + valorFinal);

        scanner.close();
    }
}

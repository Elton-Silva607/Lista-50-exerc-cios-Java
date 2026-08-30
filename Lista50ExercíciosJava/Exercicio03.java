import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.println("Sua idade aproximada é " + idadeAproximada + " anos.");

        scanner.close();
    }
}

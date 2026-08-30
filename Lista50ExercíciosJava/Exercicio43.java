import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";

        System.out.println("O número " + numero + " é " + resultado + ".");

        scanner.close();
    }
}

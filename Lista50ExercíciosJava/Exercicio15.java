import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está muito quente hoje.");
        }

        scanner.close();
    }
}

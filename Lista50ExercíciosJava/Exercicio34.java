import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 15) {
            System.out.println("Frio.");
        } else if (temperatura <= 25) {
            System.out.println("Agradável.");
        } else if (temperatura <= 35) {
            System.out.println("Quente.");
        } else {
            System.out.println("Muito quente.");
        }

        scanner.close();
    }
}

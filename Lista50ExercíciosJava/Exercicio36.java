import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: peso normal.");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: sobrepeso.");
        } else {
            System.out.println("Classificação: obesidade.");
        }

        scanner.close();
    }
}

package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n]; // vetor de n posições

        // Armazenando no array
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        // Imprimindo os elemtnos do array
        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("SOMA: ");

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.printf("%.2f%n", sum);

        double avg = sum / n;

        System.out.printf("MEDIA: %.2f", avg);

        sc.close();
    }
}

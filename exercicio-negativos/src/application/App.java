package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        // como vou saber a quantia de indices que tem numeros negativos?

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0)
                System.out.println(numbers[i]);
        }

        sc.close();
    }
}

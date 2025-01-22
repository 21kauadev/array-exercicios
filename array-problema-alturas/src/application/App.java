package application;

import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            sc.nextLine(); // para pegar o enter pendente
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            persons[i] = new Person(name, age, height);
        }

        double accHeights = 0;
        int lessThan16 = 0; // pra saber quantos são menores de 16. implementando regrinha de três

        for (int i = 0; i < n; i++) {
            accHeights += persons[i].getHeight();
            if (persons[i].getAge() < 16)
                lessThan16++;
        }

        String[] namesOfPeopleUnder16 = new String[lessThan16];

        // names of people tem 2 indices. persons tem 5.
        // como eu uso o i pra percorrer sobre persons, obivamente buga, o namesofpeople
        // tem menos indices.
        // soluçao talvez seja eu fazer outro array pra saber em quais indices ta os
        // nomes dos menores de 16
        // ou numa variavel talvez, e ir incrementando ela

        int indexOfPeoplesUnder16 = 0;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() < 16) {
                // armazenar o nome da pessoa menor que 16
                namesOfPeopleUnder16[indexOfPeoplesUnder16] = persons[i].getName();

                indexOfPeoplesUnder16++; // pro indice ir aumentando somente se tiver pessoa menor de 16
            }
        }

        double avgHeight = accHeights / n;

        // less than 16 * 100 / n - regra de 3 pra achar porcentagem
        String percentage = lessThan16 * 100 / n + "%";

        System.out.printf("Altura média: %.2f%n", avgHeight);
        System.out.println("Pessoas com menos de 16 anos: " + percentage);

        for (int i = 0; i < lessThan16; i++) {
            System.out.println(namesOfPeopleUnder16[i]);
        }

        sc.close();
    }
}

package day02;

import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
        System.out.println("\nIsPrimeNumber");
        System.out.println("\nAdjon meg egy nemnegatív egész számot!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrimeNumber(number) ? "Prímszám" : "Nem prímszám");
    }
}

package day02;

import java.util.Scanner;

public class MathematicsMain {
    public static void main(String[] args) {
        System.out.println("\nIsPrimeNumber");
        System.out.println("\nAdjon meg egy nemnegatív egész számot!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrimeNumber(number) ? "Prímszám" : "Nem prímszám");
    }
}

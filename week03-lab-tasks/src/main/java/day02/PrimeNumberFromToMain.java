package day02;

import java.util.Scanner;

public class PrimeNumberFromToMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMettől meddig szeretné a prímszámokat megjeleníteni?");
        System.out.println("Adja meg a két számot szóközzel elválasztav!");
        int numberFrom = scanner.nextInt();
        int numberTo = scanner.nextInt();
        scanner.nextLine();
        boolean increase = numberFrom <= numberTo;
        System.out.println("Hány szám legyen egy sorban?");
        int numbersInLine = scanner.nextInt();
        System.out.println();

        PrimeNumberFromTo primeNumberFromTo = new PrimeNumberFromTo();
        primeNumberFromTo.getPrimes(numberFrom, numberTo, numbersInLine, increase, primeNumberFromTo);
    }
}

package day03;

import java.util.Scanner;

public class GuessTheNumber {
    private int randomNumber;
    private int givenNumber;
    private int tryMax;

    public void setTryMax(int tryMax) {
        this.tryMax = tryMax;
    }

    public int getTryMax() {
        return tryMax;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void printResult() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= tryMax; i++) {
            System.out.print(tryMax + "/" + i + ": ");
            givenNumber = scanner.nextInt();
            scanner.nextLine();
            if (givenNumber == randomNumber) {
                System.out.println("Talált");
                return;
            } else {
                System.out.print(givenNumber < randomNumber ? "Ez kisebb" : "Ez nagyobb");
                System.out.println(i < tryMax ? ". Próbálja újra!" : ". Nincs több lehetősége.\nA szám, amire gondoltam: " + randomNumber);
            }
        }
    }
}

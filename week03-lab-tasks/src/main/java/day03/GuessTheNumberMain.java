package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int rndMax = 100;
        int tryMax = 6;
        guessTheNumber.setTryMax(tryMax);
        System.out.print("\nMelyik számra gondoltam 1 és " + rndMax + " között? (");
        System.out.println(tryMax + " lehetősége van.)");
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(rndMax) + 1;
        guessTheNumber.setRandomNumber(randomNumber);
        guessTheNumber.printResult();
    }
}

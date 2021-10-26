package day02;

public class PrimeNumberFromTo {
    public boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void getPrimes(int numberFrom, int numberTo, int numbersInLine, boolean increase, PrimeNumberFromTo primeNumberFromTo) {
        int numberOfPrimes = 0;
        for (int i = numberFrom; increase ? i <= numberTo : i >= numberTo; i = increase ? i + 1 : i - 1) {
            if (primeNumberFromTo.isPrimeNumber(i)) {
                numberOfPrimes++;
                System.out.print(numberOfPrimes == 1 ? i : (numberOfPrimes % numbersInLine == 0 ? "\n" + i : ", " + i));
            }
        }
        System.out.println((numberOfPrimes > 0 ? "\n\n" : "") + numberFrom + " és " + numberTo + " között összesen " + numberOfPrimes + " prímszám van.");
    }
}


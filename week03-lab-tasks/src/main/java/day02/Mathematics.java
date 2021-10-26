package day02;

public class Mathematics {
    public boolean isPrimeNumber(int number) {
                for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return (number == 0 || number == 1 ? false : true);
    }
}

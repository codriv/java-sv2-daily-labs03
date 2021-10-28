package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.openFreeCells();
        String freeCells = "";
        for (int i = 0; i < prison.getCells().length; i++) {
            freeCells += prison.getCells()[i] ? i + 1 + ", " : "";
        }
        System.out.println("\nA nyitott cellák " + prison.getCells().length + " nap után:");
        System.out.println(freeCells.substring(0, (freeCells.length() - 2)));
    }
}

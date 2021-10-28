package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prison {

    private boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for ( int i = 0; i < cells.length; i++) {
            for (int j = i; j < cells.length; j += i + 1) {        // start from nth cell
//            for (int j = 0; j < cells.length; j += i + 1) {          // start from 1st cell
                cells[j] = !cells[j];
            }
//            System.out.println(Arrays.toString(cells));              // print steps
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}


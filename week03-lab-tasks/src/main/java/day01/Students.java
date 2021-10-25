package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<Integer> heights = new ArrayList<>();

    public void addHeight (int height) {
        heights.add(height);
    }

    public boolean isHeightsIncreasing() {
        boolean increase = true;
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i) > heights.get(i - 1)) {
                increase = true;
            } else {
                increase = false;
                break;
            }
        }
        return increase;
    }
}

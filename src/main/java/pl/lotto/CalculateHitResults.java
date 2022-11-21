package pl.lotto;

import java.util.List;

public class CalculateHitResults {

    public int calculateHitResultsOfUser(List<Integer> random, List<Integer> numbersFromUser) {
        int hitCounter = 0;

        for (Integer numberFromUser : numbersFromUser) {
            for (int i = 0; i < 6; i++) {
                if (random.get(i) == numberFromUser) {
                    hitCounter++;
                }

            }
        }
        return hitCounter;
    }

}

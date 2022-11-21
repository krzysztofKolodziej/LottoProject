package pl.lotto;


import java.util.ArrayList;
import java.util.List;

public class LottoNumberGenerator {

    public List<Integer> generateRandomNumber() {
        int min = 1;
        int max = 99;

        List<Integer> listRandom = new ArrayList<>();

        while (listRandom.size() < 6) {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (listRandom.contains(random)) {
                continue;
            }
            listRandom.add(random);
        }
        return listRandom;
    }

    public void drawnNumbers(List<Integer> random) {

        System.out.println("Drawn numbers: ");

        for (int i = 0; i < 6; i++) {
            System.out.println(random.get(i));
        }
    }

}

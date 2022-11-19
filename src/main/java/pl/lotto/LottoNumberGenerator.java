package pl.lotto;


import java.util.ArrayList;

public class LottoNumberGenerator {

    public ArrayList<Integer> generateRandomNumber() {
        int min = 1;
        int max = 99;

        ArrayList<Integer> listRandom = new ArrayList<>();

        while (listRandom.size() < 6) {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (listRandom.contains(random)) {
                continue;
            }
            listRandom.add(random);
        }
        return listRandom;
    }

    public void drawnNumbers() {

        System.out.println("Drawn numbers: ");

        for (int i = 0; i < 6; i++) {
            System.out.println(generateRandomNumber().get(i));
        }
    }

}

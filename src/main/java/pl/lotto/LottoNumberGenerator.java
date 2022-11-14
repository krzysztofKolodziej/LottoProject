package pl.lotto;

import java.util.ArrayList;

public class LottoNumberGenerator {

    public ArrayList<Integer> generateRandomNumber() {
        int min = 1;
        int max = 99;

        ArrayList<Integer> listaRandom = new ArrayList<Integer>();

        while (listaRandom.size() < 6) {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (listaRandom.contains(random)) {
                continue;
            }
            listaRandom.add(random);
        }
        return listaRandom;
    }

}

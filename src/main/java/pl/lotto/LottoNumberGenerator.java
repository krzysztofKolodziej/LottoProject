package pl.lotto;

import java.util.ArrayList;
import java.util.Map;

public class LottoNumberGenerator {
    public ArrayList<Integer> generateRandomNumber(){

        int min = 1;
        int max = 99;

        ArrayList<Integer> listaRandom =new ArrayList<Integer>();

        for (int i=1; i<=6; i++) {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            listaRandom.add(random);
        }
        return listaRandom;
    }

}

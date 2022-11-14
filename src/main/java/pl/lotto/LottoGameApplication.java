package pl.lotto;

import java.io.IOException;
import java.util.ArrayList;


public class LottoGameApplication {

    public static void main(String[] args) throws IOException {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        ArrayList<Integer> random = lottoNumberGenerator.generateRandomNumber();
        NumberReceiver numberReceiver = new NumberReceiver();
        ArrayList<Integer> numbersFromUser = numberReceiver.retrieveNumbersFromUser();

        // walidacja czy są duplikaty od uzytkownika, czy liczby są z zakresu 1-99

        int hitCounter = calculateHitResults(random, numbersFromUser);
        System.out.println("Wylosowane liczby: ");

        for (int i = 0; i < 6; i++) {
            System.out.println(random.get(i));
        }

        System.out.println("Ilość trafień " + hitCounter);

        if (hitCounter >= 3) {
            System.out.println("Wygrałeś");
        } else System.out.println("Przegrałeś");
    }

    private static int calculateHitResults(ArrayList<Integer> random, ArrayList<Integer> numbersFromUser) {
        int hitCounter = 0;

        for (Integer numberFromUser : numbersFromUser
        ) {
            for (int i = 0; i < 6; i++) {
                if (random.get(i) == numberFromUser) {
                    hitCounter++;
                }

            }
        }
        return hitCounter;
    }


}

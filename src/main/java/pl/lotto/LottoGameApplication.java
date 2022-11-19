package pl.lotto;

import java.io.IOException;
import java.util.ArrayList;


public class LottoGameApplication {

    public static void main(String[] args) throws IOException {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        ArrayList<Integer> random = lottoNumberGenerator.generateRandomNumber();
        NumberReceiver numberReceiver = new NumberReceiver();
        ArrayList<Integer> numbersFromUser = numberReceiver.retrieveNumbersFromUser();
        CalculateHitResults calculateHitResults = new CalculateHitResults();
        int hitCounter = calculateHitResults.calculateHitResultsOfUser(random, numbersFromUser);
        lottoNumberGenerator.drawnNumbers();
        System.out.println("Number of hits: " + hitCounter);
        CheckWin checkWin = new CheckWin();
        checkWin.extracted(hitCounter);
    }


}



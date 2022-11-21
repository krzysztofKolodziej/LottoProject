package pl.lotto;

import java.io.IOException;
import java.util.List;


public class LottoGameApplication {

    public static void main(String[] args) throws IOException {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        NumberReceiver numberReceiver = new NumberReceiver();
        List<Integer> numbersFromUser = numberReceiver.retrieveNumbersFromUser();
        NumberValidator numberValidator = new NumberValidator();
        VaidationResult validate = numberValidator.validate(numbersFromUser);
        if (!validate.isValid()) {
            return;
        }
        CalculateHitResults calculateHitResults = new CalculateHitResults();
        List<Integer> random = lottoNumberGenerator.generateRandomNumber();
        int hitCounter = calculateHitResults.calculateHitResultsOfUser(random, numbersFromUser);
        lottoNumberGenerator.drawnNumbers(random);
        MessageDisplayer messageDisplayer = new MessageDisplayer();
        messageDisplayer.displayNumberOfHitsMessage(hitCounter);
        CheckWin checkWin = new CheckWin();
        checkWin.extracted(hitCounter);
    }


}



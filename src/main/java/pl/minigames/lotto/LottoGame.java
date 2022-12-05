package pl.minigames.lotto;

import java.io.IOException;
import java.util.List;

public class LottoGame {

    List<Integer> numberosFromUser;

    public LottoGame(List<Integer> numbersFromUser) {
        this.numberosFromUser = numbersFromUser;
    }

    public void play() throws IOException {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        List<Integer> numbersFromUser = numberosFromUser;
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

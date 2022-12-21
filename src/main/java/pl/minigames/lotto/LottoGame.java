package pl.minigames.lotto;

import java.io.IOException;
import java.util.List;

public class LottoGame {

    List<Integer> numberosFromUser;

    public LottoGame(List<Integer> numbersFromUser) {
        this.numberosFromUser = numbersFromUser;
    }

    public LottoGameResult play() throws IOException {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        List<Integer> numbersFromUser = numberosFromUser;
        NumberValidator numberValidator = new NumberValidator();
        VaidationResult dupa = numberValidator.validate(numbersFromUser);
        String message = dupa.message;
        if (!dupa.isValid()) {
            return new LottoGameResult(message);
        }
        CalculateHitResults calculateHitResults = new CalculateHitResults();
        List<Integer> random = lottoNumberGenerator.generateRandomNumber();
        int hitCounter = calculateHitResults.calculateHitResultsOfUser(random, numbersFromUser);
        lottoNumberGenerator.drawnNumbers(random);
        MessageDisplayer messageDisplayer = new MessageDisplayer();
        messageDisplayer.displayNumberOfHitsMessage(hitCounter);
        CheckWin checkWin = new CheckWin();
        checkWin.extracted(hitCounter);
        return new LottoGameResult("success");
    }
}

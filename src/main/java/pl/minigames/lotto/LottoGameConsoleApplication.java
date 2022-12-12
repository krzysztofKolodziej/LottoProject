package pl.minigames.lotto;

import java.io.IOException;
import java.util.List;
import pl.minigames.numberreceiver.NumberReceiver;


public class LottoGameConsoleApplication {

    public static void main(String[] args) throws IOException {
        NumberReceiver numberReceiver = new NumberReceiver();
        List<Integer> numbersFromUser = numberReceiver.retrieveNumbersFromUser();
        LottoGame lottoGame = new LottoGame(numbersFromUser);
        LottoGameResult play = lottoGame.play();
        System.out.println(play.getMessage());
    }


}



package pl.minigames.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.minigames.lotto.LottoGame;
import pl.minigames.lotto.LottoGameResult;

@RestController
public class NumberReceiverController {

    // http://localhost:8080/glowa?numbers=999991,12,15,12&name=bartek

    @GetMapping("/glowa")
    public String glowa(@RequestParam List<String> numbers,
                        @RequestParam String name) throws IOException {
        System.out.println(numbers);
        return numbers.toString() + " , " + name;
//        LottoGame lottoGame = new LottoGame();
//        LottoGameResult play = lottoGame.play();
//        return play.getMessage();
    }

    @GetMapping("/dupa")
    public String dupa() {
        return "dupa";
    }
}

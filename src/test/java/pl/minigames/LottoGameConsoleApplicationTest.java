package pl.minigames;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import pl.minigames.lotto.LottoGame;
import pl.minigames.lotto.LottoGameResult;
import static org.assertj.core.api.Assertions.assertThat;

public class LottoGameConsoleApplicationTest {

    @Test
    public void test_six_numbers() throws IOException {
        // given
        String[] args = {};
        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5, 6);
        LottoGame lottoGame = new LottoGame(numbersFromUser);
        // when
        LottoGameResult result = lottoGame.play();
        // then
        String message = result.getMessage(); // "success" albo "error"
//        assert message.equals("asdjhasdoijkasdlkjhasdjkn");
        assertThat(message).isEqualTo("success");
        // jaka wiadomosc wygrales/przegrales/blad
    }

    @Test
    public void test_less_than_six_numbers() throws IOException {
        // given
        String[] args = {};
        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5);
        LottoGame lottoGame = new LottoGame(numbersFromUser);
        // when
        LottoGameResult result = lottoGame.play();
        // then
        String message = result.getMessage(); // "success" albo "error"
        assertThat(message).isEqualTo("less or more than six numbers");
        // jaka wiadomosc wygrales/przegrales/blad
    }

    @Test
    public void test_more_than_six_numbers() throws IOException {
        // given
        String[] args = {};
        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5, 6, 7);
        LottoGame lottoGame = new LottoGame(numbersFromUser);
        // when
        lottoGame.play();
        // then

    }

    @Test
    public void test_duplicated_numbers() throws IOException {
        // given
        String[] args = {};
        List<Integer> numbersFromUser = List.of(1, 1, 3, 4, 5, 6);
        LottoGame lottoGame = new LottoGame(numbersFromUser);
        // when
        lottoGame.play();
        // then
    }

    @Test
    public void test_out_of_range_number() throws IOException {
    }
}
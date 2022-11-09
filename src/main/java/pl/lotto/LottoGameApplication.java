package pl.lotto;

public class LottoGameApplication {

    public static void main(String[] args){
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        double random = lottoNumberGenerator.generateRandomNumber();
    }

}

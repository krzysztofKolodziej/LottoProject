package pl.minigames.lotto;

public class CheckWin {

    public void extracted(int hitCounter) {
        if (hitCounter >= 3) {
            System.out.println("You won");
        } else System.out.println("You lost");
    }
}

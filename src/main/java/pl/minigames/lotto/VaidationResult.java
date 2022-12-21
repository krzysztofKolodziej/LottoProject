package pl.minigames.lotto;

public class VaidationResult {

    boolean valid;
    String message;

    VaidationResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }
    VaidationResult(boolean valid) {
        this.valid = valid;
        this.message = "";
    }

    boolean isValid() {
        return valid;
    }
}

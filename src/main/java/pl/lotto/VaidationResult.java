package pl.lotto;

public class VaidationResult {

    boolean valid;

    VaidationResult(boolean valid) {
        this.valid = valid;
    }

    boolean isValid() {
        return valid;
    }
}

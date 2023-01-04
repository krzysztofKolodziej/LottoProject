package pl.minigames.lotto;

import java.util.ArrayList;
import java.util.List;
import static java.lang.String.join;

public class NumberValidator {

    private final List<String> errors = new ArrayList<>();

    VaidationResult validate(List<Integer> numbersFromUser) {
        if (numbersFromUser.size() != 6) {
            return new VaidationResult(false, "less or more than six numbers");
        }

        for (Integer numberOfUser : numbersFromUser) {
            if (numberOfUser <= 0 || numberOfUser > 99) {
                errors.add(numberOfUser + ": The number must be within the range of 1 to 99");
            }
        }
        List<Integer> collect = numbersFromUser.stream()
                .distinct().toList();
        if (collect.size() != 6) {
            errors.add("Numbers must be unique. Please try again");
        }
        if (errors.size() >= 1) {
            String errorsMessage = join("", errors);
            return new VaidationResult(false, errorsMessage);
        }
        return new VaidationResult(true);
    }
}

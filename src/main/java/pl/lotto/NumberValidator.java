package pl.lotto;

import java.util.List;

public class NumberValidator {

    VaidationResult validate(List<Integer> numbersFromUser) {
        for (Integer numberOfUser : numbersFromUser) {
            if (numberOfUser <= 0 || numberOfUser > 99) {
                System.out.println("The number must be within the range of 1 to 99");
                return new VaidationResult(false);
//                throw new RuntimeException("The number must be within the range of 1 to 99");
            }
            if (numbersFromUser.contains(numberOfUser)) {
                System.out.println("Numbers must be unique. Please try again");
//                throw new RuntimeException("Numbers must be unique. Please try again");
                return new VaidationResult(false);
            }
        }
        return new VaidationResult(true);
    }
}

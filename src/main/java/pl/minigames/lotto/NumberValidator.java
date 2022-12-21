package pl.minigames.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberValidator {

    private final List<String> errors = new ArrayList<>();

    VaidationResult validate(List<Integer> numbersFromUser) {
        if (numbersFromUser.size() != 6) {
//            System.out.println("less or more than six numbers");
            return new VaidationResult(false, "less or more than six numbers");
        }

        for (Integer numberOfUser : numbersFromUser) {
            if (numberOfUser <= 0 || numberOfUser > 99) {
//                System.out.println("The number must be within the range of 1 to 99");
                errors.add(numberOfUser + ": The number must be within the range of 1 to 99");
//                return new VaidationResult(false);
//                throw new RuntimeException("The number must be within the range of 1 to 99");
            }
//            if (numbersFromUser.contains(numberOfUser)) {
//
//            }
        }
        List<Integer> collect = numbersFromUser.stream()
                .distinct()
                .collect(Collectors.toList());
        if (collect.size() != 6) {
//                    System.out.println("Numbers must be unique. Please try again");
            errors.add("Numbers must be unique. Please try again");
//                throw new RuntimeException("Numbers must be unique. Please try again");
//                    return new VaidationResult(false);
        }
        if (errors.size() >= 1) {
//            for(String error: errors){
//                System.out.println(error);
//            }
            String errorsMessage = "";
            for (String error : errors
            ) {
                errorsMessage += error;

            }
            VaidationResult vaidationResult = new VaidationResult(false, errorsMessage);
            return vaidationResult;
        }
        return new VaidationResult(true);
    }
}

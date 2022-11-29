package pl.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberValidator {

    List<String> errors = new ArrayList<>();

    VaidationResult validate(List<Integer> numbersFromUser) {
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
        if(errors.size() > 1){
            for(String error: errors){
                System.out.println(error);
            }
            return new VaidationResult(false);
        }
        return new VaidationResult(true);
    }
}

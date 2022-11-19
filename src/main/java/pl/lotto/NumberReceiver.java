package pl.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberReceiver {

    public ArrayList<Integer> retrieveNumbersFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 6 numbers from 1 to 99");
        ArrayList<Integer> numbersFromUser = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int numberOfUser = Integer.parseInt(reader.readLine());
            if (numberOfUser <= 0 || numberOfUser > 99) {
                System.out.println("The number must be within the range of 1 to 99");
                break;
            }
            if (numbersFromUser.contains(numberOfUser)) {
                System.out.println("Numbers must be unique. Please try again");
                break;
            }
            numbersFromUser.add(numberOfUser);
        }
        return numbersFromUser;
    }
}

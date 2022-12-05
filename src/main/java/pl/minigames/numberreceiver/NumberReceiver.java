package pl.minigames.numberreceiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumberReceiver {

    public List<Integer> retrieveNumbersFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 6 numbers from 1 to 99");
        List<Integer> numbersFromUser = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int numberOfUser = Integer.parseInt(reader.readLine());
            numbersFromUser.add(numberOfUser);
        }
        return numbersFromUser;
    }
}

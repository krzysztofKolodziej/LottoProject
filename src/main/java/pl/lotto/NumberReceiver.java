package pl.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberReceiver {

    public ArrayList<Integer> retrieveNumbersFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Proszę podać 6 liczb od 1 do 99");
        ArrayList<Integer> numbersFromUser = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int s = Integer.parseInt(reader.readLine());
            if (s <= 0 || s > 99) {
                System.out.println("Liczba musi znajdować się w przedziale od 1 do 99");
                break;
            }
            numbersFromUser.add(s);
        }
        return numbersFromUser;
    }
}

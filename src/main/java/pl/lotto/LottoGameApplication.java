package pl.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class LottoGameApplication {

    public static void main(String[] args) throws IOException {

        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        ArrayList random = lottoNumberGenerator.generateRandomNumber();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Proszę podać 6 liczb od 1 do 99");

        ArrayList<Integer> listaUzytkownik =new ArrayList<Integer>();

        for (int i=0; i<6; i++){
            int s = Integer.parseInt(reader.readLine());
            if(s<=0 || s>99){
                System.out.println("Liczba musi znajdować się w przedziale od 1 do 99");
                break;
            }
            listaUzytkownik.add(s);
        }

        int iloscTrafien =0;

        for (Integer s: listaUzytkownik
             ) {
            for (int i=0; i<6; i++){
                if (random.get(i) ==s){
                    iloscTrafien++;
                }

            }
        }
        System.out.println("Wylosowane liczby: ");

       for (int i=0; i<6; i++){
           System.out.println(random.get(i));
       }

        System.out.println("Ilość trafień "+iloscTrafien);

        if (iloscTrafien >=3){
            System.out.println("Wygrałeś");
        }
        else System.out.println("Przegrałeś");
    }

}

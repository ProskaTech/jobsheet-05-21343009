/**
 * Created by 21343009-Mukhtarijal
 */
package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "", hoby = "";

        try {
            System.out.println("Nama anda : ");
            name = dataIn.readLine();
            System.out.println("Hobi anda : ");
            hoby = dataIn.readLine();
        }

        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
    }
    System.out.println("Jadi hobi anda "+hoby+". Hobi yang bagus "+name);
}
}
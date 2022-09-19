/**
 * Created by 21343009_Mukhtarijal
 */
package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderTugas {
    public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

    String word1, word2, word3;
    System.out.println("Program Menampilkan output dari input user");

    try {
        System.out.print("Enter word1 : ");
        word1 = dataIn.readLine();

        System.out.print("Enter word2 : ");
        word2 = dataIn.readLine();

        System.out.print("Enter word3 : ");
        word3 = dataIn.readLine();

        System.out.println("\n" + word1 + " " + word2 + " " + word3);
    }

        catch (Exception e) {
        System.out.println("Gagal membaca keyboard");
       }
    }
}

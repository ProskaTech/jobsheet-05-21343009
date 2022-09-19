/**
 * Created by 21343009_Mukhtarijal
 */
package satutiga;

import java.util.Scanner;


public class ScannerTugas {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word1 : ");
        String word1 = in.nextLine();

        System.out.println("Enter word 2 : ");
        String word2 = in.nextLine();

        System.out.println("Enter word 3 : ");
        String word3 = in.nextLine();

        System.out.println("\n" + word1 + word2 + word3);
    }
}

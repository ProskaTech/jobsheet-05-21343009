/**
 * Created by 21343009_Mukhtarijal
 */
package satutiga;

import javax.swing.JOptionPane;

public class JOptionPaneTugas {
    public static void main(String[] args){
        String word1 = "", word2 = "", word3 = "";

        word1 = JOptionPane.showInputDialog("Enter word 1");
        word2 = JOptionPane.showInputDialog("Enter word 2");
        word3 = JOptionPane.showInputDialog("Enter word 3");

        
        String msg = word1 + " " + word2 + " " + word3;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println(word1 + " " + word2 + " " + word3);  
       }
}

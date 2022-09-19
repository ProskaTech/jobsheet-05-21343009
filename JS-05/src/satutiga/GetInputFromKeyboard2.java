/**
 * Created by 21343009_Mukhtarijal
 */
package satutiga;

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String[] args){
        String name = "", hoby = "";

        name = JOptionPane.showInputDialog("Nama Anda");
        hoby = JOptionPane.showInputDialog("hoby Anda");
        
        String msg = "Jadi hobi anda "+hoby+". "+"Hoby yang bagus"+name;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi hobi anda "+hoby+". "+"Hoby yang bagus "+name);  
       }
}

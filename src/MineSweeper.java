import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
/**
 *
 * @author takehirotsurumi
 */
public class MineSweeper {

    public static JPanel pane;
    public static JFrame f;
    public static JToggleButton[] buttons;
    public static ArrayList<Integer> bombs;
    public static ArrayList<Integer> count;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        pane = new JPanel(new GridLayout(9,9));
        f = new JFrame();
        buttons = new JToggleButton[81];
        bombs = SetBomb.Set();
        count=SetNumbers.setNumber(bombs);
        for(int i=0; i<81; i++){
            JToggleButton b = new JToggleButton();
            b.addActionListener(new ButtonListener(pane,b,buttons,f,bombs,count,i));
            pane.add(b);
            buttons[i]= b;
        }
        f.setSize(300, 300);
        f.setContentPane(pane);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}



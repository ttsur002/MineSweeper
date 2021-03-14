import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author takehirotsurumi
 */

public class ButtonListener implements ActionListener{
    public JToggleButton button;
    public JToggleButton[] buttons;
    public JFrame frame;
    public ArrayList<Integer> bombs;
    public ArrayList<Integer> count;
    public int index;
    public JPanel pane;

    public ButtonListener(JPanel pane, JToggleButton b, JToggleButton[] buttons,JFrame f, ArrayList<Integer> bombs, ArrayList<Integer> count, int i){
        this.button = b;
        this.buttons=buttons;
        this.frame = f;
        this.pane=pane;
        this.bombs=bombs;
        this.count=count;
        this.index=i;
    }

    public void actionPerformed(ActionEvent e) {
        if(this.bombs.contains(this.index)){
            this.button.setText("Bomb");
            System.out.print("Game is over");
            JOptionPane.showMessageDialog(this.frame, "The game is over");
            MineSweeper.main(null);
        }
        else if(this.count.get(this.index)!=0){
                this.button.setText(String.valueOf(this.count.get(this.index)));
            }
        else{
            DeleteBlank.DeleteBlankSpace(this.index,this.buttons,this.bombs);
        }
    }



}
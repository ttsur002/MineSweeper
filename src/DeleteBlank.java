import javax.swing.*;
import java.util.ArrayList;

public class DeleteBlank {
    public static void DeleteBlankSpace(int index, JToggleButton [] buttons, ArrayList <Integer> bombs){
        int up=index-9;
        int down=index+9;
        int right=index+1;
        int left=index-1;

        if(up>=0){
            if(!bombs.contains(up)&&!buttons[up].isSelected()){
                buttons[up].doClick();
            }
        }
        if(down<81){
            if(!bombs.contains(down)&&!buttons[down].isSelected()){
                buttons[down].doClick();
            }
        }
        if(index%9==0){
            if(!bombs.contains(right)&&!buttons[right].isSelected()) {
                buttons[right].doClick();
            }
        }
        else if(index%9==8){
            if(!bombs.contains(left)&&!buttons[left].isSelected()){
                buttons[left].doClick();
            }
        }
        else{
            if(!bombs.contains(right)&&!buttons[right].isSelected()){
                buttons[right].doClick();
            }
            if(!bombs.contains(left)&&!buttons[left].isSelected()){
                buttons[left].doClick();
            }
        }
    }
}

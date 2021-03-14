import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author takehirotsurumi
 */
public class SetNumbers {
    public static ArrayList<Integer> setNumber(ArrayList<Integer> bombs){
        int[] temp = new int[81];
        for(int i = 0; i<temp.length; i++){
            temp[i]=0;
        }
        for(int j=0;j<bombs.size();j++){
            if(bombs.get(j)<9){
                if(bombs.get(j)%9==0){
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+10]++;
                }
                else if(bombs.get(j)%9==8){
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+8]++;
                }
                else{
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)+1]++;
                    temp[bombs.get(j)+8]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+10]++;
                }
            }
            else if(bombs.get(j)>71){
                if(bombs.get(j)%9==0){
                    temp[bombs.get(j)+1]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)-8]++;
                }
                else if(bombs.get(j)%9==8){
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)-10]++;
                }
                else{
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)+1]++;
                    temp[bombs.get(j)-8]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)-10]++;
                }
            }
            else{
                if(bombs.get(j)%9==0){

                    temp[bombs.get(j)-8]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)+1]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+10]++;
                }
                else if(bombs.get(j)%9==8){

                    temp[bombs.get(j)-10]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+8]++;
                }
                else{
                    temp[bombs.get(j)-10]++;
                    temp[bombs.get(j)-9]++;
                    temp[bombs.get(j)-8]++;
                    temp[bombs.get(j)-1]++;
                    temp[bombs.get(j)+1]++;
                    temp[bombs.get(j)+8]++;
                    temp[bombs.get(j)+9]++;
                    temp[bombs.get(j)+10]++;
                }
            }
        }
        ArrayList<Integer> temp1 = new ArrayList<>();
        for(int l=0;l<temp.length;l++){
            temp1.add(temp[l]);
        }
        return temp1;
    }
}
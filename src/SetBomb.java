/**
 *
 * @author takehirotsurumi
 */
import java.util.ArrayList;
import java.lang.*;
public class SetBomb {
    public static ArrayList <Integer> Set(){
        int i = 0;
        int[] bombs={100,100,100,100,100,100,100,100,100,100};
        while(i<10){
            int num = (int)(Math.random()*81);
            System.out.print(num+" ");
            for(int elem:bombs){
                while(elem==num){
                    num = (int)(Math.random()*81);
                    System.out.print(num+" new ");
                }
            }
            bombs[i]=num;
            i++;
        }
        ArrayList <Integer> bombs1= new ArrayList<>();
        for(int num:bombs){
            bombs1.add(num);
        }
        System.out.println(bombs1);
        return bombs1;
    }
}


package pl.edu.uwm.wmii.kordowskijakub.laboratorium05;
import java.util.ArrayList;

public class zadanie4 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        System.out.println(a);
        System.out.println(reversed(a));
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--){
            b.add(a.get(i));
        }
        return b;
    }
}

package pl.edu.uwm.wmii.kordowskijakub.laboratorium05;
import java.util.ArrayList;

public class Z05 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(14);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(a);
        System.out.println(b);
        System.out.println(append(a,b));
    }
    
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.addAll(a);
        c.addAll(b);
        return c;
    }
}

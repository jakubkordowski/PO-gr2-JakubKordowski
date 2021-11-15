package pl.edu.uwm.wmii.kordowskijakub.laboratorium05;
import java.util.ArrayList;

public class zadanie2 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(a);
        System.out.println(b);
        System.out.println(merge(a,b));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        int aLength = a.size();
        int bLength = b.size();
        int dif = 0;
        if(aLength>bLength){
            dif = aLength - bLength;
            for(int i=0;i<bLength;i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
            for(int i=aLength-dif;i<aLength;i++){
                c.add(a.get(i));
            }
        }
        if(bLength>aLength){
            dif = bLength - aLength;
            for(int i=0;i<aLength;i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
            for(int i=bLength-dif; i<bLength;i++){
                c.add(b.get(i));
            }
        }
        if(aLength==bLength){
            for(int i=0;i<aLength;i++){
                c.add(a.get(i));
                c.add(b.get(i));
            }
        }
        return c;
    }
}

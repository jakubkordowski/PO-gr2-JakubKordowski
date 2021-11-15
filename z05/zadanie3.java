package pl.edu.uwm.wmii.kordowskijakub.laboratorium05;
import java.util.ArrayList;
import java.util.Collections;

public class zadanie3 {
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
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(mergeSorted(a,b));
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        int aLength = a.size();
        int bLength = b.size();
        int length = aLength+bLength;
        int aIndex = 0;
        int bIndex = 0;
        for(int i=0; i<length; i++){
            if(aIndex == aLength && bIndex != bLength){
                c.add(b.get(bIndex));
                bIndex += 1;
            }
            if(aIndex != aLength && bIndex == bLength){
                c.add(a.get(aIndex));
                aIndex += 1;
            }
            if(aIndex != aLength && bIndex != bLength){
                if(a.get(aIndex)<=b.get(bIndex)){
                    c.add(a.get(aIndex));
                    aIndex += 1;
                }
                else{
                    c.add(b.get(bIndex));
                    bIndex += 1;
                }
            }
        }
        return c;
    }
}

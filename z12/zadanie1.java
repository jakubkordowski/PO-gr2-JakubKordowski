package pl.imiajd.kordowski;
import java.util.LinkedList;

public class zadanie1 {

    public static void main(String[] args) {
	LinkedList<String> nazwiska = new LinkedList<>();
    nazwiska.add("Adamowicz");
    nazwiska.add("Nowak");
    nazwiska.add("Dawidowski");
    nazwiska.add("Mucha");
    nazwiska.add("Abramski");
    nazwiska.add("Chmiel");
    System.out.println(nazwiska);
    redukuj(nazwiska, 2);
    System.out.println(nazwiska);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n){
        int counter = 0;
        for(int i=0; i<pracownicy.size();i++){
            counter += 1;
            if(counter == n){
                pracownicy.remove(i);
                counter = 1;
            }
        }
    }
}

package pl.edu.uwm.wmii.kordowskijakub.javaz06;

public class zadanie1 {

    public static void main(String[] args) {
	RachunekBankowy saver1 = new RachunekBankowy(2000);
	RachunekBankowy saver2 = new RachunekBankowy(3000);
	RachunekBankowy.setRocznaStopaProcentowa(4);
	System.out.println("Saver1: "+saver1.obliczMiesieczneOdsetki());
	System.out.println("Saver2: "+saver2.obliczMiesieczneOdsetki());
    RachunekBankowy.setRocznaStopaProcentowa(5);
    System.out.println("Saver1: "+saver1.obliczMiesieczneOdsetki());
    System.out.println("Saver2: "+saver2.obliczMiesieczneOdsetki());
    }
}

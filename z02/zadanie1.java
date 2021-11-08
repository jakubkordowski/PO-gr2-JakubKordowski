package pl.edu.uwm.wmii.kordowskijakub.laboratorium02;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Random r = new Random();
	Scanner in = new Scanner(System.in);
    	int n = 0;
	while(n<=0 || n>100){
		n = in.nextInt();
        }
	int[] tab = new int[n];
	for(int i = 0; i<tab.length; i++) {
		tab[i] = r.nextInt(1999)-999; // ((max-min)+1)+min
	}
		// zad1.a
//	int niep = 0;
//	int p = 0;
//	for(int i = 0; i<tab.length; i++){
//		if(tab[i]%2==0) p += 1;
//		else niep += 1;
//	}
//	System.out.print("Liczba parzystych: "+p+"\nLiczba nieparzystych: "+niep);
		// zad1.b
//    	int uje = 0;
//	int dod = 0;
//	int zer = 0;
//	for(int i=0; i<tab.length; i++){
//		if(tab[i]<0) uje += 1;
//		if(tab[i]>0) dod += 1;
//		if(tab[i]==0) zer += 1;
//	}
//	System.out.print("Liczba ujemnych: "+uje+"\nLiczba dodatnich: "+dod+"\nLiczba zer: "+zer);
		// zad1.c
//	int max = -999;
//	int countMax = 0;
//	for(int i = 0; i<tab.length;i++){
//		if(tab[i]>max) max = tab[i];
//	}
//	for(int i =0; i<tab.length;i++){
//		if(tab[i]==max) countMax += 1;
//	}
//	System.out.print("Najwieksza liczba: "+max+"\nWystąpiła: " +countMax+" razy.");
		// zad1.d
//	int sumaUje = 0;
//	int sumaDod = 0;
//	for(int i=0; i<tab.length;i++){
//		if(tab[i]<0) sumaUje += tab[i];
//		if(tab[i]>0) sumaDod += tab[i];
//	}
//	System.out.print("Suma ujemnych: "+sumaUje+"\nSuma dodatnich: "+sumaDod);
	// zad1.e
//	int countL = 0;
//	int temp = 0;
//	for(int i=0;i<tab.length;i++){
//		if(tab[i]>0) countL += 1;
//		else{
//			if(countL>temp) temp = countL;
//			countL = 0;
//		}
//	}
//	if(temp>countL) countL = temp;
//	System.out.print("Najwiekszy fragment dodatni ma dlugosc: "+countL);
	// zad1.f
//	for(int i=0;i<tab.length;i++){
//		if(tab[i]>0) tab[i]=1;
//		if(tab[i]<0) tab[i]=-1;
//		System.out.print(tab[i]+" ");
//	}
	// zad1.g
//        int lewy = 0;
//        while(lewy<=0 || lewy>n){
//            lewy = in.nextInt();
//        }
//        int prawy = 0;
//        while(prawy<=0 || prawy>n){
//	    prawy = in.nextInt();
//        }
//	  if(lewy>prawy){
//	    int tempLP = lewy;
//	    lewy = prawy;
//	    prawy = tempLP;
//    	  }
//        for(int i=lewy-1;i<=prawy/2;i++){
//            	int tempTab = tab[i];
//            	tab[i] = tab[prawy-i];
//            	tab[prawy-i] = tempTab;
//        }
    }

}

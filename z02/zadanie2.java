package pl.edu.uwm.wmii.kordowskijakub.laboratorium02;
import java.util.Scanner;
import java.util.Random;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while(n<=0 || n>100){
            n = in.nextInt();
        }
        int[] tab = new int[n];
        generuj(tab,n,-999,999);
        for(int i = 0;i<n;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n");
//        System.out.println(ileNieparzystych(tab));
//        System.out.println(ileParzystych(tab));
//        System.out.println(ileDodatnich(tab));
//        System.out.println(ileUjemnych(tab));
//        System.out.println(ileZerowych(tab));
//        System.out.println(ileMaksymalnych(tab));
//        System.out.println(sumaDodatnich(tab));
//        System.out.println(sumaUjemnych(tab));
//        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(tab));
//        signum(tab);
        odwrocFragment(tab,2,5);
        for(int i = 0;i<n;i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static void generuj(int tab[], int n, int min, int max){
        Random r = new Random();
        for(int i=0;i<n;i++){
            tab[i] = r.nextInt((max-min)+1)+min;
        }
    }
    public static int ileNieparzystych(int tab[]){
        int count = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]%2!=0) count += 1;
        }
        return count;
    }
    public static int ileParzystych(int tab[]){
        int count = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]%2==0) count += 1;
        }
        return count;
    }


    public static int ileDodatnich(int tab[]){
        int count = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0) count+=1;
        }
        return count;
    }
    public static int ileUjemnych(int tab[]){
        int count = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0) count+=1;
        }
        return count;
    }
    public static int ileZerowych(int tab[]){
        int count = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]==0) count+=1;
        }
        return count;
    }
    public static int ileMaksymalnych(int tab[]){
        int count = 0;
        int max = -999;
        for(int i = 0; i<tab.length;i++){
			if(tab[i]>max) max = tab[i];
		}
		for(int i =0; i<tab.length;i++){
			if(tab[i]==max) count += 1;
		}
		return count;
    }
    public static int sumaDodatnich(int tab[]){
        int count = 0;
        for(int i =0; i<tab.length;i++){
            if(tab[i]>0) count+= tab[i];
        }
        return count;
    }
    public static int sumaUjemnych(int tab[]){
        int count = 0;
        for(int i =0; i<tab.length;i++){
            if(tab[i]<0) count+= tab[i];
        }
        return count;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich (int tab[]){
        int count = 0;
	int temp = 0;
	for(int i=0;i<tab.length;i++){
            if(tab[i]>0) count += 1;
            else{
                if(count>temp) temp = count;
		count = 0;
            }
	}
	if(temp>count) count = temp;
        return count;
    }
    public static void signum(int tab[]){
        for(int i=0;i<tab.length;i++){
            if(tab[i]>0) tab[i] = 1;
            if(tab[i]<0) tab[i] = -1;
            System.out.print(tab[i]+" ");
        }
    }
    public static void odwrocFragment(int tab[], int lewy, int prawy){
        if(lewy>prawy){
            int tempLP = lewy;
            lewy = prawy;
            prawy = tempLP;
        }
        for(int i=lewy-1;i<=prawy/2;i++){
            int tempTab = tab[i];
            tab[i] = tab[prawy-i];
            tab[prawy-i] = tempTab;
        }
    }
}

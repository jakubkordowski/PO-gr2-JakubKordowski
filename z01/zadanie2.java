package pl.edu.uwm.wmii.kordowskijakub.laboratorium01;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class zadanie2 {
//2.1a
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(x%2==1) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1b
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(x%3==0 && x%5!=0) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1c
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(sqrt(x)%2==0) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1d
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        double[] tab = new double[n];
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            tab[i] = x;
//        }
//        for(int i=1;i<n-1;i++){
//            if(2*tab[i]<tab[i-1]+tab[i+1]){
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1e
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        double[] tab = new double[n];
//        int silnia = 1;
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            tab[i] = x;
//        }
//        for(int i=0;i<=n;i++){
//            silnia *= (i+1);
//            if(tab[i]>pow(2,i) && tab[i]<silnia){
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }    
//2.1f
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if((i+1)%2==1 && x%2==0) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1g
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(x%2==1 && x>=0) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.1h
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(abs(x) < pow((i+1),2)) {
//                wynik += 1;
//            }
//        }
//        System.out.print(wynik);
//    }
//2.2
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double wynik = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(x>0) {
//                wynik += x;
//            }
//        }
//        System.out.print(2*wynik);
//    }
//2.3
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik1 = 0;
//        int wynik2 = 0;
//        int wynik3 = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(x < 0) {
//                wynik1 += 1;
//            }
//            if(x > 0){
//                wynik2 += 1;
//            }
//            if(x == 0){
//                wynik3 += 1;
//            }
//        }
//        System.out.print("Liczba liczb ujemnych: " + wynik1+"\n");
//        System.out.print("Liczba liczb dodatnich: " + wynik2+"\n");
//        System.out.print("Liczba zer: " + wynik3+"\n");
//    }
//2.4
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double min = 0;
//        double max = 0;
//        int n = in.nextInt();
//        for(int i=0;i<n;i++) {
//            double x = in.nextDouble();
//            if(min == 0 && max == 0) {
//                min = x;
//                max = x;
//            }
//            if(min!=0 && max!=0){
//                if(x>max){
//                    max = x;
//                }
//                if(x<min){
//                    min = x;
//                }
//            }
//        }
//        System.out.print("Min: " + min+"\n");
//        System.out.print("Max: "+ max+"\n");
//    }
//2.5
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int wynik = 0;
//        int n = in.nextInt();
//        double[] tab = new double[n];
//        for (int i = 0; i < n; i++) {
//            double x = in.nextDouble();
//            tab[i] = x;
//            if(i>0 && i<n) {
//                if(tab[i-1]>0 && tab[i]>0){
//                    wynik += 1;
//                }
//            }    
//        }
//        System.out.print(wynik);
//    }    
}

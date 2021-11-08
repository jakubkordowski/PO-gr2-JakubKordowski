package pl.edu.uwm.wmii.kordowskijakub.laboratorium02;
import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int m = 0;
        while(m<=0 || m>10){
            m = in.nextInt();
        }
        int n = 0;
        while(n<=0 || n>10){
            n = in.nextInt();
        }
        int k = 0;
        while(k<=0 || k>10){
            k = in.nextInt();
        }
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = r.nextInt(10)+1;
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("------------\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                b[i][j] = r.nextInt(10)+1;
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("------------\n");
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                for(int l=0;l<n;l++){
                    c[i][j] += a[i][l]*b[l][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

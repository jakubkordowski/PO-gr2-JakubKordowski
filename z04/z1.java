package pl.edu.uwm.wmii.kordowskijakub.laboratorium04;

import java.util.Scanner;
import java.lang.StringBuffer; //zadanie 1
import java.io.*; // zadanie 2-3
import java.io.FileReader; // zadanie 2-3
import java.math.BigInteger; // zadanie 4-5
import java.math.BigDecimal; // zadanie 4-5
public class z1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "ala ma kota";
        char c = 'a';
        String sub = "a";
        String ss = "aaa";
        String sss = "aa";
        String testString = "ala ma kota I PSY";
        String testSub = "a";
        String ten = "1234567";
//       System.out.println("W napisie '"+s+"' litera '"+c+"' wystepuje " + countChr(s,c)+" razy."); //1a
//       System.out.println("W napisie '"+ss+"' napis '"+sss+"' wystepuje "+countSubStr(ss,sss)+" razy."); //1b
//        String Mid = in.nextLine();
//        System.out.println(middle(Mid));//1c
//        String Rep = in.nextLine();
//        System.out.println(repeat(Rep, 6));//1d
//        for(int i=0;i<s.lastIndexOf(sub);i++){
//            System.out.print(tab[i]+" ");
//        }
//        int c = countSubStr(testString, testSub);
//        int[] a = where(testString, testSub);
//        for(int i=0;i<c;i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.print("\n");
//        System.out.println(change(testString));
//        System.out.println(nice(ten));
//        System.out.println(niceTwo(ten,2,":"));
    }

    public static int countChr(String str, char c) {
        int count = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == c) count += 1;
        return count;
    }
    public static int countSubStr(String str, String subStr){
        int count = 0;
        int index = 0;
        while((index = str.indexOf(subStr, index)) != -1){
            count+=1;
            index+=1;
        }
        return count;
    }
    public static String middle(String str){
        StringBuffer mid = new StringBuffer();
        int i = str.length()/2;
        if(str.length()%2==0){
            mid = mid.append(str.charAt(i-1)).append(str.charAt(i));
        }
        else{
            mid = mid.append(str.charAt(i));
        }
        return mid.toString();
    }
    public static String repeat(String str, int n){
        StringBuffer rep = new StringBuffer();
        for(int i=0;i<n;i++){
            rep.append(str);
        }
        return rep.toString();
    }
    public static int[] where(String str, String subStr){
        int count = 0;
        int index = 0;
        while((index = str.indexOf(subStr, index)) != -1){
            count+=1;
            index+=1;
        }
        int[] tab = new int[count];
        int i = 0;
        index = str.indexOf(subStr);
        while(index>=0){
            tab[i] = index;
            index = str.indexOf(subStr, index + 1);
            i += 1;
        }
        return tab;
    }
    public static String change(String str){
        StringBuffer newStr = new StringBuffer();
        newStr.append(str);
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            if(Character.isUpperCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        return newStr.toString();
    }
    public static String nice(String str){
        StringBuffer newStr = new StringBuffer();
        newStr.append(str);
        int count = 0;
        for(int i=newStr.length();i>=0;i--){
            if(count == 0){
                newStr.insert(i, "'");
                count = 2;
            }
            else count-=1;
        }
        return newStr.toString();
    }
    public static String niceTwo(String str, int count, String sep){
        StringBuffer newStr = new StringBuffer();
        newStr.append(str);
        int temp = count-1;
        count = 0;
        for(int i=newStr.length();i>=0;i--){
            if(count==0){
                newStr.insert(i, sep);
                count = temp;
            }
            else count-=1;
        }
        return newStr.toString();
    }
}

package pl.edu.uwm.wmii.kordowskijakub.laboratorium04;
import java.io.*; // zadanie 2-3
import java.io.FileReader; // zadanie 2-3
import java.util.Scanner;
import java.lang.StringBuffer;

public class z3 {
    public static void main(String[] args){
        String str = "filename.txt";
        String subStr = "aaa";
        System.out.println(readerStr(str,subStr));
    }
    public static int readerStr(String str, String subStr){
        int count = 0;
        int index = 0;
        try{
            Scanner file = new Scanner(new FileReader(str));
            StringBuffer sb = new StringBuffer();
            while(file.hasNext()){
                sb.append(file.next());
            }
            file.close();
            while((index = sb.indexOf(subStr, index))!= -1){
                count+=1;
                index+=1;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        return count;
    }
}

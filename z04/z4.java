package pl.edu.uwm.wmii.kordowskijakub.laboratorium04;
import java.math.BigInteger;

public class z4 {
    public static void main(String[] args){
        System.out.println(chess(6));
    }
    public static BigInteger chess(int n){
        BigInteger result = BigInteger.valueOf(1);
        if(n==1){
            return result;
        }
        else{
            BigInteger a = BigInteger.valueOf(2);
            for(int i=1;i<n*n;i++){
                BigInteger s = new BigInteger(String.valueOf(a));
                result = result.add(s);
                a = a.multiply(BigInteger.valueOf(2));
            }
        }
        return result;
    }
}

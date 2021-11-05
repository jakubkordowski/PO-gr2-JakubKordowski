package pl.edu.uwm.wmii.kordowskijakub.laboratorium04;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class z5 {
    public static void main(String[] args){
        System.out.println(kapital(5000,5,1));
    }
    public static BigDecimal kapital(int k, int p, int n){
        BigDecimal result = BigDecimal.valueOf(k);
        BigDecimal o = BigDecimal.valueOf(k*p/100).setScale(2, RoundingMode.CEILING);
        for(int i=0;i<n;i++){
          result = result.add(o);
        }
        return result;
    }
}

package pl.edu.uwm.wmii.kordowskijakub.javaz06;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double Saldo){
        this.saldo = Saldo;
    }
    public double obliczMiesieczneOdsetki(){
        this.saldo += (this.saldo*RachunekBankowy.rocznaStopaProcentowa)/12;
        return this.saldo;
    }
    public static void setRocznaStopaProcentowa(double x){
        RachunekBankowy.rocznaStopaProcentowa = x;
    }
}

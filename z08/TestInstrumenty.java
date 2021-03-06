import pl.imiajd.kordowski.*;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        LocalDate data1 = LocalDate.of(2000, 2, 14);
        LocalDate data2 = LocalDate.of(2008, 10, 21);

        orkiestra.add(new Flet("Prdoucent A", data1));
        orkiestra.add(new Fortepian("Producent A", data1));
        orkiestra.add(new Skrzypce("Producent B", data2));
        orkiestra.add(new Skrzypce("Producent C", data1));
        orkiestra.add(new Flet("Producent C", data2));

        System.out.println(orkiestra.get(0).dzwiek());
        System.out.println(orkiestra.get(1).dzwiek());
        System.out.println(orkiestra.get(2).dzwiek());
        System.out.println(orkiestra.get(3).dzwiek());
        System.out.println(orkiestra.get(4).dzwiek());
        System.out.println(orkiestra);
    }
}

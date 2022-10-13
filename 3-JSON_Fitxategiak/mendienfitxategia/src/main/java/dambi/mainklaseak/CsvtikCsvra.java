package dambi.mainklaseak;

import java.io.IOException;

import dambi.atzipenak.Csva;
import dambi.pojoak.Mendiak;
import dambi.pojoak.Mendia;
/**
 * Hello world!
 *
 */
public class CsvtikCsvra 
{
    public static void main( String[] args ) {
        Mendiak mendiak = new Mendiak();

        Mendiak gipuzkoak = new Mendiak();

        Csva csva = new Csva("data/Mendiak.csv", "data/Gipuzkoakoak.csv");

        mendiak = csva.irakurri();
        if (mendiak != null){
            for(Mendia m : mendiak.getMendiak()){
                if(m.getProbintzia().equals("Gipuzkoa")){
                    gipuzkoak.add(m);
                }
            }
            System.out.println(csva.idatzi(gipuzkoak));
        }
    }
}

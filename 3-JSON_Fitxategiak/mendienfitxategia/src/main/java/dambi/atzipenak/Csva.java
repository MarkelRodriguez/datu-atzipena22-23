package dambi.atzipenak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import dambi.pojoak.Mendiak;
import dambi.pojoak.Mendia;

public class Csva {
    public String strFileIn;

    public String strFileOut;

    public Csva(String strFileIn) {
        this.strFileIn = strFileIn;
    }

    public Csva(String strFileIn, String strFileOut) {
        this.strFileIn = strFileIn;
        this.strFileOut = strFileOut;
    }

    public Mendiak irakurri() {
        BufferedReader inputStream = null;
        Mendiak mendiak = null;

        try {
            inputStream = new BufferedReader(new FileReader(strFileIn));
            String banatzailea = ";";
            mendiak = new Mendiak();
            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] eremuak = l.split(banatzailea);
                if (!eremuak[0].equals("MENDIA")) {
                    Mendia mendia = new Mendia();
                    
                    mendia.setIzena(eremuak[0]);
                    mendia.setAltuera(Integer.parseInt(eremuak[1]));
                    mendia.setProbintzia(eremuak[2]);
                    mendiak.add(mendia);
                }

            }
            inputStream.close();
        }catch(IOException ex){
            
            System.out.println(ex);
            
        }
            
            
        return mendiak;
    }

    public int idatzi(Mendiak mendiak) {
        int mendiKopurua = 0;
        PrintWriter outputStream = null;
        try{
            outputStream = new PrintWriter(new FileWriter(strFileOut));
        for(Mendia m : mendiak.getMendiak()){
            if(mendiKopurua == 0){
                outputStream.println("MENDIA;ALTUERA;PROBINTZIA");

            }
            mendiKopurua++;
            
            outputStream.println(m.getIzena()+ ";" + m.getAltuera()+ ";" + m.getProbintzia());
            
        }
        
        outputStream.close();
        
        }catch(IOException ex){
            System.out.println(ex);
        }
        

        return mendiKopurua;
    }
}

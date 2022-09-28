package dambi;

import java.util.ArrayList;

public class Mendia {
    
    private String izena;
    private int altuera;
    private String probintzia;

    public Mendia(String izena, int altuera,String probintzia){
        this.altuera = altuera;
        this.izena = izena;
        this.probintzia = probintzia;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setAltuera(int altuera) {
        this.altuera = altuera;
    }

    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    public String getIzena(){
        return izena;
    }

    public int getAltuera(){
        return altuera;
    }

    public String getProbintzia(){
        return probintzia;
    }
}

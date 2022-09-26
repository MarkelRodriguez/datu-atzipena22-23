package dambi;

public class Mendiak {
    private String izena;
    private int altuera;
    private String probintzia;

    public Mendiak(String izena, int altuera , String probintzia){
        this.izena = izena;
        this.altuera = altuera;
        this.probintzia = probintzia;

    }
    public Mendiak() {
    }
    public void setIzena(String izena){
        this.izena = izena;
    }
    public String getIzena(){
        return izena;
    }

    public void setAltuera(int altuera){
        this.altuera= altuera;
    }
    public int getAltuera(){
        return altuera;
    }

    public void setProbintzia(String probintzia){
        this.probintzia = probintzia;
    }
    public String getProbintzia(){
        return probintzia;
    }

    
}

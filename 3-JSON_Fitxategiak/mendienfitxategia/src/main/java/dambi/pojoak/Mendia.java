package dambi.pojoak;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType( propOrder = { "izena", "altuera", "probintzia" } )
@XmlRootElement( name = "Mendia" )
public class Mendia {

    int id = 0;
    String izena;

    int altuera;

    String probintzia;


    public int getId(){

        return id;
    }
    @XmlAttribute(name = "Mendia_Id")
    public void setId(int id){
        this.id = id;
    }
    public String getIzena(){

        return izena;
    }
    @XmlElement(name = "Mendia_Izena")

    public void setIzena(String izena){
        this.izena = izena;
    }

    public int getAltuera(){

        return altuera;
    }

    @XmlElement(name = "Mendia_Altuera")
    
    public void setAltuera(int altuera){
        this.altuera = altuera;
    }

    public String getProbintzia(){

        return probintzia;
    }

    @XmlElement(name = "Mendia_Probintzia")
    public void setProbintzia(String probintzia){
        this.probintzia = probintzia;
    }

    public String toString()
    {

        StringBuffer str = new StringBuffer( "Izena: " + getIzena() + "\n" );
        str.append( "Altuera: " + getAltuera() + "\n" );
        str.append( "Probintzia: " + getProbintzia() + "\n" );

        return str.toString();

    }

}

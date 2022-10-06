package dambi;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class MendiaXmlsortu 
{
    public static void main(String[] args) {


        try{
            Mendia mendia = new Mendia();

            mendia.setIzena("Aketegi");
            mendia.setAltuera(1548);
            mendia.setProbintzia("Gipuzkoa");

            JAXBContext jaxbContext = JAXBContext.newInstance( Mendia.class );
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            jaxbMarshaller.marshal( mendia, new File(   mendia.getIzena() + ".xml" ) );
            jaxbMarshaller.marshal( mendia, System.out );
        }
        catch(JAXBException e){
            e.printStackTrace();
        }
        

    }
}

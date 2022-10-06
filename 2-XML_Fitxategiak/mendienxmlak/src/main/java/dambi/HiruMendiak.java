package dambi;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class HiruMendiak {
    
    public static void main(String[] args) {

        try{
            Mendia albertia = new Mendia();

            albertia.setIzena("Albertia");
            albertia.setAltuera(868);
            albertia.setProbintzia("Araba");

            Mendia alluitz = new Mendia();

            alluitz.setIzena("Alluitz");
            alluitz.setAltuera(1034);
            alluitz.setProbintzia("Bizkaia");

            Mendia anboto = new Mendia();

            anboto.setIzena("Anboto");
            anboto.setAltuera(1331);
            anboto.setProbintzia("Bizkaia");

            Mendiak mendiak = new Mendiak();
            mendiak.add(albertia);
            mendiak.add(alluitz);
            mendiak.add(anboto);

            JAXBContext jaxbContext = JAXBContext.newInstance( Mendiak.class );
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            jaxbMarshaller.marshal( mendiak, new File("HiruMendiak.xml" ) );
            jaxbMarshaller.marshal( mendiak, System.out );
        }
        catch(JAXBException e){
            e.printStackTrace();
        }
        



    }

}

package dambi;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class StringAdapter extends XmlAdapter<String, String> {

    @Override
    public String unmarshal(String izena) throws Exception {
        
        return izena;
    }

    @Override
    public String marshal(String izena) throws Exception {
       
        return izena.toString();
    }
    
}

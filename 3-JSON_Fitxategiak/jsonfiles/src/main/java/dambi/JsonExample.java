package dambi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonWriter;

public class JsonExample {
    public static void main( String[] args ) throws FileNotFoundException{
        JsonObject model = Json.createObjectBuilder()
            .add("menu", Json.createObjectBuilder()
            .add("id", "file")
            .add("value", "File")
            .add("popup",Json.createObjectBuilder()
                .add("menuitem",Json.createArrayBuilder()
                    .add(Json.createObjectBuilder()
                        .add("value", "New" )
                        .add("onClick", "CreateNewDoc()"))
                    .add(Json.createObjectBuilder()
                        .add("value", "New" )
                        .add("onClick", "CreateNewDoc()"))
                    .add(Json.createObjectBuilder()
                        .add("value", "New" )
                        .add("onClick", "CreateNewDoc()")))))
                    .build();
        
                    try (JsonWriter jsonWriter = Json.createWriter(new FileOutputStream("data/Irteera.json"))) {
                        jsonWriter.writeObject(model);
                     }
    }
}

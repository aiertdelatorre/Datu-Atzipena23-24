package dambi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonObject;
import java.io.StringWriter;
import javax.json.JsonWriter;
import javax.json.JsonValue;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonString;


public class App 
{
    public static void main( String[] args )throws FileNotFoundException
    {
        JsonReader reader = Json.createReader(new FileReader("src/data/Datuak.json"));
        JsonStructure jsonst = reader.read();

        System.out.println(jsonst);

        StringWriter stw = new StringWriter();
        JsonWriter Jsw = Json.createWriter(new FileOutputStream("src/data/Datuirteera.json"));

        JsonObject model = Json.createObjectBuilder()
            .add("Izena", "Kalamendi")
            .add("Altuera", 100)
            .add("Probintzia","Bizkaia")
            .build();

        Jsw.writeObject(model);
        Jsw.close();


    }
}

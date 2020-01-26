import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class GsonGenerator {

    public JsonObject generator(int n) {
        int i=0;
        JsonObject main = new JsonObject();
        while(i<=n) {
            main.add("person"+(i+1),Person.generatePerson());
            i++;
        }
        return main;
    }


    public static void main(String[] args) {
GsonGenerator gg= new GsonGenerator();
JsonObject output=gg.generator(1);

        try (FileWriter file = new FileWriter("D:\\JOB\\Lessons\\jsgenerator\\src\\main\\resources\\json.json")) {
           file.write(String.valueOf(output));
           System.out.println("Finally");
                }
       catch (IOException e) {
           System.out.println("oops");
       }
    }
 }

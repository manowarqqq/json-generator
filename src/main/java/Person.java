import com.google.gson.JsonObject;
import java.util.Random;

public class Person {




public static JsonObject generatePerson() {
    Random rand=new Random();
    JsonObject person=new JsonObject();
    person.addProperty("firstName","name"+rand.nextInt(1000));
    person.addProperty("lastName","name"+rand.nextInt(1000));
    person.addProperty("address",rand.nextInt(100)+" street");
    person.addProperty("age",rand.nextInt(100));
    person.add("address", Adress.generateAdress());

    return person;
}

}






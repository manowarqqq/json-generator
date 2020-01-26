import com.google.gson.JsonObject;

import java.util.Random;

public class Adress {


    public static JsonObject generateAdress() {
        Random rand=new Random();
        JsonObject adress=new JsonObject();
        adress.addProperty("street","street"+rand.nextInt(1000));
        adress.addProperty("home",+rand.nextInt(1000));
        adress.addProperty("flat",rand.nextInt(100));

        return adress;
    }
}

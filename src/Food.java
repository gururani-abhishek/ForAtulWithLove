import exception.GalatFileDhundRaheHoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Food {
    public void makeFood() {
//        String vegetable = null;
//        System.out.println(vegetable.length());
//        System.out.println("calling in food");

        // checked exception

        boolean somethingHappened = true;
        if(somethingHappened) {
            throw new GalatFileDhundRaheHoException("something");
        }

        boolean somethingElseHappened = true;
        if(somethingElseHappened) {
            throw new RuntimeException("message");
        }
    }
}

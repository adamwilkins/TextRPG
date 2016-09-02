/**
 * Created by adam on 9/2/16.
 */

import java.util.*;

public class Choice {

    String fateofChoice = null;

    public String input(){
        Scanner keyboard = new Scanner(System.in);

        while(fateofChoice != "left" || fateofChoice != "right" || fateofChoice != "forward"){

            fateofChoice = keyboard.nextLine();

        }

        return fateofChoice;

    }
}

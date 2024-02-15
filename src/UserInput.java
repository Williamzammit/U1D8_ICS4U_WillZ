import java.util.Arrays;
import java.util.Collections;


public class UserInput {

    public String[] enterName(String name){
        
        if(!(commaExists(name))){

            return splitStringsWithoutComma(name, " ");
            
        } else {
            return splitStringsWithComma(name, ", ");

        }

    }

    public String[] enterDate(String date){
        return date.split("/");


    }

    public boolean commaExists(String name){
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ','){
                return true;
            }
        }
        return false;

    }

    public int findSpace(String name){
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                return i;
            }

        }
        return 0;

    }
    
    public String[] splitStringsWithComma(String name, String item){
        String[] myStrings = name.split(item);
        Collections.reverse(Arrays.asList(myStrings));
        return myStrings;

    }

    public String[] splitStringsWithoutComma(String name, String item){
        String[] myStrings = name.split(item);
        return myStrings;

    }



}

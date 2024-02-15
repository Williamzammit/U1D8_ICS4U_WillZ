import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();
        ArrayList<String> dates = new ArrayList<String>();

        boolean a = true;

        Scanner input = new Scanner(System.in);
        
        while(a){
        
        System.out.println("Enter Students Name.");    
        String name = input.nextLine();
        System.out.println("Enter Students birthdate");
        String date = input.nextLine();
        UserInput call = new UserInput();
        firstNames.add(call.enterName(name)[0]);
        lastNames.add(call.enterName(name)[1]);
        for(int i = 0; i < 3; i++){
        System.out.println(call.enterDate(date)[i]);
        dates.add(call.enterDate(date)[i]);
        }
        
        
        System.out.println("Would you like to enter another set of data? y/n");
            if(((input.nextLine()).toUpperCase()).equals("N")){
                a = false;
                for(int i = 0; i < firstNames.size(); i++){
                    System.out.println(firstNames.get(i) + "," +
                    lastNames.get(i) + "," +
                    dates.get(2+(3*i)) + "-" +
                    dates.get(0+(3*i)) + "-" +
                    dates.get(1+(3*i)) + "," + (2023-Integer.parseInt(dates.get(2+(3*i))))


                    );
                }
            }
        }
    }
}

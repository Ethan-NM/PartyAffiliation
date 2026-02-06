
import java.util.Scanner;

public class Main {
    void main(){
        Scanner scanner = new Scanner(System.in);

        String choice;

        System.out.println("Please enter your political party: Democrat (D), Republican (R), Independent (I)");
        choice = scanner.nextLine();

        if(choice.equals("I")){
            System.out.println("You get an independent person");
        }else if(choice.equals("D")){
            System.out.println("You get an democratic donkey");
        }else if(choice.equals("R")){
            System.out.println("You get an republican elephant");
        }else{
            System.out.println("You get an other octopus");
        }

        scanner.close();
    }
}

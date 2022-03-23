import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scnr = new Scanner(System.in);
        book bookConsole = new book();
        Magazine magazine = new Magazine();
        
        System.out.println("CHOOSE ONE OF THE FOLLOWING");
        bookConsole.printMenu();
        int num1 = scnr.nextInt();
        System.out.println("Choice:: "+ num1);

         //continue book section 1//
        
        bookConsole.console(num1);

        
        int num2 = scnr.nextInt();
        System.out.println("Choice:: "+ num2);
        

        
        
   
        
        

      



        //magazine
        /*bookConsole.continueMagazineMenu();
        int num2 = scnr.nextInt();
        bookConsole.menuforMagazine(num2);*/
        


    }
}

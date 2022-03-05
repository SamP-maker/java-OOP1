
import java.util.*;

import javafx.scene.transform.MatrixType;


public class Student {

 Books books = new Books();
 private int quantity;
 private int input;
 private String BookName;
 
 




 public Student(){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Would you like to borrow this book? If yes, press 0, if no press 1");
    quantity = scnr.nextInt();
    books.borrowBooks(quantity);
    System.out.println("Would you like to return a book? If yes, press 1, if no press 0");
    input = scnr.nextInt();
    
    System.out.println("What book would you like to return");
    scnr.next();
     BookName =scnr.nextLine();
    books.setReturnBooks(input,BookName);
    books.borrowBooks(input);

 }


 }






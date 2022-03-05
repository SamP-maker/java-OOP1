
import java.util.*;



public class Librarian {
Books checkBookStatus = new Books();
InitialBooks printstatus = new InitialBooks();
Student member = new Student();
private String stringInput;

public Librarian(){
Scanner scnr = new Scanner(System.in);
System.out.println("type in \"check\" to check for Library Status");
stringInput = scnr.nextLine();
checkBookStatus(stringInput);



}



public void checkBookStatus(String CheckStatus){
    stringInput = CheckStatus;
    if(CheckStatus.contains("check")){
        checkBookStatus.setBooks();
        printstatus.printLibrary();
    }
}



        
}


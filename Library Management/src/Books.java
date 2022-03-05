import java.util.ArrayList;
import java.util.Scanner;

public class Books{
InitialBooks INITBOOKS = new InitialBooks();
ArrayList<InitialBooks> Library = new ArrayList<>();
private String input;
private int quantity;
private int maxBooksBorrowed;
private String BookName;
private int inputNumber;





public Books()
{
Scanner scnr = new Scanner(System.in);
this.setBooks();

System.out.println("Search the books by BookName/Author/PublishDate/Index");
input = scnr.nextLine();
this.findBooks();
INITBOOKS.printLibrary();
}




//Set Initial Books Method//
public void setBooks(){
    INITBOOKS.setBookName("How to Make Steam");
    INITBOOKS.setAuthor("Gabe Newell");
    INITBOOKS.setPublishDate("2020");
    INITBOOKS.setIsles("210.324");
    INITBOOKS.setIndex("0001");
    INITBOOKS.setQuantity(3);
    Library.add(INITBOOKS);

    
}

//Find Books Method//
public void findBooks(){
Library.stream().filter(Books -> input.equals(Books.getAuthor())).findFirst().orElse(null);
Library.stream().filter(Books -> input.equals(Books.getBookName())).findFirst().orElse(null);
Library.stream().filter(Books -> input.equals(Books.getPublishDate())).findFirst().orElse(null);
Library.stream().filter(Books -> input.equals(Books.getIndex())).findFirst().orElse(null);

}
    

//Borrow Books Method//
public void borrowBooks(int truthValue){
    int input;
    input=truthValue;
    int bookBorrowedCount = 0;
   
   
    if(input == 0){
        quantity = INITBOOKS.getQuantity()-1;
        INITBOOKS.setQuantity(quantity);
        INITBOOKS.printLibrary();
        System.out.println("You have borrowed: "+ INITBOOKS.getBookName()+", "+"You have borrowed a total of: "+ ++bookBorrowedCount + " books");
    }else if(input == 1){
        quantity = INITBOOKS.getQuantity()+1;
        INITBOOKS.setQuantity(quantity);
        INITBOOKS.printLibrary();
        System.out.println(INITBOOKS.getBookName()+ " has been Returned." + "You have borrowed a total of: " + (--bookBorrowedCount+1) + " books");
    } else{
        System.out.println("");
    }

   



    }


//Return Books Method
public void setReturnBooks(int Number,String Name){
BookName = Name;
inputNumber = Number;
if( Number == 1){
Library.stream().filter(Books -> Name.equals(Books.getBookName())).findFirst().orElse(null);

}
}



public String getReturnBooks(){
    return BookName;
}
}



    


    
   
    








import java.util.*;

public class book {
 private String bookName;
 private int price;
 private int copies;
 private String author;
 private int consoleIn;

    


public book(){

}

//methods & functions//
public int console(int input){
    consoleIn = input;
    if(consoleIn == 1){

    }else if(consoleIn == 2){

    }else if(consoleIn ==3){

    }else if(consoleIn ==4){

    }
    return consoleIn;
}

void Menu(int input){

    if(input == 1){
    }else if(input == 0){
     
    }

}





///////////////////////////////setters///////////////////////
public void setbook(String book,int bookPrice, int bookCopies, String bookAuthor){
bookName = book;
price = bookPrice;
copies = bookCopies;
author = bookAuthor;
printList();
}





//////////////////////////////getters//////////////////////////
public String getbookName(){
    return bookName;
}

public int getPrice(){
    return price;
}

public int getCopies(){
    return copies;
}


public String getAuthor(){
    return author;
}

public int getConsoleInput(){
    return consoleIn;
}

//////////////////////////////print List////////////////////////
public void printList(){
System.out.println("enter title: "+ getbookName());
System.out.println("enter price: "+ getPrice());
System.out.println("enter copies: "+ getCopies());
System.out.println("enter author book: "+ getAuthor());
}



public void printMenu(){
System.out.println("CHOOSE ONE OF THE FOLLOWING.... ");
System.out.println("1.BOOK"+"      "+ "2.MAGAZINE");
System.out.println("3.TOTAL SALE AMOUNT" +"      "+"4.REVENUE OF PUBLICATION");
System.out.println("Choice: "+ getConsoleInput() );
}






}

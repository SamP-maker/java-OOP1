public class getters {

private String bookName;
 private int price;
 private int copies;
 private String author;
    






 ///////////////////////////////setters///////////////////////
public void setbookname(String bookNames){
    bookName = bookNames;
}

public void setPrices(int bookPrice){

    price = bookPrice;
}

public void setCopies(int bookCopies){

    copies = bookCopies;
}

public void setAuthor(String bookAuthor){
    author = bookAuthor;
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



//////////////////////////////print List////////////////////////
public void printList(){
    System.out.println("enter title: "+ getbookName());
    System.out.println("enter price: "+ getPrice());
    System.out.println("enter copies: "+ getCopies());
    System.out.println("enter author book: "+ getAuthor());
    }



}

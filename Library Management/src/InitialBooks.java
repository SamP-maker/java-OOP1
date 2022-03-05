public class InitialBooks {

    

private String initBookName, initAuthor, initPbDate, initIndex, initIsles;
private int bookQuantity;


//SETTERS//
public void setBookName(String bookName){
    initBookName = bookName;
    }
    
    public void setAuthor(String author){
    initAuthor = author;
    }
    
    public void setPublishDate(String pbDate){
        initPbDate = pbDate;
    }
    
    public void setIndex(String Index){
        initIndex = Index;
    }

    public void setQuantity(int quantity){
        bookQuantity= quantity;

    }

    public void setIsles(String isles){
        initIsles = isles;
    }
    
//GETTERS//
    public String getBookName(){
        return initBookName;
    }
    
    public String getAuthor(){
        return initAuthor;
    }
    
    public String getPublishDate(){
        return initPbDate;
    }
    
    public String getIndex(){
        return initIndex;
    }

    public String getIsles(){
        return initIsles;
    }

    public int getQuantity(){
        return bookQuantity;
    }


    public void printLibrary(){
        System.out.println("BookName: " + getBookName() + ", " + "Author: " + getAuthor() + ", " + "Publish Date: "+ getPublishDate()
                            + ", " + "Index: " + getIndex() + ", " + "Location: " + getIsles() + ", " + "Quantity: "+ getQuantity());
        
    }
    
    
    }
    
    


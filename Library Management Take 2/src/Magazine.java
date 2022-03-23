public class Magazine {
    



    
    void menuforMagazine(int input){
        if (input ==1){
            continueMagazineMenu();
            System.out.println("Choice:: "+input);
    
            
        }
            
    }
    

    public void continueMagazineMenu(){
        System.out.println("Do you want to continue with Magazine section[1/0]");
         System.out.println("1.YES 0.NO");
    }

    public void printMagazineMenu(){
        System.out.println("1.READ"+"                      "+"2.DISPLAY");
        System.out.println("3.SALE MAGAZINE COPIES" +"      "+"4.RECEIVE NEW ISSUE");
        }
        
}

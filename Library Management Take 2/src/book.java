import java.util.*;

public class book {
 private int consoleIn;
ArrayList<getters> Arr = new ArrayList<>();
 private int consoleIn1;
 Scanner global = new Scanner(System.in);
 Magazine magazine = new Magazine();
 totalsales totalSales = new totalsales();
 
 class loops{
getters get = new getters();


 void menuforBook(int input){
         consoleIn1 = input;
  Scanner setArr = new Scanner(System.in);
    if(consoleIn1 == 1){
       get.setbookname(setArr.next());
       get.setPrices(setArr.nextInt());
       get.setCopies(setArr.nextInt());
       get.setAuthor(setArr.next());
       Arr.add(get);
       get.printList();

       continueBookMenu(setArr.nextInt());
       //New input
       menuforBook( setArr.nextInt());
    }else if(input == 2){
        System.out.println("Choice:: "+ input);
        System.out.print("title   price   copy   author");
        System.out.println(get.getbookName()+"  "+get.getPrice()+"  "+ get.getCopies()+ "  "+ get.getAuthor());
        continueBookMenu(setArr.nextInt());
        menuforBook( setArr.nextInt());

    }else if(input == 3){
        System.out.println("Choice:: "+ input);
        int copiesIn = setArr.nextInt();
        System.out.println("HOW MANY COPIES YOU(for customer) WANT: "+ copiesIn);
        if(copiesIn < get.getCopies()){
           System.out.println("YOU PURCHASED "+get.getCopies()+ " COPIES");
            System.out.println(get.getPrice()*copiesIn); 
        }else if(copiesIn > get.getCopies()){
            System.out.println("INSUFFICIENT STOCK!!!!!!!!");
        }
        continueBookMenu(setArr.nextInt());
        menuforBook( setArr.nextInt());
    
    }else if(input == 4){
        System.out.println("Choice:: "+ input);
        get.setCopies(12);
        int orderNumber = setArr.nextInt();
        System.out.println("ENTER COPIES WANT TO ORDER(for shop): "+ orderNumber );
        if(orderNumber<get.getCopies()){
            System.out.println("ORDER SUCCESSFUL......");
            System.out.println("COPIES AVAILABLE: 12");
            System.out.println("=====================================");
            System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION");
            System.out.println("1.CONTINUE                   0.TERMINATE");
            int finalInp = setArr.nextInt();
            if(finalInp == 0){
                System.out.println("THANK YOU");
            } else if(finalInp == 1){
                System.out.println("CHOOSE ONE OF THE FOLLOWING");
                printMenu();  
                int finalfinalInp = setArr.nextInt();
                if( finalfinalInp == 1){
                    System.out.println("Choice:: "+ finalfinalInp);
                    printBookMenu();
                    menuforBook(setArr.nextInt());
                }else if(finalfinalInp == 2){
                    System.out.println("Choice:: "+ finalfinalInp);
                    magazine.printMagazineMenu();
                    magazine.magazineConsole(setArr.nextInt());
                }else if(finalfinalInp == 3){
                    System.out.println("Choice:: "+ finalfinalInp);
                    System.out.println("TOTAL SALE AMOUNT IS(to be paid by customer) = "+ get.getPrice()+get.getMagazinePrice());
                    System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION???");
                    System.out.println("1.CONTINUE   0.TERMINATE");
                    int thirdSelect = setArr.nextInt();
                    if(thirdSelect == 1){
                        printMenu();
                    }else if(thirdSelect == 0){
                        System.out.println("Thank you");
                    }
                    menuforBook(setArr.nextInt());
                }else if(finalfinalInp == 4){
                    System.out.println("Choice:: "+ finalfinalInp);
                    System.out.println("TOTAL REVENUE OF PUBLICATION IS: " + 5475 );
                    System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION???");
                    System.out.println("1.CONTINUE   0.TERMINATE");
                }


            }
        }
        
    }
}


   

 }
//end of loops
    


public book(){

}

//methods & functions//
public int console(int input){
    consoleIn = input;
   
    if(consoleIn == 1){  
        printBookMenu();
        loops loop = new loops();
        Scanner consoleIn = new Scanner(System.in);
        int next = consoleIn.nextInt();
        if(next == 1){
            System.out.println("Konnichiwa");
        loop.menuforBook(next);
    }else if(next == 2){}else if(next ==3){}else if(next ==4){};
        
    }else if(consoleIn == 2){
        Magazine magazine = new Magazine();
        magazine.printMagazineMenu();
    }else if(consoleIn ==3){
    }else if(consoleIn ==4){
    }
    return consoleIn;
}







public void continueBookMenu(int input){
    System.out.println("Do you want to continue with book section[1/0]");
     System.out.println("1.YES 0.NO");
     if(input == 1){
         System.out.println("Choice:: 1");
         printBookMenu();
     }else if(input == 0){
         System.out.println("Choice:: 0");
         System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION");
         System.out.println("1.CONTINUE             2.TERMINATE");
         if(global.nextInt() == 1){
         this.printMenu();
         }else if(global.nextInt()==0){
             System.out.println("Thank you");
         }

     }
}


public void printMenu(){
System.out.println("1.BOOK"+"                   "+"2.MAGAZINE");
System.out.println("3.TOTAL SALE AMOUNT" +"      "+"4.REVENUE OF PUBLICATION");

}

public void printBookMenu(){
System.out.println("   ");
System.out.println("          MENU   FOR   BOOK     ");
System.out.println("1.read book"+"                   "+"2.display");
System.out.println("3.sale copies" +"              "+"4.order copies");
    }










}

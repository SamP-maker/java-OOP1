import java.util.Scanner;

public class NumberPattern {

//print 12 3
//12 9 6 3 0 3 6 9 12

    public static void printNumPattern(int num1, int num2 ){
      int MAX_NUMBER_PATTERN = (num1/num2);
     

        int i;
        
                             //4
        for(i = 0; i < MAX_NUMBER_PATTERN+1; i++){
           int empty;

           empty = num1 - num2;
     System.out.print(num1 +" ");
          printNumPattern(empty, num2);
          

          if(i<=MAX_NUMBER_PATTERN  || i< Math.abs(MAX_NUMBER_PATTERN +1)){
               
             for(i = 0; i < Math.abs( MAX_NUMBER_PATTERN) || i< Math.abs(MAX_NUMBER_PATTERN +1); i++){
               
                for(i = 0; i < Math.abs( MAX_NUMBER_PATTERN) || i< Math.abs(MAX_NUMBER_PATTERN +1) ; i++){
                  empty += num1 + num2;
               }
                
                System.out.print(num1 +" ");
             }
              
          
      
           
        }
      }



}
    


       // TODO: Write recursive printNumPattern() method
      
       public static void main(String[] args) { 
          Scanner scnr = new Scanner(System.in);
          int num1;
          int num2;
          
          num1 = scnr.nextInt();
          num2 = scnr.nextInt();
          printNumPattern(num1, num2); 
       } 
    

}

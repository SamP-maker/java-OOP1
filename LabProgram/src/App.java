
public class App {
    public static int computeFibonacci(int N) {
        if(N<=1)
        return N;
        return computeFibonacci(N-1)+computeFibonacci(N-2);
        
    }


 
    public static void main(String[] args) {
       int N;      // F_N, starts at 0
 
       N = 4;
    
       System.out.println("F_" + N + " is " + computeFibonacci(N));
    }
 }
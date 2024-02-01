import java.util.*;
public class RainFall{
    public static void main(String args[]){
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        if(n<3) System.out.print("LIGHT");
        else if(n >= 3 && n < 7) System.out.print("MODERATE");
        else System.out.print("HEAVY");
    }
}
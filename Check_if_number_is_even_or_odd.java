import java.util.*;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        if(n%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}
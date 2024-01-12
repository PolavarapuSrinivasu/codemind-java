import java.util.*;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a);
        }
        else if(b>a && b>c)
        {
            System.out.print(b);
        }
        else
        {
            System.out.print(c);
        }
    }
}
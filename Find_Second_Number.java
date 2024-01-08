import java.util.*;
public class SecondNumber
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=a+(a-b);
        System.out.printf("%d",c);
    }
}
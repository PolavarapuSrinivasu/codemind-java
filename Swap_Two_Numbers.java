import java.util.*;
public class Swap
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.printf("%d
%d",a,b);
    }
}
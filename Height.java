import java.util.*;
public class Height
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int d=read.nextInt();
        System.out.print(n>d?n:d);
    }
}
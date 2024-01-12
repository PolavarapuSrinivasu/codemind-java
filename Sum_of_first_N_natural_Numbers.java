import java.util.*;
public class SumNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        System.out.print((n*(n+1))/2);
    }
}
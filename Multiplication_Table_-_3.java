import java.util.*;
public class SumNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int a=read.nextInt();
        int b=read.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}
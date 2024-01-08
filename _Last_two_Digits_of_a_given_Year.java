import java.util.*;
public class LastDigitsOfAGivenYear
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int l=a%100;
        if(l<10)
        {
            System.out.printf("0%d",l);
        }
        else
        {
            System.out.printf("%d",l);
        }
    }
}
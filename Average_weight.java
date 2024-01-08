import java.util.*;
public class ThirdBoyWeight
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b1=read.nextInt();
        int b2=read.nextInt();
        int b3=(a*3)-b1-b2;
        System.out.println(b3);
    }
}
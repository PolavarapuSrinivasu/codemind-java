import java.util.*;
public class DragonFruit
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        n=n-2;
        System.out.print((n%2==0 && n!=0)?"YES":"NO");
    }
}
import java.util.*;
public class HandShakes
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++)
        {
            int n1=read.nextInt();
            int n2=read.nextInt();
            if(n2%n1==0 || Math.abs(n1-n2)>=n1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
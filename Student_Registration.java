import java.util.*;
public class StudentRegistration
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=read.nextInt();
            int m=read.nextInt();
            int k=read.nextInt();
            System.out.println(((k+n)<=m?"YES":"NO"));
        }
    }
}
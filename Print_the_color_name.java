import java.util.*;
public class PrintColor
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        String c=read.nextLine();
        if(c.charAt(0)=='V')
        {
            System.out.print("Violet");
        }
        else if(c.charAt(0)=='I')
        {
            System.out.print("Indigo");
        }
        else if(c.charAt(0)=='B')
        {
            System.out.print("Blue");
        }
        else if(c.charAt(0)=='G')
        {
            System.out.print("Green");
        }
        else if(c.charAt(0)=='Y')
        {
            System.out.print("Yellow");
        }
        else if(c.charAt(0)=='O')
        {
            System.out.print("Orange");
        }
        else if(c.charAt(0)=='R')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print(-1);
        }
    }
}
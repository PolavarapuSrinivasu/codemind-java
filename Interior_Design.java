import java.util.*;
public class InteriorDesign
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x1=read.nextInt();
        int y1=read.nextInt();
        int x2=read.nextInt();
        int y2=read.nextInt();
        System.out.print((x1+y1)<=(x2+y2)?x1+y1:x2+y2);
    }
}
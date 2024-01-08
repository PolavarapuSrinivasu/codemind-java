import java.util.*;
public class AreaPerimeterofSquare
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int area=a*a,perimeter=a*4;
        System.out.printf("%d %d",area,perimeter);
    }
}
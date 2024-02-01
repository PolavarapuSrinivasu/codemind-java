import java.util.*;
public class Fever{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int f = read.nextInt();
        if(f>98)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
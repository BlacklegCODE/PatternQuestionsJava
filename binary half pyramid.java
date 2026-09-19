import java.util.*;
class first
{
    public static void main(String[] args)
    {
        int a = 5;

        for(int i = 1;i<=a;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                int c = i+j;
                if(c % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

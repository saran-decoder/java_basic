import java.util.*;

public class test2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int num = a;

            for (int j = 0; j < n; j++)
            {
                num += (1 << j) * b;  // Using bit-shifting to calculate powers of 2 (2^j)
                System.out.print(num + " ");
            }

            System.out.println("\n");
        }

        sc.close();
    }
}
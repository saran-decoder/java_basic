public class Tasks
{
    public static void main(String[] args)
    {
        // Task 1:
        // @    @   @   @   @
        // $    $   $   $   $
        // @    @   @   @   @
        // $    $   $   $   $
        // @    @   @   @   @
        // String x = "$";
        // String y = "@";
        // for (int i = 1; i <= 5; i++)
        // {
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         if (i % 2 == 0)
        //         {
        //             System.out.print(x+"\t");
        //         }
        //         else
        //         {
        //             System.out.print(y+"\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // Task 2:
        // a    b   c   d   e
        // f    g   h   i   j
        // k    l   m   n   o
        // p    q   r   s   t
        // u    v   w   x   y
        // char ch = 'a';
        // for (int i = 1; i <= 5; i++)
        // {
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         System.out.print(ch+"\t");
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // Task 3:
        // A    B   C   D   E
        // A    B   C   D   E
        // A    B   C   D   E
        // A    B   C   D   E
        // A    B   C   D   E
        // for (int i = 1; i <= 5; i++)
        // {
        //     char ch = 'A';
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         System.out.print(ch+"\t");
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // Task 4:
        // a    b   c   d   e
        // 1    2   3   4   5
        // f    g   h   i   j
        // 6    7   8   9   10
        // k    l   m   n   o
        // char ch = 'a';
        // int num = 1;
        // for (int i = 1; i <= 5; i++)
        // {
        //     if (i % 2 != 0)
        //     {
        //         for (int j = 1; j <= 5; j++)
        //         {
        //             System.out.print(ch + "\t");
        //             ch++;
        //         }
        //         System.out.println();
        //     }
        //     else
        //     {
        //         for (int j = 1; j <= 5; j++)
        //         {
        //             System.out.print(num + "\t");
        //             num++;
        //         }
        //         System.out.println();
        //     }
        // }


        // Task 5:
        // 1    2   3   4   5
        // a    b   c   d   e
        // 1    2   3   4   5
        // a    b   c   d   e
        // 1    2   3   4   5
        // for (int i = 1; i <= 5; i++)
        // {
        //     int num = 1;
        //     char ch = 'a';
        //     for (int j = 1; j <= 5; j++)
        //     {
        //         if (i % 2 != 0)
        //         {
        //             System.out.print(num + "\t");
        //             num++;
        //         }
        //         else
        //         {
        //             System.out.print(ch + "\t");
        //             ch++;
        //         }
        //     }
        //     System.out.println();
        // }


        // Task 6:
        // A    1   2   3   4
        // 5    B   6   7   8
        // 9    10  C   11  12
        // 13   14  15  D   16
        // 17   18  19  20  E
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (i == j)
                {
                    System.out.print(ch + "\t");
                    ch++;
                }
                else
                {
                    System.out.print(num + "\t");
                    num++;
                }
            }
            System.out.println();
        }
    }
}

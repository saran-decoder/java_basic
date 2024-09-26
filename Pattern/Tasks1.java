public class Tasks1
{
    public static void main(String[] args)
    {
        // Task 1;
        // a
        // b    c
        // d    e   f
        // g    h   i   j
        // k    l   m   n   o
        // char ch = 'a';
        // for (int i = 0; i < 5; i++)
        // {
        //     for (int j = 0; j <= i; j++)
        //     {
        //         System.out.print(ch + "\t");
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // Task 2:
        // 1
        // A    B
        // 2    3   4
        // C    E   F
        // 5    6   7   8   9 
        // int num = 1;
        // char ch = 'A';
        // for (int i = 1; i <= 5; i++)
        // {
        //     for (int j = 1; j <= i; j++)
        //     {
        //         if (i % 2 == 0)
        //         {
        //             System.out.print(ch + "\t");
        //             ch++;
        //         }
        //         else
        //         {
        //             System.out.print(num + "\t");
        //             num++;
        //         }
        //     }
        //     System.out.println();
        // }


        // Task 3:
        // @
        // #    #
        // @    @   @
        // #    #   #   #
        // @    @   @   @   @
        // for (int i = 1; i <= 5; i++)
        // {
        //     for (int j = 1; j <= i; j++)
        //     {
        //         if (i % 2 == 0)
        //         {
        //             System.out.print("#\t");
        //         }
        //         else
        //         {
        //             System.out.print("@\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // Task 4:
        // a
        // 1    2
        // a    b   c
        // 1    2   3   4
        // a    b   c   d   e
        // for (int i = 1; i <= 5; i++)
        // {
        //     int num = 1;
        //     char ch = 'a';
        //     for (int j = 1; j <= i; j++)
        //     {
        //         if (i % 2 == 0)
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


        // Task 5:
        // 1
        // 1    2
        // 1    2   3
        // 1    2   3   4
        // 1    2   3   4   5
        // for (int i = 1; i <= 5; i++)
        // {
        //     for (int j = 1; j <= i; j++)
        //     {
        //         System.out.print(j + "\t");
        //     }
        //     System.out.println();
        // }


        // Task 6:
        // 1
        // 1    2
        // 1    a   2
        // 1    a   b   2
        // 1    2   3   4   5
        for (int i = 1; i <= 5; i++)
        {
            int num = 1;
            char ch = 'a';
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || i == 5 || i == j)
                {
                    System.out.print(num + "\t");
                    num++;
                }
                else
                {
                    System.out.print(ch + "\t");
                    ch++;
                }
            }
            System.out.println();
        }
    }   
}

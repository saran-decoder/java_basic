class Tasks2
{
    public static void main(String[] args)
    {
        // Task 1:
        // *                *
        //      *       *
        //          *
        //      *       *
        // *                *
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                // if (i == 1 || i == 5 || j == 1 || j == 5)
                // {
                //     System.out.print("* ");
                // }
                // else if (i == 3 && j == 3)
                // {
                //     System.out.print("* ");
                // }
                // else
                // {
                //     System.out.print("  ");
                // }

                if (i == j || j == 5)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }


        // Task 2:
        // 1                2
        //      3       4
        //          5
        //      6       7
        // 8                9


        // Task 3:
        // *    *   *   *   *
        //      *
        //          *
        //              *
        // *    *   *   *   *


        // Task 4:
        // 1
        // 2    3
        // 4    a   5
        // 6    a   b   7
        // 8    9   10  11  12


        // Task 5:
        // a
        // b    c
        // d    1   e
        // f    2   3   g
        // h    4   5   6   i


        // Task 6:
        // a
        // a    b
        // a        b
        // a            b
        // a                b
    } 
}
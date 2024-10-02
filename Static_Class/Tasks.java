// 1. WAP to display all the odd numbers between 1 to n.
import java.util.Scanner;
// class odd
// {
//     public static void display(int n)
//     {
//         System.out.println("---- Result ----");
//         for (int i = 1; i <= n; i++)
//         {
//             if (i % 2 != 0)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }
// class Tasks
// {
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the 'N' Value: ");
//         int n = scanner.nextInt();
//         odd.display(n);

//         scanner.close();
//     }
// }


// 2. WAP to display all the even numbers between 1 to n in reverse order.
// class even
// {
//     public static void display(int n)
//     {
//         System.out.println("---- Result ----");
//         for (int i = n; i >= 1; i--)
//         {
//             if (i % 2 == 0)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }
// class Tasks
// {
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the 'N' Value: ");
//         int n = scanner.nextInt();
//         even.display(n);

//         scanner.close();
//     }
// }


// 3. WAP to display sum of all odd numbers between 1 to n.
// class sum
// {
//     public static void display(int n)
//     {
//         int sum = 0;
//         for (int i = 1; i <= n; i++)
//         {
//             if (i % 2 != 0)
//             {
//                 sum = sum + i;
//             }
//         }
//         System.out.println("Sum of odd numbers between 1 to " + n + " is: " + sum);
//     }
// }
// class Tasks
// {
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the 'N' Value: ");
//         int n = scanner.nextInt();
//         sum.display(n);

//         scanner.close();
//     }
// }


// 4. WAP to display all the multiples of 4 between 1 to n.
class multiples
{
    public static void display(int n)
    {
        for (int i = 1; i <= n; i++)
        {   
            if (i % 4 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
class Tasks
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 'N' Value: ");
        int n = scanner.nextInt();
        multiples.display(n);
        
        scanner.close();
    }
}
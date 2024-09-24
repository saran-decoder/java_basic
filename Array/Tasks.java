import java.util.Scanner;

class Tasks
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = scn.nextInt();

        // Create a int array for the user specified size, insert different values into it and display all the values in reverse order.
        // // 1. Create a Array
        // int[] arr = new int[size];

        // // 2. Insert a Value
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.nextInt();
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // for (int i = arr.length - 1; i >= 0; i--)
        // {
        //     System.out.print(arr[i]);
        // }


        // Create a int array for the user specified size, insert different values into it and display all the odd numbers.
        // // 1. Create a Array
        // int[] arr = new int[size];

        // // 2. Insert a Values
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.nextInt();
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     if (arr[i] % 2 != 0)
        //     {
        //         System.out.println(arr[i]);
        //     }
        // }
        

        // Create a int array for the user specified size, insert different values into it and display the sum of all the even numbers.
        // // 1. Create a Array
        // int[] arr = new int[size];

        // // 2. Insert a Values
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.nextInt();
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // int sum = 0;
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     if (arr[i] % 2 == 0)
        //     {
        //         sum = sum + arr[i]; 
        //     }
        // }
        // System.out.println(sum);


        // Create a double array for the user specified size, insert different values into it and display all the values greater than 20.2.
        // // 1. Create a Array
        // double[] arr = new double[size];

        // // 2. Insert a Values
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.nextDouble();
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     if (arr[i] > 20.2)
        //     {
        //         System.out.println(arr[i]);
        //     }
        // }


        // Create a double array for the user specified size, insert different values into it and display the sum of all the values less than 13.2.
        // // 1. Create a Array
        // double[] arr = new double[size];
        
        // // 2. Insert a Values
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.nextDouble();
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // double sum = 0;
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     if (arr[i] < 13.2)
        //     {
        //         sum = sum + arr[i];
        //     }
        // }
        // System.out.println(sum);


        // Create a char array for the user specified size, insert different values into it and display all the lower case chars.
        // // 1. Create a Array
        // char[] arr = new char[size];

        // // 2. Insert a Values
        // System.out.println("Enter a values:");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     arr[i] = scn.next().charAt(0);
        // }

        // // 3. Do Operation
        // System.out.println("---- Result ----");
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     if (Character.isLowerCase(arr[i]))
        //     {
        //         System.out.println(arr[i]);
        //     }
        // }


        // Create a char array for the user specified size, insert different values into it and display all the vowels.
        // 1. Create a Array
        char[] arr = new char[size];

        // 2. Insert a Values
        System.out.println("Enter a values:");
        for (int i = 0; i <= arr.length - 1; i++)
        {
            arr[i] = scn.next().charAt(0);
        }

        // 3. Do Operation
        System.out.println("---- Result ----");
        for (int i = 0; i <= arr.length - 1; i++)
        {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
            {
                System.out.println(arr[i]);
            }
        }
    }
}
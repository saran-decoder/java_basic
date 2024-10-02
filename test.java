// import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // String str = "madam";
        
        // // Remove spaces and convert to lowercase for case-insensitive check
        // String original = str.toLowerCase();
        
        // // Reverse the string
        // String reversed = "";
        // for (int i = original.length() - 1; i >= 0; i--) {
        //     reversed += original.charAt(i);
        // }
        
        // // Print original and reversed strings
        // System.out.println("Original: " + original);
        // System.out.println("Reversed: " + reversed);
        
        // // Check if the original string is equal to the reversed string
        // if (original.equals(reversed)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }

        // int num = 12;
        // int sum = 0;

        // for (int i = 1; i <= num - 1; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         sum += i;
        //     }
        // }

        // System.out.println("num: " + num);
        // System.out.println("sum: " + sum);

        // if (num == sum)
        // {
        //     System.out.println("Perfect number");
        // }
        // else
        // {
        //     System.out.println("Not perfect number");
        // }

        // int num = 3;
        // int count = 0;

        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         count++;
        //     }
        // }

        // System.out.println("num: " + num);
        // System.out.println("count: " + count);

        // if (count == 2)
        // {
        //     System.out.println("Prime number");
        // }
        // else
        // {
        //     System.out.println("Not prime number");
        // }

        // int num = 6;

        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }

        // int len = 8;
        // int f1 = 0;
        // int f2 = 1;
        // int f3 = f1 + f2;
        // while (len > 0) {
        //     System.out.println(f1);
        //     f1 = f2;
        //     f2 = f3;
        //     f3 = f1 + f2;
        //     len--;
        // }

        String str = "Hello World";
        char ch = ' ';
        for (int i = str.length()-1; i >= 0; i--)
        {
            ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
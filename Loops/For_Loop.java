class For_Loop {
    public static void main(String[] args) {

        // 1. WAP to print "Hello Dinga" 10 times.
        // for (int i = 1; i <= 10; i++)
        // {
        //     System.out.println("Hello, Dinga!");
        // }

        // 2. WAP to print all the numbers between 11 to 25
        // for (int i = 11; i <= 25; i++)
        // {
        //     System.out.println(i);
        // }

        // 3. WAP to print all the numbers between 21 to 41 in the reverse order
        // for (int i = 41; i >= 21; i--)
        // {
        //     System.out.println(i);
        // }

        // 4. WAP to print all the even numbers between 51 to 71 in the reverse order
        // for (int i = 70; i >= 50; i--)
        // {
        //     if (i % 2 == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }

        // 5. WAP to print all the odd numbers between 22 to 44
        // for (int i = 22; i <= 44; i++)
        // {
        //     if (i % 2 != 0)
        //     {
        //         System.out.println(i);
        //     }
        // }


        // TODAY 3/9/2024

        // 1. WAP to print sum of all the numbers between 21 to 31.
        // int sum = 0;
        // for (int i = 21; i <= 31; i++)
        // {
        //     sum = sum + i;
        // }
        // System.out.println(sum); // 286

        // 2. WAP to print sum of all even numbers between 44 to 55.
        // int sum = 0;
        // for (int i = 44; i <= 55; i++)
        // {
        //     if (i % 2 == 0)
        //     {
        //         sum = sum + i;
        //     }
        // }
        // System.out.println(sum); // 294

        // 3. WAP to print sum of all odd numbers between 71 to 101.
        // int sum = 0;
        // for (int i = 71; i <= 101; i++)
        // {
        //     if (i % 2 != 0)
        //     {
        //         // sum++;
        //         // sum = sum + i;
        //     }
        // }
        // System.out.println(sum); // 16 or 1376

        // 4. WAP to count the even numbers between 1001 to 2001.
        // int count = 0;
        // for (int i = 1001; i <= 2001; i++)
        // {
        //     if (i % 2 == 0)
        //     {
        //         count = count + i;
        //     }
        // }
        // System.out.println(count); // 750500

        // 5. WAP to count the odd numbers between 555 to 999.
        // int count = 0;
        // for (int i = 555; i <= 999; i++)
        // {
        //     count = count + 1;
        // }
        // System.out.println(count); // 445

        // 6. WAP to print all the multiple of 6 between 1 to 100.
        // for (int i = 1; i <= 100; i++)
        // {
        //     if (i % 6 == 0)
        //     {
        //         System.out.println(i); 
        //     }
        // }
        // 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90, 96

        // 7. WAP to print all the multiple of 8 between 101 to 301.
        // for (int i = 101; i <= 301; i++)
        // {
        //     if (i % 8 == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }
        // 104, 112, 120, 128, 136, 144, 152, 160, 168, 176, 184, 192, 200, 208, 216, 224, 232, 240, 248, 256, 264, 272, 280, 288, 296, 296

        // 8. WAP to print 7 table.
        // for (int i = 1; i <= 10; i++)
        // {
        //     System.out.println("7 x " + i + " = " + (7 * i));
        // }
        // 7 x 1 = 7
        // 7 x 2 = 14
        // 7 x 3 = 21
        // 7 x 4 = 28
        // 7 x 5 = 35
        // 7 x 6 = 42
        // 7 x 7 = 49
        // 7 x 8 = 56
        // 7 x 9 = 63
        // 7 x 10 = 70

        // 9. WAP to print 9 table.
        // for (int i = 1; i <= 10; i++)
        // {
        //     System.out.println("9 x " + i + " = " + (9 * i));
        // }
        // 9 x 1 = 9
        // 9 x 2 = 18
        // 9 x 3 = 27
        // 9 x 4 = 36
        // 9 x 5 = 45
        // 9 x 6 = 54
        // 9 x 7 = 63
        // 9 x 8 = 72
        // 9 x 9 = 81
        // 9 x 10 = 90


        // Today 04/09/2024

        // 1. WAP to print factors of a given number 6.
        // int num = 6;
        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }
        // 1, 2, 3, 6.

        // 2. WAP to print sum of factors of a given number 100.
        // int num = 100;
        // int sum = 0;
        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         sum = sum + i;
        //     }
        // }
        // System.out.println("Sum of factors of " + num + " is " + sum);
        // Sum of factors of 100 is  1 + 2 + 4 + 5 + 10 + 20 + 25 + 50 + 100 = 217.

        // 3. WAP to print count of factors of a given number 6.
        // int num = 6;
        // int count = 0;
        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         count++;
        //     }
        // }
        // System.out.println("Count of factors of " + num + " is " + count);
        // Count of factors of 6 is 4.

        // 4. WAP to check of a given number is prime number or not.
        // int num = 7;
        // int count = 0;
        // for (int i = 1; i <= num; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         count++;
        //     }
        // }
        // if (count == 2)
        // {
        //     System.out.println(num + " is a prime number.");
        // }
        // else
        // {
        //     System.out.println(num + " is not a prime number.");
        // }
        // 7 is a prime number.

        // 5. WAP to check if a given number is prefect number or not.
        // int num = 12;
        // int sum = 0;
        // for (int i = 1; i <= num - 1; i++)
        // {
        //     if (num % i == 0)
        //     {
        //         sum = sum + i;
        //     }
        // }
        // System.out.println("num = " + num);
        // System.out.println("sum = " + sum);
        // if (sum == num)
        // {
        //     System.out.println(num + " is a perfect number.");
        // }
        // else
        // {
        //     System.out.println(num + " is not a perfect number.");
        // }
        // 12 is a not perfect number.
    }
}
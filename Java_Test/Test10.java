// WAP to check if a given number is palindrome or not (While Loop).
class Test10
{
    public static void main(String[] args)
    {
        int num = 123821;
        int n = num;
        int rev = 0;
        while (n != 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (num == rev)
        {
            System.out.println(num + " is a palindrome number");
        }
        else
        {
            System.out.println(num + " is not a palindrome number");
        }
    }
}

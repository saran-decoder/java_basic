// WAP to print factors of a given number (For Loop).
class Test5
{
    public static void main(String[] args)
    {
        int num = 6;
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
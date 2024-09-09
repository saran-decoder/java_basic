// WAP to print all the multiple of 9 between 1 to 100 (For Loop).
class Test3
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 9 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

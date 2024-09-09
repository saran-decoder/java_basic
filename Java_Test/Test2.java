// WAP to print all the odd numbers between 51 to 101 (While Loop).
class Test2
{
    public static void main(String[] args)
    {
        int i = 51;
        while (i <= 101)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}

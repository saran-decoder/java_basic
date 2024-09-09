// WAP to check if a given number is prefect number or not (For Loop).
class Test9
{
    public static void main(String[] args)
    {
        int num = 6;
        int sum = 0;
        for (int i = 1; i <= num - 1; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == num)
        {
            System.out.println(num + " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }
    }
}

class Test7 {
    public static void main(String[] args) {
        int num = 8;
        int count = 0;
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is a not prime number");
        }
    }
}

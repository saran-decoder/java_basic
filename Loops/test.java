class test
{
    public static void main(String[] args)
    {
        int num = 12321;
        // int copy = num;
        int rem = 0;
        int rev = 0;
        while(num > 0)
        {
            rem = num % 10;
            // System.out.println("reminder: " + rem);
            rev = rev * 10 + rem;
            // System.out.println("reverse: " + rev);
            num = num / 10;
            // System.out.println("num value: " + num);
        }
        System.out.println("copy value: " + num);
        if (num == rev) {
            System.out.println("p");
        }
        else
        {
            System.out.println("n p");
        }
    }
}

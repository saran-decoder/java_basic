class Test8 {
    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 != 0)
            {
                System.out.print(rem + " ");
            }
            n = n / 10;
        }
    }
}

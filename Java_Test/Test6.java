class Test6 {
    public static void main(String[] args) {
        int n = 12345;
        int num = n;
        while (num != 0)
        {
            int rem = num % 10;
            System.out.println("Digit is: " + rem);
            num = num / 10;
        }
    }
}

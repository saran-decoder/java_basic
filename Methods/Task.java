class Task
{
    // Write a method that accepts 2 String value and return nothing.
    // public static void main(String[] args)
    // {
    //     System.out.println("Hai Bro");
    //     next();
    //     System.out.println("Bye Bro");
    // }
    // public static void next()
    // {
    //     System.out.println("Next Method");
    // }
    
    // Write a method that accepts 1 double, 1 int, 1 char value and return string value.
    // public static void main(String[] args)
    // {
    //     double d = 10.0;
    //     int i = 100;
    //     char c = 'A';
    //     System.out.println("Hai Bro");
    //     String r = next(d, i, c);
    //     System.out.println(r);
    //     System.out.println("Bye Bro");
    // }
    // public static String next(double d, int i, char c)
    // {
    //     System.out.println("Double Value: " + d);
    //     System.out.println("Int Value: " + i);
    //     System.out.println("Char Value: " + c);
    //     return "This is the next method return";
    // }
    
    // Write a method that accepts 1 int, 1 boolean, 1 string, 1 char value and return double value.
    // public static void main(String[] args)
    // {
    //     int i = 100;
    //     boolean b = true;
    //     String s = "Hello";
    //     char c = 'B';
    //     System.out.println("Hai Bro");
    //     double r = next(i, b, s, c);
    //     System.out.println(r);
    //     System.out.println("Bye Bro");
    // }
    // public static double next(int i, boolean b, String s, char c)
    // {
    //     System.out.println("Int Value: " + i);
    //     System.out.println("Boolean Value: " + b);
    //     System.out.println("String Value: " + s);
    //     System.out.println("Char Value: " + c);
    //     return 10.0;
    // }
    
    // Write a method that accepts 2 float, 2 double value and return long value.
    // public static void main(String[] args)
    // {
    //     float f1 = 10.0f;
    //     float f2 = 20.0f;
    //     double d1 = 100.0;
    //     double d2 = 200.0;
    //     System.out.println("Hai Bro");
    //     long r = next(f1, f2, d1, d2);
    //     System.out.println(r);
    //     System.out.println("Bye Bro");
    // }
    // public static long next(float f1, float f2, double d1, double d2)
    // {
    //     System.out.println("Float Value 1: " + f1);
    //     System.out.println("Float Value 2: " + f2);
    //     System.out.println("Double Value 1: " + d1);
    //     System.out.println("Double Value 2: " + d2);
    //     return 1000000000L;
    // }


    // WAP to 
    public static void main(String[] args)
    {
        int i = 10;
        System.out.println("Before increment: " + i);
        i = increment(i);
        System.out.println("After increment: " + i);
    }
    public static int increment(int i)
    {
        i++;
        return i;
    }
}
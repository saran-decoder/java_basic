class Tasks
{
    // WAP to print char by char for a given string value.
    // public static void main(String[] args)
    // {
    //     String str = "Hello World";
    //     char ch = ' ';
    //     for (int i = 0; i <= str.length()-1; i++)
    //     {
    //         ch = str.charAt(i);
    //         System.out.println(ch);
    //     }
    // }


    // WAP to print char by char for a given string value in reverse order.
    // public static void main(String[] args)
    // {
    //     String str = "Hello World";
    //     char ch = ' ';
    //     for (int i = str.length()-1; i >= 0; i--)
    //     {
    //         ch = str.charAt(i);
    //         System.out.println(ch);
    //     }
    // }


    // WAP to print only the upper case alphabets from a given string.
    public static void main(String[] args)
    {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
            {
                System.out.println(ch);
            }
        }
    }
}
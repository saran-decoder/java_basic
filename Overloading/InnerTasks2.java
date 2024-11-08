import java.util.Scanner;
class Tasks2
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        AmazonPayment AP = new AmazonPayment();
        System.out.println("1.COD Payment\n2.UPI Payment\n3.Card Payment\n4.Login Account");
        System.out.println("Please make a Choice");
        int choice = scn.nextInt();
        switch (choice)
        {
            case 1:
                AP.Payment();
                break;

            case 2:
                System.out.println("Enter UPI");
                int UPI = scn.nextInt();
                AP.Payment(String UPI);
                break;

            default:
                System.out.println("Invalid Choice!!");
        }
        scn.close();
    }    
}

class AmazonPayment
{
    public void Payment()
    {
        System.out.println("COD");
    }

    public void Payment(String UPI)
    {
        System.out.println("Payment Done Via UPI...");
    }

    public void Payment(long cardNo, int CVV)
    {
        System.out.println("Payment Done Via Internet Banking...");
    }

    public void Payment(String userName, String Password)
    {
        System.out.println("Login Done Via Account...");
    }
}

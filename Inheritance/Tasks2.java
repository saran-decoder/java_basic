public class Tasks2
{
    public static void main(String[] args)
    {
        PhonePeV1 v1 = new PhonePeV1();
        v1.login();
        v1.sendMoney();
        v1.checkBalance();
        v1.recharge();
        v1.logout();
        System.out.println("-----------------");
        PhonePeV2 v2 = new PhonePeV2();
        v2.login();
        v2.sendMoney();
        v2.checkBalance();
        v2.recharge();
        v2.payBills();
        v2.bookTickets();
        v2.logout();
    }
}

class PhonePeV1
{
    public void login()
    {
        System.out.println("Login Done");
    }

    public void sendMoney()
    {
        System.out.println("Sended Money");
    }

    public void checkBalance()
    {
        System.out.println("Balance Check Done");
    }

    public void recharge()
    {
        System.out.println("Recharged");
    }

    public void logout()
    {
        System.out.println("Logout Done");
    }
}
class PhonePeV2 extends PhonePeV1
{
    public void payBills()
    {
        System.out.println("Bills Payed");
    }

    public void bookTickets()
    {
        System.out.println("Booked Tickets");
    } 
}
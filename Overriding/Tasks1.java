class Tasks
{
    public static void main(String[] args)
    {
        AmazonV1 V1 = new AmazonV1();
        V1.login();
        V1.pay();
        V1.shop();
        V1.logout();
        System.out.println("------------------------");
        AmazonV2 V2 = new AmazonV2();
        V2.login();
        V2.pay();
        V2.sharePost();
        V2.();
        V2.music();
        V2.prime();
        V2.logout();
    }
}

class AmazonV1
{
    public void login()
    {
        System.out.println("Login Done...");
    }

    public void reels()
    {
        System.out.println("30 Sec Reels Uploaded...");
    }

    public void sharePost()
    {
        System.out.println("Shared Post Via Instagram...");
    }

    public void message()
    {
        System.out.println("Message S/R...");
    }

    public void like()
    {
        System.out.println("Like Done...");
    }

    public void logout()
    {
        System.out.println("Logout Done...");
    }
}

class AmazonV2 extends AmazonV1
{
    /**
     * 
     */
    @Override
    public void reels()
    {
        System.out.println("90 Sec Reels Uploaded...");
    }

    /**
     * 
     */
    @Override
    public void sharePost()
    {
        System.out.println("Shar Post Via Instagam/WhatsApp/Gmail/Twitter...");
    }
}
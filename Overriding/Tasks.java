class Tasks
{
    public static void main(String[] args)
    {
        InstagramV1 V1 = new InstagramV1();
        V1.login();
        V1.reels();
        V1.sharePost();
        V1.message();
        V1.like();
        V1.logout();
        System.out.println("------------------------");
        InstagramV2 V2 = new InstagramV2();
        V2.login();
        V2.reels();
        V2.sharePost();
        V2.message();
        V2.like();
        V2.logout();
    }
}

class InstagramV1
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

class InstagramV2 extends InstagramV1
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
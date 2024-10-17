public class Tasks
{
    public static void main(String[] args)
    {
        InstagramV1 v1 = new InstagramV1();
        v1.login();
        v1.message();
        v1.like();
        v1.reels();
        v1.logout();
        System.out.println("-----------------");
        InstagramV2 v2 = new InstagramV2();
        v2.login();
        v2.message();
        v2.like();
        v2.reels();
        v2.sharePost();
        v2.uploadPost();
        v2.logout();
    }
}

class InstagramV1
{
    public void login()
    {
        System.out.println("Login Done");
    }

    public void message()
    {
        System.out.println("Message S/R");
    }

    public void like()
    {
        System.out.println("Liked Done");
    }

    public void reels()
    {
        System.out.println("Reels Uploaded");
    }

    public void logout()
    {
        System.out.println("Logout Done");
    }
}
class InstagramV2 extends InstagramV1
{
    public void sharePost()
    {
        System.out.println("Post Shared");
    }

    public void uploadPost()
    {
        System.out.println("Post Uploaded");
    } 
}

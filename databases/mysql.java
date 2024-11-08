package databases;

public class mysql implements database
{
    @Override
    public void connect()
    {
        System.out.println("MySQL database is connected!");
    }

    @Override
    public void disconnect()
    {
        System.out.println("MySQL database is disconnected!");
    }
}
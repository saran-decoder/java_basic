package databases;

public class oracle implements database
{
    @Override
    public void connect()
    {
        System.out.println("Oracle database is connected!");
    }

    @Override
    public void disconnect()
    {
        System.out.println("Oracle database is disconnected!");
    }
}

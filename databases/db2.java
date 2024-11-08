package databases;

public class db2 implements database
{
    @Override
    public void connect()
    {
        System.out.println("DB2 is connected!");
    }

    @Override
    public void disconnect()
    {
        System.out.println("DB2 is disconnected!");
    }
}

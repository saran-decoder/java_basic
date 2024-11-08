package databases;

public class mssql implements database
{
    @Override
    public void connect()
    {
        System.out.println("MSSQL database is connected!");
    }

    @Override
    public void disconnect()
    {
        System.out.println("MSSQL database is disconnected!");
    }
}

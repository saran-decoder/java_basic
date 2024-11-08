package databases;
import java.util.Scanner;

public class mainclass
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n1. Oracle\n2. MySQL\n3. MsSQL\n4. Db2\n");
        System.out.print("Enter your choice: ");
        int choice = scn.nextInt();
        System.out.println();
        switch (choice)
        {
            case 1:
                oracle orc = new oracle();
                orc.connect();
                orc.disconnect();
                break;
            case 2:
                mysql my = new mysql();
                my.connect();
                my.disconnect();
                break;
            case 3:
                mssql ms = new mssql();
                ms.connect();
                ms.disconnect();
                break;
            case 4:
                db2 db = new db2();
                db.connect();
                db.disconnect();
                break;
            default:
                System.out.println("Invalid choice");
        }
        scn.close();
    }
}

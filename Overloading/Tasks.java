import java.util.Scanner;
class Tasks
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        TrainSearch TS = new TrainSearch();
        System.out.println("1.Search via trainNo\n2.Search via trainName");
        System.out.println("Please make a Choice");
        int choice = scn.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter trainNo");
                int trainNo = scn.nextInt();
                TS.Search(trainNo);
                break;

            case 2:
                System.out.println("ENter trainName");
                String trainName = scn.next();
                TS.Search(trainName);
                break;

            default:
                System.out.println("Invalid Choice!!");
        }
        scn.close();
    }
}

class TrainSearch
{
    public void Search(int trainNo)
    {
        System.out.println("Train searching done successful via trainNo!!");
    }

    public void Search(String trainName)
    {
        System.out.println("Train searching done successful via trainName!!");
    }
}
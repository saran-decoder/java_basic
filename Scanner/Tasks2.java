import java.util.Scanner;

class Task2
{
    public static void main(String[] args)
    {
        // WAP to read and display Employee details.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter Employee Department:");
        String department = sc.next();
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + department);


        // WAP to read and display Mobile details.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        String number = sc.nextLine();
        System.out.println("Enter Mobile Brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Mobile Model:");
        String model = sc.nextLine();
        System.out.println("Enter Mobile Price:");
        int price = sc.nextInt();
        System.out.println("Enter Mobile Color:");
        String color = sc.nextLine();
        System.out.println("Enter Mobile RAM:");
        int ram = sc.nextInt();
        System.out.println("Enter Mobile Storage:");
        int storage = sc.nextInt();
        System.out.println("Enter Mobile Battery:");
        int battery = sc.nextInt();
        System.out.println("Enter Mobile Operating System:");
        String os = sc.nextLine();
        System.out.println("Enter Mobile Processor:");
        String processor = sc.nextLine();
        System.out.println("Enter Mobile Rear Camera:");
        int rear = sc.nextInt();
        System.out.println("Enter Mobile Front Camera:");
        int front = sc.nextInt();
        System.out.println("Enter Mobile Weight:");
        int weight = sc.nextInt();
        System.out.println("Enter Mobile Dimension:");
        int dimension = sc.nextInt();
        System.out.println("=============================");
        System.out.println("Mobile Number: " + number);
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
        System.out.println("Mobile Color: " + color);
        System.out.println("Mobile RAM: " + ram);
        System.out.println("Mobile Storage: " + storage);
        System.out.println("Mobile Battery: " + battery);
        System.out.println("Mobile Operating System: " + os);
        System.out.println("Mobile Processor: " + processor);
        System.out.println("Mobile Rear Camera: " + rear);
        System.out.println("Mobile Front Camera: " + front);
        System.out.println("Mobile Weight: " + weight);
        System.out.println("Mobile Dimension: " + dimension);
    }
}
import java.util.Scanner;

// WAP to find the area of rectangle (Formula = length * breadth)
// class Task
// {
//     public void display(double length, double breadth)
//     {
//         double rectangle = length * breadth;
//         System.out.println("Rectangle --> " + rectangle);
//     }
// }
// class Tasks
// {
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter length value: ");
//         double length = scn.nextDouble();
//         System.out.print("Enter breadth value: ");
//         double breadth = scn.nextDouble();
//         Task t = new Task();
//         t.display(length, breadth);

//         scn.close();
//     }
// }


// WAP to find the area of square (Formula = side * side)
// class Task
// {
//     public void display(double side)
//     {
//         double square = side * side;
//         System.out.println("Square --> " + square);
//     }
// }
// class Tasks
// {
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter square value: ");
//         double square = scn.nextDouble();
//         Task t = new Task();
//         t.display(square);

//         scn.close();
//     }
// }


// WAP to find the area of circle (Formula = 3.14 * radius * radius)
class Task
{
    public void display(double radius)
    {
        double circle = 3.14 * radius * radius;
        System.out.println("Circle --> " + circle);
    }
}
class Tasks
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter circle value: ");
        double circle = scn.nextDouble();
        Task t = new Task();
        t.display(circle);

        scn.close();
    }
}
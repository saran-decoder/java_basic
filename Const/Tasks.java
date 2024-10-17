// Tasks:

// 1. Create a Faculty class with the attributes name, salary, age and cname. Initialize these attributes with the help of constructor for 4 faculty and display their details.
class Tasks
{
    public static void main(String[] args)
    {
        Faculty f1 = new Faculty("Sakthi", 20000, 23);
        Faculty f2 = new Faculty("Raja", 24000, 28);
        Faculty f3 = new Faculty("Pandy", 40000, 30);
        Faculty f4 = new Faculty("Sarath", 18000, 22);

        System.out.println("Name\t\tSalary\t\tAge\t\tCName");
        System.out.println("-----------------------------------------------------");
        
        System.out.ptintln();
        System.out.ptintln();
        System.out.ptintln();
        System.out.ptintln();
    }
}
class Faculty
{
    String name;
    int salary;
    int age;
    static String cname = "Zara";

    public Faculty(String x, int y, int z)
    {
        name = x;
        salary = y;
        age = z;
    }
}


// 2. Create a Actor class with the attributes name, age, nom, noh and nof. Initialize these attributes with the help of constructor for 5 actor and display their details.

    // nom  ->  no of movies
    // noh  ->  no of hits
    // nof  ->  no of flops


// 3. Create a Pen class with the attributes name, price, color and yom. Initialize these attributes with the help of constructor for 6 pen and display their details.

    // yom  ->  year of manufacture.
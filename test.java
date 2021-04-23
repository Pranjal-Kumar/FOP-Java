package helloworld;

public class test {
    public static void main(String[] args) {
//        Square s1 = new Square();
//        Square s2 = new Square();
//        s1.length=10f;
//        s2.length=20f;
//        System.out.println(s1.area());
//        System.out.println(s2.area());

//
//        Student s1 = new Student();
//        s1.rollno=1056;
//        s1.name="karan";
//        s1.cgpa=8.8;
//        s1.displayProfile();
//        System.out.println("Percentage of s1 is " + s1.findPercentage());

//        TestClass c1 = new TestClass(2, 5.2);
//        TestClass c2 = new TestClass(3, 7.5);
//        System.out.println(c1.a + ", " + c1.b);


//        MovieTicket ticket = new MovieTicket(10);
//        int totalPrice = ticket.calculateCost(100);
//        System.out.println(totalPrice);

//        Person p = new Person("Ankit");
//        p.setName("Ankit");

//       Ball b = new Ball();
//        b.spinAndBounce();

        TestClass c1 = new TestClass(2, 5.2);
        TestClass c2 = new TestClass(3, 7.5);
        System.out.println(c1.a + ", " + c1.b);


    }
}

class TestClass {

    public int a;
    public double b;

    public TestClass(int first, double second) {
        this.a = first;
        this.b = second;
    }
}

class Ball {
    public  String state;


    public  void bounce() {
        state = "bouncing";
        System.out.println("Ball is bouncing");
    }

    public  void spin() {
        state = "spinning";
        System.out.println("Ball is spinning");
    }

    public  void spinAndBounce() {
        spin();
        bounce();
    }
}

class Demo {
    private int var;

    private Demo(int var) {
        this.var = var;
    }

    private void setVar(int var) {
        this.var = var;
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }



//    public String getName() {
//        return name;
//    }


    public void setName(String name) {
        this.name = name;
    }
}

class MovieTicket {


    public int singleTicketCost;

    public MovieTicket(int singleTicketCost) {
        this.singleTicketCost = singleTicketCost;
    }

    public int calculateCost(int quantity) {
        return quantity * singleTicketCost;
    }
}

class Square {
    public float length;

    public float area() {
        return length * length;
    }
}
class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here



    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}


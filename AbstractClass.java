package helloworld;
import java.util.*;
public class AbstractClass {


}
//class School {
//    protected String name;
//    protected int numStudents;
//
//    public School(String name, int numStudents) {
//        this.name = name;
//        this.numStudents = numStudents;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getNumStudents() {
//        return this.numStudents;
//    }
//}
//class University1 extends School {
//    private final String type = "University";
//    private boolean isPublic;
//
//    public University1(String name, int numStudents, boolean isPublic) {
//        super(name,numStudents);
//        this.isPublic = isPublic;
//    }
//
//    public boolean getIsPublic() {
//        return this.isPublic;
//    }
////}
//
//class University1 extends School {
//    private final String type = "University";
//    private boolean isPublic;
//
//    public University1(String name, int numStudents, boolean isPublic) {
//        super(name, numStudents);
//        this.name = name;
//        this.numStudents = numStudents;
//        this.isPublic = isPublic;
//    }
//
//    public boolean getIsPublic() {
//        return this.isPublic;
//    }
//}



//class Shape {
//    public Shape() {
//        super();
//        System.out.println("inside Shape class default constructor");
//    }
//}
//
//class Rectangle extends Shape {
//    public Rectangle() {
//        super();
//        System.out.println("inside Rectangle class default constructor");
//    }
//}
//
//class Square1 extends Rectangle {
//    public Square1() {
//        super();
//        System.out.println("inside Square class default constructor");
//    }
//}
//
//class ConstructorChain {
//    public static void main(String[] args) {
//        Square1 sq = new Square1();
//    }
//}

//class Rectangle {
//    public int upperLeftX;
//    public int upperLeftY;
//    public int lowerRightX;
//    public int lowerRightY;
//}
//class Point extends Rectangle{
//    public void Point(int upperLeftX, int upperLeftY, int lowerRightX, int lowerRightY){
//        this.upperLeftX=upperLeftX;
//        this.upperLeftY=upperLeftY;
//        this.lowerRightX=lowerRightX;
//        this.lowerRightY=lowerRightY;
//    }
//
//
//}

class Rectangle {
    public double width;
    public double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +  (width * height) ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }
}
class Square1 extends Rectangle{
    public Square1(double width, double height) {
        super(width, height);
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Area of Square is: " +  (width * height) ) ;
    }
    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }

}

class Calculate {



    public void compute(int num) {

        System.out.println("Square of the number is = " +(num*num));

    }

}


class Polymorphism extends Calculate {



          // How can you define the compute method here so that you can override the compute method defined in class Calculate?  {

//          System.out.println("Square root of the number is = " + Math.sqrt(num));

}

//class Coffee
//{
//    protected void order()
//    {
//        System.out.println("Coffee");
//    }
//}
//
//class Cappuccino extends Coffee
//{
//    public static void main(String args[])
//    {
//        Cappuccino c = new Cappuccino();
//        c.order();
//
//    }
//}

//class Scientist {
//    private String theory = ("Science");
//    public void printTheory() {
//        System.out.println(theory);
//    }
//}
//class Godel extends Scientist {
//    private String theory = ("Mathematics");
//    public void printTheory() {
//        System.out.println(theory);
//    }
//}
//
//class Tesla extends Scientist {
//    private String theory = ("Physics");
//
//    public void printTheory() {
//        System.out.println(theory);
//    }
//
//    public static void main(String args[]) {
//        List<Scientist> team = new ArrayList<>();
//        team.add(new Godel());
//        team.add(new Tesla());
//
//        System.out.println("Scientist list");
//        for (Scientist scientist : team) {
//            scientist.printTheory();
//        }
//    }
//}

class Demo1
{
    public static class superclass
    {
       static void print()
        {
            System.out.println("superclass.");
        }
    }

    public static class subclass extends superclass
    {

        static void print()
        {
            System.out.println("subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set();

//    abstract final public void get();

}

//class Test extends demo
//{
//
//    public void set(int a)
//    {
//        this.a = a;
//    }
//
//    final public void get()
//    {
//        System.out.println("a = " + a);
//    }
//
//    public static void main(String[] args)
//    {
//        Test obj = new Test();
//        obj.set(2);
//        obj.get();
//    }
//}
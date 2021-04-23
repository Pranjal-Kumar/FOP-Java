package helloworld;
//
//interface SwordFighter {
//    int maxSwordsWielded = 2;
//    void escape();
//    void showWeapon();
//    void attack();
//}
//// Write your implementation for the SwordFighter interface here
//
//class Knight implements SwordFighter {
//
//    @Override
//    public void attack() {
//        System.out.println("Knight stops the horse and attacks");
//    }
//
//    @Override
//    public void escape() {
//        System.out.println("Knight climbs the horse and flees");
//    }
//
//    // please write the showWeapon() method for the Knight class here.
//    // It should print out "Shows Sword" in a new line
//    public void showWeapon(){
//       System.out.println("Shows Sword");
//    }
//}
//
//class Ninja implements SwordFighter {
//
//    @Override
//    public void attack() {
//        System.out.println("Ninja steps forward and attacks");
//    }
//
//    @Override
//    public void escape() {
//        System.out.println("Ninja gets into forest and flees");
//    }
//
//    @Override
//    // please write the showWeapon() method for the Ninja class here.
//    // It should print out "Shows Katana" in a new line
//    public void showWeapon(){
//        System.out.println("Shows Katana");
//    }
//}
//
//class Source {
//    public static void main(String[] args) {
//        //Interface variables are implicitly static and final
//        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);
//
//        Knight knight = new Knight();
//        Ninja ninja = new Ninja();
//
//        knight.showWeapon();
//        ninja.showWeapon();
//
//        knight.attack();
//        ninja.attack();
//
//        knight.escape();
//        ninja.escape();
//    }
//
//}

//Please do not change the class names provided, and edit only the indicated sections.

import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public Quadrilateral(double side1, double side2, double height) {
        this.side1=side1;
        this.side2=side2;
        this.side3=height;
    }

    public Quadrilateral(double side, double height) {
        this.side1=side;
        this.side2=height;
    }

    public Quadrilateral(double side) {
        this.side1=side;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral {
    public Parallelogram(double side1, double side2, double height) {
        super(side1,side2,height);

    }
    @Override
    protected double getPerimeter() {
        return 2*(side1+side2);
    }

    @Override
    protected double getArea() {
        return side1*side3;
    }
}

// Implement the Rhombus class
class Rhombus extends Quadrilateral{
    public Rhombus(double side, double height) {
        super(side,height);
    }
    @Override
    protected double getPerimeter() {
        return 4*side1;
    }
    @Override
    protected double getArea() {
        return side1*side2;
    }
}

// Implement the Rectangle class
class Rectangle1 extends Quadrilateral{
    public Rectangle1(double length, double breadth) {
        super(length,breadth);
    }
    @Override
    protected double getPerimeter() {
        return 2*(side1+side2);
    }

    @Override
    protected double getArea() {
        return side1*side2;
    }
}

// Implement the Square class
class Square2 extends Quadrilateral{
    public Square2(double side) {
        super(side);
    }
    @Override
    protected double getPerimeter() {
        return 4*side1;
    }

    @Override
    protected double getArea() {
        return side1*side1;
    }
}

// Do not edit the Test class
class Source {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle1 rectangle = new Rectangle1(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square2 square = new Square2(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}

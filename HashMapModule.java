package helloworld;

import java.util.Hashtable;

public class HashMapModule {
    public static void main(String[] args) {
        Hashtable<String,Integer> emails= new Hashtable<String,Integer>();
        emails.put("chandler.bing@xyz.com",1);
        emails.put("ross.geller@xyz.com",2);
        emails.put("rachel.greene@xyz.com",3);
        emails.put("joey.tribbiani@xyz.com",4);
        emails.put("monica.geller@xyz.com",5);
        emails.put("phoebe.buffay@xyz.com",6);
        emails.put("sheldon.copper@xyz.com",7);
        emails.put("marie.george@xyz.com",8);

        String NewEmail = "monica.geller@xyz.com";

        if(emails.containsKey(NewEmail))
        {
            //Complete here
            System.out.println(emails.get(NewEmail));
        }
        else System.out.println("False");
    }
}

class X extends Y
{
    public static String color()
    {
        return "green";
    }
    public static void main(String[] args)
    {
        X i = new X();
        Y j = new X();
        System.out.println(i.color() + " " + j.color());
    }
}
class Y
{
    public static String color()
    {
        return "blue";
    }
}

class Ticket {
    int price;
    static int count;
    public Ticket(int price) {
        this.price = price;
        count++;
    }
}
class Test {
    public static void main(String[] args) {
        System.out.print(Ticket.count+" ");
        Ticket t1 = new Ticket(300);
        Ticket t2 = new Ticket(300);
        System.out.print(Ticket.count+" ");
    }
}

class Test1{
    static int i = 5;
    public void put(int i){
        i = i;
        System.out.println(this.i);
    }
    public static void main(String[] args){
        new Test1().put(10);
    }
}

abstract class One
{
    int i;
    abstract void display();
}
class Two extends One
{
    int j;
    void display()
    {
        System.out.println(i);
    }
}
class Test2 {
    public static void main(String args[])
    {
        Two obj = new Two();
        obj.j=5;
        obj.display();
    }
}

class Vehicle1{
    String colour;
    private int number;
    void print() {
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle1{
    void print(){
        System.out.println("Car");
    }
}
class Audi extends Car{
    void print(){
        System.out.println("Audi");
    }
}
class Test3 {
    public static void main (String[] args) {
        Car c=new Audi();
        c.print();
    }
}

package helloworld;
import helloworld.car;
public class NewTest extends car{
    car newcar=new car();
    void testFunction(){
//        String testData=newcar.name; // private
//        String testData1=newcar.noOfDoors; // protected
//        String testData2=newcar.color; // public
//        String testData3=newcar.price; // default
//        System.out.println(this.name);
        System.out.println(this.noOfDoors);
        System.out.println(this.color);
        System.out.println(this.price);

    }

    public static void main(String[] args) {
        NewTest n = new NewTest();
        n.testFunction();
    }

}

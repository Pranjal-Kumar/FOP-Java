package helloworld;
public class staticfinal {

    public static void main(String[] args) {

//        circle c1= new circle();
//        System.out.println(c1.test);
//        circle c2= new circle();
////
//
//        System.out.println(c2.pi);
//        System.out.println(c1.radius);
//        System.out.println(c2.radius);
//        circle.returndouble();

//        main();
//        main(5);

        University u1=new University();
        System.out.println(u1.getDeanName());
        u1.setMathsTracher("Mansi");
        System.out.println(u1.getMathsTracher());

    }
//    public static void main(){
//        System.out.println("Chinese main");
//
//    }
//    static int main(int a){
//        System.out.println(a);
//        return 0;
//    }


}

class University{
    private String deanName="Pranjal";
    private String collegeName="MUIT";
    public String test;

    public String getDeanName() {
        return deanName;
    }

//    public void setDeanName(String deanName) {
//        this.deanName = deanName;
//    }

    public String getCollegeName() {
        return collegeName;
    }

//    public void setCollegeName(String collegeName) {
//        this.collegeName = collegeName;
//    }

    public String getMathsTracher() {
        return mathsTracher;
    }

    public void setMathsTracher(String mathsTracher) {
        this.mathsTracher = mathsTracher;
    }

    private String mathsTracher;


}

class circle{
    protected int test=10;
    final static double pi=3.14;
    final static double radius=12;
    String name="Upgrad";
    //    create constructor
//    public  circle(){   // parameterised constructor
//
//        printMsg();
//    }
//    void printMsg(){
//        System.out.println("Circle class has been used to create an object");
//
//    }
    static double area(){
        return pi*radius*radius;
    }

    static double returndouble(){
//        static method can only access static instance variable

        int a=5;
        System.out.println("I am Static method of circle class");
        System.out.println(pi);
//        System.out.println(name); // non-static variable name cannot be referenced from a static context
        System.out.println(a);
        System.out.println(area());
        return 1.1;

    }

}


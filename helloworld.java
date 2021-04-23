package helloworld;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
//      System.out.println(information);
      String information="Hello World";
      System.out.println(information);
      System.out.println(information);
      System.out.println(information);
      String newinfo=" and Happy New Year";
      System.out.println(information+newinfo);
      String a=information+newinfo;
      System.out.println(a);
//      variable --> 1. primitive data types (int, short, long, boolean, byte, char, float, double)
//                   2. non-primitive data types (string, array, arraylist, linkedlist, tree)
//      keywords --> reserved words which cannot be used as variables names (int, short,  long, boolean, byte, float)
//
        int number=100;
        boolean flag=2<3;
        boolean flaG=2==3;
        float f= 1.1234567f;
        char c='W';
        String s="String";
        byte b=126;
        double doub=1.1234567890123456d;
//        int abc; // first character --> variable name always start with alphabet or _
//      for other characters --> numbers,  alphabets
//      lower camel case convention -->
//      System.out.println(number);
//      System.out.println(doub);
//      System.out.println(f);
//      System.out.println(c);
//      System.out.println(b);
//      System.out.println(flag);
//      System.out.println(flaG);
//      System.out.println(s);

//      System.out.println("byte "+ Byte.BYTES);
//        float num1=10;
//        float num2=3;
//      System.out.println(num1/num2); // int/int=int
//      System.out.println(num1/num2); // int/float=float
//      System.out.println(num1/num2); // float/int=float
//      System.out.println(num1/num2); // float/float=float
//      int result=num1+num2; // invalid initialization
//      % --> even or odd, hash function
//        int result=100%2; //  it gives the remainder as output
//        System.out.println(result);
//        System.out.println("Enter two number ");
//        Scanner input= new Scanner(System.in);
//        int num1,num2;
//        num1= input.nextInt();
//        num2= input.nextInt();
//        System.out.println("Addition for given two numbers is "+ (num1+num2));

//        char in1='a';
//        char in2='A';
//        char in3='1';
//        System.out.println((int)in1);
//        System.out.println((int)in2);
//        System.out.println((int)in3);

//        String student[]=new String[3]; // datatype arrayname[]= new datatype[size];
//        student[0]="Name-1";
//        student[1]="Name-2";
//        student[2]="Name-3";
//        student[3]="Name-4"; // will generate run time error
//        int float=2; // will generate compile time error
//
//        String newstudent[] ={"Name-1","Name-2","Name-3"};
//
//        System.out.println(newstudent[0]);
//        System.out.println(newstudent[1]);
//        System.out.println(newstudent[2]);

//        int a=200;
//        double d=420.4;
//
//        a= (int) d;
//        double b=(double) a;
//        System.out.println(a);
//        System.out.println(b);

//        int a=110;
//        char b=(char)a;
//        System.out.print(b);

//        char a='a';
//        char b='A';
//        int i=(int)a-(int)b;
//        char c=(char) i;
//        System.out.print(c);

//        int a=2;
//        char b='1';
//        int c=a+(int)b;
//        System.out.println(c);

//        Scanner input= new Scanner(System.in);
//        int a=input.nextInt();
//        float f=input.nextFloat();
//        double d=input.nextDouble();
//        float x=(float)a;
//        float y=(int)f;
//        float z=(float)d;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        int marks[];
//        marks= new int[5];
//        Scanner input= new Scanner(System.in);
//        marks[0]=input.nextInt();//1
//        marks[1]=input.nextInt();//2
//        marks[2]=input.nextInt();//3
//        marks[3]=input.nextInt();//4
//        marks[4]=input.nextInt();//5
//        System.out.println("The student with roll number 3 has scored "+marks[3]+" marks");

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int a=sc.nextInt();
//        System.out.println("The number is "+a);
//
//        System.out.println("Enter a string: ");
//        String s=sc.next();
//        System.out.println("The string is "+s);


//------  program to print 5-digit number in ones, tens, hundred, thousand, tenThousand places---------------------


//        Scanner input = new Scanner(System.in);
//        //Values of each digit
//        int tenThousands, thousands, hundreds, tens, ones;
//
//        //Prompt user to input 5 digit number
//
//        int number = input.nextInt();
//        if (number > 99999) {
//            System.out.println("\nError! Number more than 5 digits.");
//        }
//        else if (number < 10000) {
//            System.out.println("Error! Number less than 5 digits.");
//        }
//        else if (10000<=number&&number<=99999){
//            //WRITE YOUR CODE HERE
//            tenThousands=number/10000;
//            thousands=(number-tenThousands*10000)/1000;
//            hundreds=(number-thousands*1000-tenThousands*10000)/100;
//            tens=(number-hundreds*100-thousands*1000-tenThousands*10000)/10;
//            ones=number-tens*10-hundreds*100-thousands*1000-tenThousands*10000;
//
//            System.out.println(tenThousands);
//            System.out.println(thousands);
//            System.out.println(hundreds);
//            System.out.println(tens);
//            System.out.println(ones);
//        }


//        int myAge;
//        int ageOfBrother;
//        Scanner input= new Scanner(System.in);
//        myAge=input.nextInt();
//        ageOfBrother=input.nextInt();
//        if (myAge<=0||ageOfBrother<=0){
//            System.out.println("false");
//        }
//        else if (myAge<25&&ageOfBrother<25){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }


// average of numbers
//        Scanner in= new Scanner(System.in);
//        int ar[]=new int[6];
//        ar[0]=in.nextInt();
//        ar[1]=in.nextInt();
//        ar[2]=in.nextInt();
//        ar[3]=in.nextInt();
//        ar[4]=in.nextInt();
//        ar[5]=in.nextInt();
//        int sum= ar[0]+ar[1]+ar[2]+ar[3]+ar[4]+ar[5];
//        int element= ar.length;
//        float avg= (float)sum/element;
//        System.out.println(avg);

//      Swap function
//        int a=4;
//        int b=6;
//        int c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println(a);
//        System.out.println(b);

//        String name=" Pranjal";
//        String sname="Kumar";
//        int a=name.length();
//        int b=sname.length();
//        double c=(double)a/b;
//        System.out.println(c);



    }
}

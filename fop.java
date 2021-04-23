package helloworld;
import java.util.*;
public class fop {
    public static void main(String[] args) {

//        boolean rain=true;
//        if(rain){
//            System.out.println("Use Umbrella");
//        }
//        else {
//            System.out.println("Don't use Umbrella");
//        }

//        String bulb="broken";
//        if(bulb=="on"){
//          System.out.println("Turn on the bulb");
//        }
//        else if(bulb=="broken"){
//            System.out.println("Repair the bulb");
//        }
//        else if(bulb=="off"){
//            System.out.println("Turn off the bulb");
//        }
//        else {
//            System.out.println("Nothing");
//        }
//        System.out.println("Normal Statements");

//        int in=9;
//        if (in>0){
//            System.out.println("Natural Number");
//            if (in%2==0){
//                System.out.println("Even Number");
//            }
//            else if(in%2==1){
//                System.out.println("Odd Number");
//            }
//        }
//        else {
//            System.out.println("Negative Number");
//        }

//        String month="Jan";
//        switch (month){
//            case "Jan":System.out.println("january, 31 days");
//                break;
//            case "Feb":System.out.println("febuary, 28 days");
//                break;
//            case  "Mar":System.out.println("march, 31 days");
//                break;
//            default:System.out.println("Default value");
//        }


//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        //write your code here
//        if (n%2==0){
//            System.out.println("The number entered is even");
//        }
//        else{
//            System.out.println("The number entered is odd");
//        }

//        int n1, n2, n3;
//        Scanner input = new Scanner(System.in);
//        n1 = input.nextInt();
//        n2 = input.nextInt();
//        n3 = input.nextInt();
//        if((n1<n2)&&(n2<n3)){
//            System.out.println("The numbers entered are in increasing order");
//        }
//        else if((n1>n2)&&(n2>n3)){
//            System.out.println("The numbers entered are in decreasing order");
//        }
//        else{
//            System.out.println("The number are in neither in increasing order nor in decreasing order");
//        }

//        String name;
//        int marks;
//        Scanner input = new Scanner(System.in);
//        name = input.nextLine();
//        marks = input.nextInt();
//        if(marks>100){
//            System.out.println("The grade scored by "+name+" is A");
//        }
//        else if(marks>80 && marks<=100){
//            System.out.println("The grade scored by "+name+" is B");
//        }
//        else if(marks>60 && marks<=80){
//            System.out.println("The grade scored by "+name+" is C");
//        }
//        else if(marks>40 && marks<=60){
//            System.out.println("The grade scored by "+name+" is D");
//        }
//        else if(marks<=40){
//            System.out.println("The grade scored by "+name+" is E");
//        }
//

//        int day=5;
//        if (day >= 1 && day <= 5) {
//            System.out.print("Time to wake up early. We have work today. ");
//            if (day == 5) {
//                System.out.print("Don't forget to bring snacks for co-workers!");
//            }
//        } else if (day == 6 || day == 7) {
//            System.out.print("Time to sleep in. No work today.");
//        }

//        int n1, n2, n3;
//        Scanner input = new Scanner(System.in);
//        n1 = input.nextInt();
//        n2 = input.nextInt();
//        n3 = input.nextInt();
//        if(n1<n2&&n1<n3){
//            System.out.println("The smallest number entered is "+n1);
//        }
//        else if(n2<n3&&n2<n1){
//            System.out.println("The smallest number entered is "+n2);
//        }
//        else if(n3<n1&&n3<n2){
//            System.out.println("The smallest number entered is "+n3);
//        }
//

//        int n;
//        Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        switch (n){
//            case 1: System.out.println("Hufflepuff");
//                break;
//            case 2: System.out.println("Gryffindor");
//                break;
//            case 3: System.out.println("Slytherin");
//                break;
//            case 4: System.out.println("Ravenclaw");
//                break;
//            default: System.out.println("Enter a number from 1 to 4");
//        }


//        int day = 5;
//        switch(day) {
//
//            case 1:
//                System.out.print("Work Day-Monday");
//                break;
//            case 2:
//                System.out.print("Work Day-Tuesday");
//                break;
//            case 3:
//                System.out.print("Work Day-Wednesday");
//                break;
//            case 4:
//                System.out.print("Work Day-Thursday");
//                break;
//            case 5:
//                System.out.print("Work Day-Friday");
//                break;
//            default:
//                System.out.print("Yayy-Weekend");
//
//        }

//        int age, vote;
//        Scanner input= new Scanner(System.in);
//        age=input.nextInt();
//
//        if(age>=18){
//            vote=input.nextInt();
//            switch (vote){
//                case 1: System.out.println("You have voted for Ram");
//                    break;
//                case 2: System.out.println("You have voted for Shyam");
//                    break;
//                case 3: System.out.println("You have voted for Ghanshyam");
//                    break;
//            }
//        }
//        else{
//            System.out.println("You are not eligible");
//        }

//     Month, day and date finder program
//        Scanner scan = new Scanner(System.in);
//        // Enter month
//        String month = scan.next();
//        // Enter date
//        int date = scan.nextInt();
//
//        int day = 0;
//        switch (month) {
//            case "January":
//                day = date;
//                break;
//            case "February":
//                day = 31 + date;
//                break;
//            case "March":
//                day = 31 + 28 + date;
//                break;
//            case "April":
//                day = 31 + 28 + 31 + date;
//                break;
//            case "May":
//                day = 31 + 28 + 31 + 30 + date;
//                break;
//            case "June":
//                day = 31 + 28 + 31 + 30 + 31 + date;
//                break;
//            case "July":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
//                break;
//            case "August":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
//                break;
//            case "September":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
//                break;
//            case "October":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
//                break;
//            case "November":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
//                break;
//            case "December":
//                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
//                break;
//
//            // Write the rest of the logic
//
//        }
//
//        // From the day number of the year, finding the day no. of the week
//        int dayNumber = day % 7;
//        // recall, day 1 is Monday
//        if(dayNumber==1){
//            System.out.println("Monday");
//        }
//        else if(dayNumber==2){
//            System.out.println("Tuesday");
//        }
//        else if(dayNumber==3){
//            System.out.println("Wednesday");
//        }
//        else if(dayNumber==4){
//            System.out.println("Thursday");
//        }
//        else if(dayNumber==5){
//            System.out.println("Friday");
//        }
//        else if(dayNumber==6){
//            System.out.println("Saturday");
//        }
//        else if(dayNumber==0){
//            System.out.println("Sunday");
//        }
//
//        if (dayNumber==6||dayNumber==7 ) {
//            System.out.print("Hurray!");
//        } else {
//            System.out.print("Ohhh! It's a work day :|");
//        }
//
//        scan.close();

//      Income tax calculator
//        Scanner scan = new Scanner(System.in);
//        // Enter annual income
//        double income = scan.nextDouble();
//        // Enter age
//        int age = scan.nextInt();
//
//        double tax = 0.0;
//
//        // Write your logic here
//        if (income <= 250000) {
//            System.out.println(tax);
//
//        } else if (income >= 250001 && income <= 300000) {
//            if (age < 60) {
//                tax = 0.10 * (income - 250000);
//                System.out.println(tax);
//            } else if (age >= 60 && age < 80) {
//                System.out.println(tax);
//            } else if (age >= 80) {
//                System.out.println(tax);
//            }
//        } else if (income >= 300001 && income <= 500000) {
//            if (age < 60) {
//                tax = (0.10 * (income - 300000)) + (0.10 * (300000 - 250000));
//                System.out.println(tax);
//            } else if (age >= 60 && age < 80) {
//                tax = 0.10 * (income - 300000);
//                System.out.println(tax);
//            } else if (age >= 80) {
//                System.out.println(tax);
//            }
//        } else if (income >= 500001 && income <= 1000000) {
//            if (age < 60) {
//                tax = (0.10 * (500000 - 300000)) + (0.10 * (300000 - 250000)) + (0.2 * (income - 500000));
//                System.out.println(tax);
//            } else if (age >= 60 && age < 80) {
//                tax = (0.10 * (500000 - 300000)) + (0.2 * (income - 500000));
//                System.out.println(tax);
//            } else if (age >= 80) {
//                tax = 0.2 * (income - 500000);
//                System.out.println(tax);
//            }
//        } else if (income > 1000000) {
//            if (age < 60) {
//                tax = (0.10 * (500000 - 300000)) + (0.10 * (300000 - 250000)) + (0.2 * (1000000 - 500000)) + (0.3 * (income - 1000000));
//                System.out.println(tax);
//            } else if (age >= 60 && age < 80) {
//                tax = (0.10 * (500000 - 300000)) + (0.2 * (1000000 - 500000)) + (0.3 * (income - 1000000));
//                System.out.println(tax);
//            } else if (age >= 80) {
//                tax = (0.2 * (1000000 - 500000)) + (0.3 * (income - 1000000));
//                System.out.println(tax);
//            }
//        }









    }

}

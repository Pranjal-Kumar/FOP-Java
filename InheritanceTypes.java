package helloworld;

public class InheritanceTypes {


    public static void main(String[] args) {
//        Student1 cse = new Student1("Ashish",23145,"MUIT");
//        cse.setMarks(10,20,30);
//        cse.setMarks(10.5,20,30);
//        cse.setMarks(10.50,20.50,30.50);
//        cse.setMarks(10,20,40.66f);


//        cse.getStudentDetails();
       Student1 re = new ResearchStudent("Pranjal",12345,"MUIT","AI");
//        re.getresearchpaper();
//
      re.getStudentDetails();

//        PhdStudent phd = new PhdStudent("Kumar",54321,"MUIT","ML","Neural Networks");
//        phd.getStudentDetails();

//        MtechStudent mtech=new MtechStudent("Sunny",98765,"CIC",10);
//        mtech.getStudentDetails();



    }
}
class Student1{
    String name;
    int rollNo;
    String university;
    String  idstr;
    int id;
    double finalmarks;
    void setMarks(int a,int b,int c){
        this.finalmarks=a+b+c;
        System.out.println("All are integers : " + finalmarks);

    }
    void setMarks(double a,int b,int c){
        this.finalmarks=a+b+c;
        System.out.println("a is double, b and c are integers : " + finalmarks);

    }
    void setMarks(double a,double b,double c){
        this.finalmarks=a+b+c;
        System.out.println("All are double : " + finalmarks);

    }
    void setMarks(int a,int b,float c){
        this.finalmarks=a+b+c;
        System.out.println("a and b integers, c is float : " + finalmarks);

    }
    public Student1(String name,  int rollNo, String university){
        this.name=name;
        this.rollNo=rollNo;
        this.university=university;
    }
    public void getStudentDetails(){
        System.out.println("Name : "+ name+"\nrollNo : "+rollNo+"\nUniversity : "+university);

    }


}

class MtechStudent extends Student1{
    int noSubject;
    public MtechStudent(String name, int rollNo,String university,int noSubject){
        super(name,rollNo,university);
        this.noSubject=noSubject;
    }
    @Override
    public void getStudentDetails(){
        super.getStudentDetails();
        System.out.println("Mtech students have "+noSubject+" subjects");


    }

}

class ResearchStudent extends Student1{
    String name = "Bhola";
    String researchPapar;
    int rollNo;
    String university;
    public ResearchStudent(String name,  int rollNo, String university, String researchPapar){
        super(name,rollNo,university);
        this.researchPapar=researchPapar;
    }
    void  getresearchpaper(){
        System.out.println(name + " is doing research in "+ researchPapar);
    }
    @Override
    public void getStudentDetails(){
//        super.getStudentDetails();
        System.out.println("Research Student");
        System.out.println(name + " is doing research in "+ researchPapar);

    }
}

class PhdStudent extends ResearchStudent{
    String thesis;
    void publishThesis(int year){
        System.out.println(thesis + " is getting pulished in "+year);
    }
    public PhdStudent(String name,  int rollNo, String university, String researchPapar, String thesis){
        super(name,rollNo,university,researchPapar);
        this.thesis=thesis;
    }
    @Override
    public void getStudentDetails(){
        super.getStudentDetails();
        System.out.println(name + " is publishing thesis "+ thesis);

    }

}
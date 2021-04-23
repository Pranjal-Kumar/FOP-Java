package helloworld;

public class ParentChild {
    public static void main(String[] args) {
        Father ramu= new Father(10);
        System.out.println("-----");
        System.out.println(ramu.getClass());
        System.out.println(ramu.getClass().getName());
        //getClass() and getName() is inherited from the OBject Class
//        System.out.println(ramu.bankBalance);
//        System.out.println(ramu.bunglow);
//        System.out.println(ramu.land);
//        ramu.lic=20;
//        System.out.println(ramu.lic);
//        ramu.bussiness();
        LapTop l=new LapTop();
        l.ram=12;
        l.name="len";
        Child bhola=new Child(100);
        bhola.laptop=true;
        bhola.bussiness();//execution of this inherited method will be lil slower
        System.out.println(bhola.laptop);
        bhola.setFatherBankBal(6666666);
        bhola.setLaptopAndBankBalance(false,100000);
        System.out.println(bhola.laptop);
        System.out.println(bhola.getFatherBal());

    }
}

//All class which we create is by default child class of 'Object Class'
class Father{
    public int land=100;
    public int bankBalance=999999;
    private int bunglow=2;
    public int lic;
    public Father(int lic){
        System.out.println("Father Constructore is called");
        this.lic=lic;
    }
    public void bussiness(){
        System.out.println("petrolium Bussiness is working fine..All set");
    }
}
class Child extends Father{
    public int bankBalance=9;//this same enity is there in father class also
    public boolean laptop;
    public Child(int l){
        super(l);   // this super statement must be used in first line of child constructor
        System.out.println("Child Constructir is called");
    }
    public void setLaptopAndBankBalance(boolean laptop, int bankBalance){
        this.laptop=laptop;
        this.bankBalance=bankBalance;
        System.out.println(super.bankBalance);//using super we can access the parent instance variable
        System.out.println(this.bankBalance);
    }
    void setFatherBankBal(int b){
        super.bankBalance=b;
    }
    int getFatherBal(){
        return super.bankBalance;
    }
//    public int land=100;
//    public int bankBalance=10000;
//    public int bunglow=2;
//    public int lic;
//    public void bussiness(){
//        System.out.println("petrolium Bussiness is working fine..All set");
//    }
}
/*
Access modifer
1. Public - available anywhere
2. protected    - available in the class and it's subclass and also in the other packages
3. default  - is available only inside the package
4. private  - available only inside the class
 */
class LapTop{
    public String name="HP";
    public int ram=12;
}

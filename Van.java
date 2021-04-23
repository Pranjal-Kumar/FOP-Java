package helloworld;

public class Van implements Vehicle{
    String color;
    public void price(){
        System.out.println("Price of Van is 10000");
    }
    void getWheels(){
        System.out.println(this.wheels);
    }
    public void getMaxspeed(){
        System.out.println("max speed of van is  80km/h");
    }
}


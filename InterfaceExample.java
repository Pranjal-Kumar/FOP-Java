package helloworld;

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle V = new Van();
        System.out.println(V.wheels);
        System.out.println(Vehicle.wheels);
        V.price();
//        V.getWheels(); // getWheels is not there in vehicle
        Van vv  = new Van();
        vv.getWheels();
        vv.getMaxspeed();
        V.getMaxspeed();
    }


}

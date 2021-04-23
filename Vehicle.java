package helloworld;

public interface Vehicle {
    int wheels=4;
    void price();
    default void getMaxspeed(){
        System.out.println("Default speed is 50km/h");
    }

}

//public interface Vehicle {
//    public static final int wheels=4;
//    public abstract void price();
//
//}

package helloworld;

public class introToClassObject {
}
class mobile {

    //    Define all the entity<->properties<->attributes
    int size;
    boolean mic;
    boolean speaker;
    int battery;
    int displaysize;
    String color;
    int button;


    //    Features
    void music(String songName){
        int speaker=3;
        if(this.speaker==true) {
            System.out.println("Your song " + songName + " playing");
        }
        else{
            System.out.println("Speaker not found");
        }
        System.out.println(speaker);
        System.out.println(this.speaker);
    }

    boolean recording(){
        if(mic==true){
            System.out.println("Recording Started");
            return true;
        }
        else{
            System.out.println("Mic not found");
            return false;
        }
    }

    boolean calling(String number){
        if(mic==true&&speaker==true){
            System.out.println("Calling... "+number);
            return true;
        }
        else{
            System.out.println("Check mic and speaker");
            return false;
        }
    }

    boolean callRecording(String number){
        boolean isrecording=recording();
        boolean iscall=calling(number);
        if(iscall==true&&isrecording==true){
            System.out.println("Recording...");
            return true;
        }
        else{
            System.out.println("Cannot record");
            return false;
        }

    }

    public static void main(String[] args) {

//        mobile oppo = new mobile();
//        oppo.size=7;
//        oppo.speaker=true;
//        oppo.battery=5;
//        oppo.color="white";
//        oppo.mic=true;
//        oppo.calling("9818817779");
//
//        mobile vivo = new mobile();
//        vivo.size=8;
//        vivo.battery=10;
//        vivo.speaker=true;
//        vivo.color="blue";
//        vivo.mic=true;
//        vivo.calling("9599493779");
//        vivo.music("ABC");
//
//        boolean oppoResult=oppo.callRecording("9599493779");
//        if(oppoResult==true){
//            System.out.println("Recording working");
//        }
//        else{
//            System.out.println("Mot Recording");
//        }

//        circle c1 = new circle(7);
//        System.out.println(c1.area());





    }
}




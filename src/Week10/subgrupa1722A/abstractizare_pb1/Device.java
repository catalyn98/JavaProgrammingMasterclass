package Week10.Subgrupa1722A.abstractizare_pb1;

public abstract class Device {

    public void turnOn(){
        System.out.println("turning on");

    }
    public void turnOff(){
        System.out.println("turning off");
    }

    public abstract String deviceType();
}

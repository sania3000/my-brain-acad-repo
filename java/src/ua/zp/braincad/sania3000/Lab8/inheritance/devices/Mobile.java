package ua.zp.braincad.sania3000.Lab8.inheritance.devices;

public class Mobile extends AbstractDevice {

    @Override
    public void switchPower(){
        System.out.println("hold on/off button");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.switchPower();
    }
}

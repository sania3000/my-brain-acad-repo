package ua.zp.braincad.sania3000.lab7.devices;
import java.util.Objects;
public class SmartPhone {

    private String name;
    private int price;

    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if (this==o)return true;
        if (o==null || getClass() !=o.getClass()) return false;
        SmartPhone smartPhone=(SmartPhone) o;
        return price ==smartPhone.price &&
                Objects.equals(name,smartPhone.name);

    }
    public String toString(){
        return name + " cost " + price;
    }

}

package ua.zp.braincad.sania3000.lab5;

public class Lamp {
    private double powerConsumption;        //потребление электроенергии
    private String spectrum;                 //спектр(цвет)
    private String state;                      //состояние
   public Lamp(double powerConsumption,String spectrum,String state){
        this.powerConsumption= powerConsumption;
        this.spectrum=spectrum;
        this.state=state;
    }

    public double getPowerConsumptionLamp() {
        return powerConsumption;
    }

    public String getSpectrum() {
        return spectrum;
    }

    public String getState() {
        return state;
    }

   public void turnOn(){
        System.out.println("Лампа включена");
    }
   public void turnOff(){
        System.out.println("Лампа выключена");
    }
}

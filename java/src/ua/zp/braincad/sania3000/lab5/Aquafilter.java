package ua.zp.braincad.sania3000.lab5;

public class Aquafilter {
    private int power;                  //мощность
    private double powerConsumption;   //потребление электроенергии
   public Aquafilter(int power,double powerConsumption){
        this.power=power;
        this.powerConsumption=powerConsumption;
    }

    public int getPower() {
        return power;
    }

    public double getPowerConsumptionFilter() {
        return powerConsumption;
    }

    void cleanWater(){
        System.out.println("Очистка воды");

    }

}


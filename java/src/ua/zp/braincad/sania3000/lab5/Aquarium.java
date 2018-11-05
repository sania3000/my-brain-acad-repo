package ua.zp.braincad.sania3000.lab5;

public class Aquarium {
    private double width;
    private double height;
    private double depth;
    private Fish[] fishes;
    private Herb[] herb ;
    private Feeder feeder ;
    private Aquafilter aquafilter;
    private Lamp daylamp;
    private Lamp nightlamp;
    private Toys[] toys;


    public double volume(){         //объем аквариума
        return width*height*depth;
    }
    public int maxfish(){           //максимальное кол-во рыбок
        int res = 1;
        for (int i=0;i<=volume();i++){
            res=i;

        }   return res;

    }

    public double aquaFilterpower(){   //расчет мощности фильтра
        return volume()*3;
    }

    public double amountOffeed(){       // кол-во корма в день
        return maxfish()*3*2;
    }


    static final double ELECTRO_СOST = 0.0012;  //стоимость электроенергии за 1 вт,грн
    static final double WATER_COST = 0.00589;   // стоимость воды за 1 литр,грн
    static final double FOOD_COST = 1.25;       //стоимость корма за 1 грамм

    public double calcChangewater(){                 //стоимость замены воды в месяц
        return volume()*0.25*WATER_COST;
}
    public double calcLightenergy(){            //стоимость освещения
        return (getDaylamp().getPowerConsumptionLamp()*8+getNightlamp().getPowerConsumptionLamp()*4)*30*ELECTRO_СOST;
    }
    public double calcFoodcoast(){              //стоимость корма в месяц
        return maxfish()*30*FOOD_COST;
    }

    public double calcAquqfilterenergy(){         //стоимость работы аквафильтра в месяц
        return getAquafilter().getPowerConsumptionFilter()*24*30*ELECTRO_СOST;

    }
    public double calcSum(){
        return calcChangewater()+calcLightenergy()+calcFoodcoast()+calcAquqfilterenergy();
    }



    public double getWidth () {
        return width;
    }

    public void setWidth ( double width ) {
        this.width = width;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight ( double height ) {
        this.height = height;
    }

    public double getDepth () {
        return depth;
    }

    public void setDepth ( double depth ) {
        this.depth = depth;
    }

    public Fish[] getFishes () {
        return fishes;
    }

    public void setFishes ( Fish[] fishes ) {
        this.fishes = fishes;
    }

    public Herb[] getHerb () {
        return herb;
    }

    public void setHerb ( Herb[] herb ) {
        this.herb = herb;
    }

    public Feeder getFeeder () {
        return feeder;
    }

    public void setFeeder ( Feeder feeder ) {
        this.feeder = feeder;
    }

    public Aquafilter getAquafilter () {
        return aquafilter;
    }

    public void setAquafilter ( Aquafilter aquafilter ) {
        this.aquafilter = aquafilter;
    }

    public Lamp getDaylamp () {
        return daylamp;
    }

    public void setDaylamp ( Lamp daylamp ) {
        this.daylamp = daylamp;
    }

    public Lamp getNightlamp () {
        return nightlamp;
    }

    public void setNightlamp ( Lamp nightlamp ) {
        this.nightlamp = nightlamp;
    }

    public Toys[] getToys () {
        return toys;
    }

    public void setToys ( Toys[] toys ) {
        this.toys = toys;
    }
}



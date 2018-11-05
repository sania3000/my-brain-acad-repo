package ua.zp.braincad.sania3000.lab5;

public class Aquarium {
   private double width;
   private double height;
   private double depth;

    public Aquarium ( double width, double height, double depth ) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private Fish fishes=new Fish(6,"red");
   private Herb herb;
   private Feeder feeder;
   private Aquafilter aquafilter=new Aquafilter(2,500);
   private Lamp daylamp;
   private Lamp nightlamp;
   private Toys[] toys={Toys.SNAKE,Toys.FLOWER,Toys.FROG,Toys.STONE};

   public double volume(){
       return width*height*depth;
   }

    public int maxFishes(){     //максимальное кол-во рыбок
       int res=1;
       for (int i=1;i<=volume();i++){
        if (getFishes().getLength()<=5){
            res=i;
        }if (getFishes().getLength()==6){
            res =i/6;
           }if (getFishes().getLength()>6)
               break;
       }return res;
    }
    public double propuskFilter(){          //пропускная способность фильтра

       return volume()*3;
    }

    public int amountOffeed(){          //кол-во корма в день
       return maxFishes()*3*2;
    }
    static final double ELECTRO_СOST = 0.0012;  //стоимость электроенергии за 1 вт,грн
    static final double WATER_COST = 0.00589;   // стоимость воды за 1 литр,грн
    static final double FOOD_COST = 1.25;       //стоимость корма за 1 грамм

 public double calcFoodcost(){                  //стоимость корма в месяц
     return amountOffeed()*30*FOOD_COST;
 }

 public double calcWater(){                     //стоимость замененной воды в месяц
     return volume()*0.25*WATER_COST;
 }
public double calcLightsenergy(){               //стоимость освещения
     Lamp daylamp=new Lamp(0.1,"белый","on");
     Lamp nightlamp = new Lamp(0.08,"желтый","on");
     return (daylamp.getPowerConsumptionLamp()*8+nightlamp.getPowerConsumptionLamp()*4)*30*ELECTRO_СOST;
}

public double calcFilterenergy(){               //стоимость фильтрации в месяц
     return aquafilter.getPowerConsumptionFilter()*24*30*ELECTRO_СOST;
}

public double calcCoast(){                      // Стоимость обслуживания аквариума в месяц
     return calcFoodcost()+calcWater()+calcLightsenergy()+calcFilterenergy();
}




    public Feeder getFeeder () {
        return feeder;
    }

    public void setFeeder ( Feeder feeder ) {
        this.feeder = feeder;
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

    public Fish getFishes () {
        return fishes;
    }

    public void setFishes ( Fish fishes ) {
        this.fishes = fishes;
    }

    public Herb getHerb () {
        return herb;
    }

    public void setHerb ( Herb herb ) {
        this.herb = herb;
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




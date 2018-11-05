package ua.zp.braincad.sania3000.lab5;

public class Main {
    public static void main ( String[] args ) {

        Aquarium myaquarium = new Aquarium();

        Lamp mydaylamp = new Lamp(0.05,"cold") ;
        Lamp mynightlamp = new Lamp(0.04,"warm");
        Aquafilter myaquafilter = new Aquafilter(2,1000);
        Toys[] mytoys={Toys.STONE,Toys.FLOWER,Toys.FROG,Toys.SNAKE};
        Fish[] myfishes= new Fish[myaquarium.maxfish()];
        Herb[] myherbs = new Herb[5];


        for (int i=0;i<myfishes.length;i++){
            myfishes[i]=new Fish(5,"red");
        }
          for (int i =0;i<myherbs.length;i++){
              myherbs[i]= new Herb("green",3);
          }



        myaquarium.setHeight(2.0);
        myaquarium.setWidth(4.0);
        myaquarium.setDepth(3.0);
        myaquarium.setAquafilter(myaquafilter);
        myaquarium.setDaylamp(mydaylamp);
        myaquarium.setNightlamp(mynightlamp);
        myaquarium.setFishes(myfishes);
        myaquarium.setToys(mytoys);
        myaquarium.setHerb(myherbs);


        System.out.println("Объем аквариума равен = "+ myaquarium.volume()+ " литрам");
        System.out.println("Максимальное кол-во рыбок в аквариуме " + myaquarium.maxfish()+" штук");
        System.out.println("Мощность фильтра равна= "+myaquarium.aquaFilterpower());
        System.out.println("Кол-во корма в день = " + myaquarium.amountOffeed() + " грамм");
        System.out.println("Стоимость замены воды в месяц = "+ myaquarium.calcChangewater()+ " грн");
        System.out.println("Стоимость освещения в месяц = " + myaquarium.calcLightenergy()+" грн");
        System.out.println("Стоимость корма в месяц = "+ myaquarium.calcFoodcoast() + " грн");
        System.out.println("Стоимость работы аквафильтра в месяц "+ myaquarium.calcAquqfilterenergy()+" грн");
        System.out.println("Общая стоимость работы аквариума в месяц = "+myaquarium.calcSum()+" грн");
    }
}

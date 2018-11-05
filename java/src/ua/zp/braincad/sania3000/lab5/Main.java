package ua.zp.braincad.sania3000.lab5;

public class Main {
    public static void main(String[] args) {
        Aquarium myaquarium = new Aquarium(5.0,6.0,3.0);


        System.out .println("Максимальное кол-во рыбок в аквариуме "+ myaquarium.maxFishes()+ " штук, при длине одной рыбки "+ myaquarium.getFishes().getLength()+" cм "  );
        System.out.println("Пропускная способность фильтра равна " + myaquarium.propuskFilter()+ " литров");
        System.out.println("Кол-во корма в день для всех рыб "+ myaquarium.amountOffeed()+ " грамм");
        System.out.println("Стоимость корма в месяц = "+ myaquarium.calcFoodcost()+" грн");
        System.out.println("Стоимость замененной воды в месяц " + myaquarium.calcWater()+" грн");
        System.out.println("Стоимость освещения в месяц равна "+ myaquarium.calcLightsenergy()+" грн");
        System.out.println("Стоимоть фильтрации в месяц = "+ myaquarium.calcFilterenergy()+" грн");
        System.out.println("Общая стоимость обслуживания аквариума в месяц= "+ myaquarium.calcCoast()+" грн");

    }

}


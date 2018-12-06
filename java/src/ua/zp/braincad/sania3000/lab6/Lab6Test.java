package ua.zp.braincad.sania3000.lab6;

public class Lab6Test {

    public static void main(String[] args) {

        System.out.println("Текущий курс UAH к USD = "+ NBU.UAH_TO_USD_OFFICIAL);
        System.out.println("Текущий курс USD к UAH = "+ NBU.USD_TO_UAH_OFFICIAL);
        System.out.println("Текущий курс UAH к ЕUR = "+ NBU.UAH_TO_EUR_OFFICIAL);
        System.out.println("Текущий курс EUR к UAH = "+ NBU.EUR_TO_UAH_OFFICIAL);


        PrivatBank privatBank1 = new PrivatBank();
        PrivatBank privatBank2 = new PrivatBank();
        privatBank1.displayUSD();
        privatBank1.displayEUR();
        privatBank2.displayUSD();
        privatBank2.displayEUR();

        System.out.println("Меняем 100$ в приватбанке " + privatBank1.convertUSDtoUAH(100.0) +" UAH");
        System.out.println("Меняем 1000 грн. на $ "+privatBank1.convertUAHToUSD(1000.0)+ " USD");
        NBU.cheapenUAH(1);
        privatBank1.displayUSD();
        privatBank1.displayEUR();
        privatBank2.displayUSD();
        privatBank2.displayEUR();
        System.out.println(privatBank1.convertUSDtoUAH(100.0));
        System.out.println(privatBank1.convertUAHToUSD(1000.0));
        Demos demos=new Demos();
        AngolenkoMoneyAgent menialo=new AngolenkoMoneyAgent();
        menialo.sayCourse("USD");



        // TODO
    }
    //public static int vigodniyKurspokupkiUSD(){
      // double res = AngolenkoMoneyAgent.EUR_CURRENCY_RATIO;
      // if()



}

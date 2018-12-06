package ua.zp.braincad.sania3000.lab6;

import ua.zp.braincad.sania3000.lab6.api.CurrencyConvertor;

import static ua.zp.braincad.sania3000.lab6.NBU.*;

public class AngolenkoMoneyAgent implements CurrencyConvertor {

    public static double USD_CURRENCY_RATIO = 1.5;
    public static double EUR_CURRENCY_RATIO = 1.6;
    // TODO for EUR (RATIO = 1.2)

    @Override
    public double convertUAHToUSD ( double value ) {
        return value / UAH_TO_USD_OFFICIAL * USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUSDtoUAH ( double value ) {
        return value * USD_TO_UAH_OFFICIAL / USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUAHToEUR ( double value ) {
        return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
    }

    @Override
    public double convertEURtoUAH ( double value ) {
        return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
    }

    public  void   sayCourse ( String currency ) {

        switch (currency)
        {
            case "USD":
                displayUSD();
                break;
            case "EUR":
                displayEUR();
                break;
        default:
                System.out.println("Дотвиданиня");
                break;

        }}


    public void displayUSD () {
        double buyUsd = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
        double saleUsd = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
        System.out.printf("Meniala! USD: sale = %f, buy = %f", buyUsd, saleUsd);
        System.out.println();
    }

    public void displayEUR () {
        double buyUsd = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
        double saleUsd = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
        System.out.printf("Meniala! EUR: sale = %f, buy = %f", buyUsd, saleUsd);
        System.out.println();
    }


    // TODO switch...case for print specific currency exchange rates

}

package net.ukr.kiyashko.lab6;

import net.ukr.kiyashko.lab6.api.CurrencyConvertor;

import static net.ukr.kiyashko.lab6.NBU.*;

public class AngolenkoMoneyAgent implements CurrencyConvertor {
    public static double USD_CURRENCY_RATIO = 1.06;
    public static double EUR_CURRENCY_RATIO = 1.09;

    @Override
    public double convertUAHToUSD(double value) {return value / UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;

    }

    @Override
    public double convertUSDtoUAH(double value) {return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;

    }

    @Override
    public double convertUAHToEUR(double value) {
        return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;

    }

    @Override
    public double convertEURtoUAH(double value) {return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;

    }

    public void askExchangeRates(String currency) // USD, EUR
    {
        double buyUsd = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
        double saleUsd = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
        double buyEur = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
        double saleEur = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
        switch  (currency){
            case USD:
                System.out.printf("Angola! USD: sale = %f, buy = %f", buyUsd, saleUsd);
                System.out.println();
                break;
            case  EUR:
                System.out.printf("Angola! EUR: sale = %f, buy = %f", buyEur, saleEur);
                System.out.println();
                break;
                default:
                    System.out.println("Захади дарагой, баксы, шмаксы, че надо?");
                    System.out.println();
                    break;
        }




    }
}

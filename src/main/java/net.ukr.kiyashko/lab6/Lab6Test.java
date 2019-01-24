package net.ukr.kiyashko.lab6;

public class Lab6Test {

    public static void main(String[] args) {
        // TODO

        System.out.println(NBU.EUR_TO_UAH_OFFICIAL);
        System.out.println(NBU.UAH_TO_EUR_OFFICIAL);
        System.out.println(NBU.UAH_TO_USD_OFFICIAL);
        System.out.println(NBU.USD_TO_UAH_OFFICIAL);
        PrivatBank privatBank = new PrivatBank();
        PrivatBank privatBank1 = new PrivatBank();
        privatBank1.displayUSD();
        privatBank1.displayEUR();
        privatBank.displayEUR();
        privatBank.displayUSD();


        AngolenkoMoneyAgent angolenkoMoneyAgent = new AngolenkoMoneyAgent();
        angolenkoMoneyAgent.askExchangeRates("Почем?");
        Demos demos = new Demos();
        demos.displayEUR();
        demos.displayUSD();

        System.out.println(privatBank.convertUSDtoUAH(100));

        System.out.println(privatBank.convertUAHToUSD(1000));
        NBU.cheapenUAH(4);
        privatBank1.displayUSD();
        privatBank1.displayEUR();
        privatBank.displayEUR();
        privatBank.displayUSD();
        System.out.println(privatBank.convertUSDtoUAH(100));

        System.out.println(privatBank.convertUAHToUSD(1000));

        angolenkoMoneyAgent.askExchangeRates("USD");
        buyUsdBest(privatBank,demos,angolenkoMoneyAgent);

    }
        //return buyUsdBest;

    /*public static void sellUsdBest (String[] args) {

        if (privatBank.convertUAHToUSD(100) < demos.convertUAHToUSD(100) & privatBank.convertUAHToUSD(100) < angolenkoMoneyAgent.convertUAHToUSD(100)) {
            System.out.println("Самый выгодный курс  в Приватбанке");
            //Здесь почему-то подчеркивает краснім скобки System.out.printf("Самый выгодный курс %.2f в Приватбанке",privatBank.displayUSD());
        } else if (demos.convertUAHToUSD(100) < privatBank.convertUAHToUSD(100) & demos.convertUAHToUSD(100) < angolenkoMoneyAgent.convertUAHToUSD(100)) {
            System.out.println("Самый выгодный курс  в Демосе");
        } else
            System.out.println("Самый выгодный курс  у менял на Анголе");*/

    public static void buyUsdBest (PrivatBank privatBank,Demos demos,AngolenkoMoneyAgent angolenkoMoneyAgent) {

        if ( privatBank.convertUAHToUSD(100) < demos.convertUAHToUSD(100) & privatBank.convertUAHToUSD(100) < angolenkoMoneyAgent.convertUAHToUSD(100)) {
            System.out.println("Самый выгодный курс  в Приватбанке");
            System.out.printf("Самый выгодный курс %.2f в Приватбанке",privatBank.getUsdBuy());
        } else if (demos.convertUAHToUSD(100) < privatBank.convertUAHToUSD(100) & demos.convertUAHToUSD(100) < angolenkoMoneyAgent.convertUAHToUSD(100)) {
            System.out.println("Самый выгодный курс  в Демосе");
        } else
            System.out.println("Самый выгодный курс  у менял на Анголе");
    }

    }









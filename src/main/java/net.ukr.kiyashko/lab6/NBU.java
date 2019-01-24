package net.ukr.kiyashko.lab6;

/**
 * NATIONAL BANK OF UKRAINE.
 * Define official Exchange Rates day by day.
 */
public class NBU {

    public static double USD_TO_UAH_OFFICIAL = 27.9;
    public static double UAH_TO_USD_OFFICIAL = 28.1;

    public static double EUR_TO_UAH_OFFICIAL = 31.2;
    public static double UAH_TO_EUR_OFFICIAL = 33.15;

    public static void cheapenUAH(double percent) {
        USD_TO_UAH_OFFICIAL += ( USD_TO_UAH_OFFICIAL / 100 ) * percent;
        UAH_TO_USD_OFFICIAL += ( UAH_TO_USD_OFFICIAL / 100 ) * percent;
        EUR_TO_UAH_OFFICIAL += ( EUR_TO_UAH_OFFICIAL / 100 ) * percent;
        UAH_TO_EUR_OFFICIAL += ( UAH_TO_EUR_OFFICIAL / 100 ) * percent;
    }

    public static void riseUAH(double percent) {
        USD_TO_UAH_OFFICIAL -= ( USD_TO_UAH_OFFICIAL / 100 ) * percent;
        UAH_TO_USD_OFFICIAL -= ( UAH_TO_USD_OFFICIAL / 100 ) * percent;
        EUR_TO_UAH_OFFICIAL -= ( EUR_TO_UAH_OFFICIAL / 100 ) * percent;
        UAH_TO_EUR_OFFICIAL -= ( UAH_TO_EUR_OFFICIAL / 100 ) * percent;
    }

    private NBU() {}
}

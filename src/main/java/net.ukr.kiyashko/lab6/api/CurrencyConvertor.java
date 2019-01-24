package net.ukr.kiyashko.lab6.api;

/**
 * Interface for currency exchange procedure.
 */
public interface CurrencyConvertor {

    public static final String USD = "USD"; // by default 'public static final'
    static String UAH = "UAH"; // by default 'public static final'
    String EUR = "EUR"; // by default 'public static final'

    /**
     * Сhange the UAH to the USD.
     *
     * @param value
     * @return USD cash.
     */
    double convertUAHToUSD(double value);

    /**
     * Сhange the USD to the UAH.
     *
     * @param value
     * @return UAH cash.
     */
    double convertUSDtoUAH(double value);

    /**
     * Сhange the UAH to the EUR.
     *
     * @param value
     * @return EUR cash.
     */
    double convertUAHToEUR(double value);

    /**
     * Сhange the EUR to the UAH.
     *
     * @param value
     * @return UAH cash.
     */
    double convertEURtoUAH(double value);
}

package Localization;

import java.util.Locale;

public class Localization {
    public static void main(String[] args) {

        // Creating a new Locale
        Locale local1 = new Locale("English", "IN");

        // Use of getDefault() :
        Locale local2 = Locale.getDefault();

        System.out.println("Locale name : " + local1);
        System.out.println("Locale name Default : " + local2);

        // Use of getDisplayCountry() :
        System.out.println("\nCountry Name : "
                + local1.getDisplayCountry());

        // Use of getCountry() :
        System.out.println("Country Name ISO 3166 2-letter code : "
                + local1.getCountry());

        // Use of equal() :
        System.out.println("\nIs local1 equals local2 : "
                + local1.equals(local2));

        // clone() : local3 is a clone of local2
        Locale local3 = (Locale) local2.clone();

        // Locale : local
        System.out.println("Locale local3 same as local2 : "
                + local3);

        // Use of getAvailableLocales()
        Locale[] geek4 = Locale.getAvailableLocales();

        // We are not printing all the locales.
        System.out.println("\nInstalled locales are : ");
        for (int i = 1; i < geek4.length/10; i++)
            System.out.println(i + ":" + geek4[i]);

        // Use of getDisplayLanguage() :
        System.out.println("\nlocal2 Language : "
                + local2.getDisplayLanguage());

        // Use of getDisplayLanguage(Locale in) :
        System.out.println("Language of in Locale : "
                + local1.getDisplayLanguage(new Locale("France", "French")));

        // Use of getDisplayName :
        System.out.println("\nUse of getDisplayName : "
                + local1.getDisplayName());

        // Use of getDisplayName(Locale in) :
        System.out.println("Name of in Locale : "
                + local2.getDisplayName(new Locale("English", "english")));

        // Use of getISO3Country() :
        System.out.println("\nISO3 Country Name of local3 : "
                + local3.getISO3Country());

    }
}

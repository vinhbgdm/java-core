import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("getCountry(): " + defaultLocale.getCountry());
        System.out.println("getDisplayCountry(): " + defaultLocale.getDisplayCountry());
        System.out.println("getDisplayCountry(): " + defaultLocale.getDisplayCountry(new Locale("vi", "VN")));
        System.out.println("getDisplayLanguage(): " + defaultLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(): " + defaultLocale.getDisplayLanguage(new Locale("vi", "VN")));
        System.out.println("getDisplayName(): " + defaultLocale.getDisplayName());
        System.out.println("getDisplayVariant(): " + defaultLocale.getDisplayVariant());
        System.out.println("getISO3Country(): " + defaultLocale.getISO3Country());
        System.out.println("getISO3Language(): " + defaultLocale.getISO3Language());

        System.out.println("=============================");

        Locale vnLocale = new Locale("vi", "VN");
        Locale chinaLocale = Locale.CHINA;
        Locale japanLocale = Locale.JAPAN;

        System.out.println("getDisplayLanguage(Vietnam): " + vnLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(Vietnam): " + vnLocale.getDisplayLanguage(vnLocale));
        System.out.println("getDisplayLanguage(China): " + chinaLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(China): " + chinaLocale.getDisplayLanguage(vnLocale));
        System.out.println("getDisplayLanguage(Japan): " + japanLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(Japan): " + japanLocale.getDisplayLanguage(vnLocale));

        // Thiết lập ứng dụng triển khai tại Việt Nam
        System.out.println("----- [ NumberFormat ] ----- ");
        Locale locale = new Locale("vi", "VN");
        NumberFormat vnFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat jpFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat geFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(vnFormat.format(12345f));
        System.out.println(usFormat.format(12345f));
        System.out.println(jpFormat.format(12345f));
        System.out.println(geFormat.format(12345f));

        System.out.println("----- [ DateFormat ] ----- ");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, vnLocale);
        DateFormat dateFullFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat dateFieldFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD, Locale.JAPAN);
        DateFormat dateShortFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMANY);
        System.out.println(dateFormat.format(new Date()));
        System.out.println(dateFullFormat.format(new Date()));
        System.out.println(dateFieldFormat.format(new Date()));
        System.out.println(dateShortFormat.format(new Date()));

        System.out.println("----- [ Date ] ----- ");
        DateFormat vnTimeFormat = DateFormat.getTimeInstance(DateFormat.FULL, vnLocale);
        DateFormat usTimeFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
        DateFormat jpTimeFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.JAPAN);
        DateFormat geTimeFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.GERMANY);
        System.out.println(vnTimeFormat.format(new Date()));
        System.out.println(usTimeFormat.format(new Date()));
        System.out.println(jpTimeFormat.format(new Date()));
        System.out.println(geTimeFormat.format(new Date()));
    }
}
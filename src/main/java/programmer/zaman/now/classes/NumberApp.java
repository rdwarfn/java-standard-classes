package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        String contoh = "10000.1";
//        Integer contohInt = Integer.valueOf(contoh); // object / objek
//        int contohInt2 = Integer.parseInt(contoh); // primitif
        float contohFloat = Float.parseFloat(contoh);

        System.out.println(contoh);
//        System.out.println(contohInt);
//        System.out.println(contohInt2);
        System.out.println(contohFloat);

    }
}

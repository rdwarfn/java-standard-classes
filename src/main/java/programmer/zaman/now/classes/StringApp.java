package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Ridwan Arifin";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Ridwan"));
        System.out.println(name.endsWith("Arifin"));

        String[] names = name.split(" ");

        for (var value : names) {
            System.out.println("Value : " + value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

        for (var value : chars) {
            System.out.println("Chars name : " + value);
        }

    }
}

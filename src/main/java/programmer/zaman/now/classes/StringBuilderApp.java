package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

//        String name = "Ridwan";
//
//        name = name + " " + "Arifin";
//
//        System.out.println(name);

        // Ridwan
        // Ridwan Arifin

        // StringBuilder

        StringBuilder builder = new StringBuilder();
        builder.append("Ridwan");
        builder.append(" ");
        builder.append("Arifin");

        String name = builder.toString();
        System.out.println(name);

    }
}

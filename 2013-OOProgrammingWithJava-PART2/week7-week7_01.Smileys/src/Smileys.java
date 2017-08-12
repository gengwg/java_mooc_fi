
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        printOutter(characterString);

        printMiddle(characterString);

        printOutter(characterString);

    }

    private static void printMiddle(String characterString) {
        int pad = characterString.length() % 2;

        System.out.print(":) ");
        System.out.print(characterString);
        if (pad == 1) {
            System.out.print(" ");
        }
        System.out.println(" :)");
    }

    private static void printOutter(String characterString) {
        int pad = characterString.length() % 2;

        for (int i = 0; i < (characterString.length() + pad) / 2 + 3; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}

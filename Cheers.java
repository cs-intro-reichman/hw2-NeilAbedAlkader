import javax.print.DocFlavor;

public class Cheers {
    public static void main(String[] args) {
        // Parse inputs
        String str = args[0].toUpperCase(); // Convert input word to uppercase
        int var1 = Integer.parseInt(args[1]); // Number of times to cheer
        String specialLetters = "AEFHILMNORSX";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String article = specialLetters.indexOf(currentChar) != -1 ? "an" : "a";
            System.out.println("Give me " + article + " " + currentChar + ": " + currentChar + "!");
        }

        System.out.println("What does that spell?");


        for (int i = 0; i < var1; i++) {
            System.out.println(str + "!!!");
        }
    }
}

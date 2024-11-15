import javax.print.DocFlavor;

public class Cheers {
    public static void main(String[] args) {
        // Parse inputs
        String str = args[0].toUpperCase(); // Convert input word to uppercase
        int var1 = Integer.parseInt(args[1]); // Number of times to cheer

        // Characters that require "an"
        String specialLetters = "AEFHILMNORSX";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Determine if we should use "a" or "an"
            String article = specialLetters.indexOf(currentChar) != -1 ? "an" : "a";

            // Print the cheer line
            System.out.println("Give me " + article + " " + currentChar + ": " + currentChar + "!");
        }

        // Print the final cheer
        System.out.println("What does that spell?");
        for (int i = 0; i < var1; i++) {
            System.out.println(str + "!!!");
        }
    }
}

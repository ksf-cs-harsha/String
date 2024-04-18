package StringOperation.String;


public class Main {
    public static void main(String[] args) {

        StringProcessor stringProcessor = new StringProcessor();


        // Reverse the string
        String reversedString = stringProcessor.processString("Hai", (input) -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        });
        System.out.println("Reversed string: " + reversedString);

        //  uppercase
        String uppercaseString = stringProcessor.processString("hAi", String::toUpperCase);
        System.out.println("Uppercase string: " + uppercaseString);

        // whitespace
        String noWhitespaceString = stringProcessor.processString("h    a    i", (input) -> input.replaceAll("\\s", ""));
        System.out.println("String with no whitespace: " + noWhitespaceString);
    }
}


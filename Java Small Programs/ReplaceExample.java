public class ReplaceExample {
    public static void main(String[] args) {
        String input = "HARSHA";  // original text
        StringBuilder sb = new StringBuilder(input);

        // Loop through the string and replace as needed
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == 'A') {
                sb.replace(i, i + 1, "Adyar");
                i += "Adyar".length() - 1; // adjust index
            } else if (ch == '2') {
                sb.replace(i, i + 1, "2"); // redundant, but included per your rules
            } else if (ch == 'B') {
                sb.replace(i, i + 1, "bhavan");
                i += "bhavan".length() - 1; // adjust index
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Modified: " + sb.toString());
    }
}

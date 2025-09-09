public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for(int i = n; i >= 1; i--) {
            // print leading spaces
            for(int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }

            // print symbols with spaces between them
            for(int j = 1; j <= i; j++) {
                if(i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println(); // move to next line
        }
    }
}

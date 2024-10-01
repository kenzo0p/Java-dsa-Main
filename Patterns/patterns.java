public class patterns {
    public static void starPattern(int n) {
        // for printing the line
        for (int i = 1; i <= n; i++) {
            // for printing the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void invertedStarPattern(int n) {
        // for printing the line
        for (int i = 1; i <= n; i++) {
            // for printing the stars
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void charPattern(int n) {
        // for printing the line
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            // for printing the stars
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        charPattern(5);
    }
}
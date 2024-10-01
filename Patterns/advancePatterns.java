public class advancePatterns {
    public static void hollowReactangle(int totRows, int totCols) {
        // outer loop -rows
        for (int i = 1; i <= totRows; i++) {
            // inner loop - colums
            for (int j = 1; j <= totCols; j++) {
                // cell-(i,j) boundry cells conditions
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cell
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPyramid(int n) {
        // outer loop next line to print the rows
        for (int i = 1; i <= n; i++) {

            // for printing the spaces the condition is
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("  ");// dont use println otherwise you will go to the next line
            }
            // for printing the stars
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            // for printing next line
            System.out.println();
        }
    }

    public static void intvertedHalfPyramidNumbers(int n) {
        // outer loop for adding next line or row
        for (int line = 1; line <= n; line++) {
            // for printnig the numbers
            for (int num = 1; num <= n - line + 1; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

    }

    public static void floidsTriangle(int n) {
        int counter = 1;// for printing the numbers
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                // inner = how many times will counter be print
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle01(int n) {
        // outer loop
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                if ((line + j) % 2 == 0) {// most important and try to build your own logic

                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int line = 1; line <= n; line++) {
            // inner loop for stars
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("* ");
            }
            for (int spaces = 1; spaces <= 2 * (n - line); spaces++) {
                System.out.print("  ");
            }
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int line = n; line >= 1; line--) {
            // inner loop for stars same as first half
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("* ");
            }
            for (int spaces = 1; spaces <= 2 * (n - line); spaces++) {
                System.out.print("  ");
            }
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int n) {
        for (int line = 1; line <= n; line++) {
            // inner loop for spaces
            for (int spaces = 1; spaces <= n - line; spaces++) {
                System.out.print("  ");
            }
            for (int stars = 1; stars <= n; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int line = 1; line <= n; line++) {
            // spaces
            for (int spaces = 1; spaces <= (n - line); spaces++) {
                System.out.print("  ");
            }
            // hollow rectangle same code-stars
            for (int stars = 1; stars <= n; stars++) {
                if (line == 1 || line == n || stars == 1 || stars == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        floidsTriangle(5);

    }
}

/*Ryan Barber 4/5/2026 assignment 3.2*/

public class looping_numbers {

    public static void main(String[] args) {
        int rows = 7;
        int cellWidth = 3;   // width for each number slot

        for (int i = 1; i <= rows; i++) {

            // left padding to center the pyramid
            for (int s = 0; s < rows - i; s++) {
                System.out.printf("%" + cellWidth + "s", "");
            }

            int num = 1;

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%" + cellWidth + "d", num);
                num *= 2;
            }

            // decreasing numbers
            num /= 4;
            for (int j = 1; j < i; j++) {
                System.out.printf("%" + cellWidth + "d", num);
                num /= 2;
            }

            // right padding so the @ stays in one straight column
            for (int s = 0; s < rows - i; s++) {
                System.out.printf("%" + cellWidth + "s", "");
            }

            System.out.println(" @");
        }
    }
}
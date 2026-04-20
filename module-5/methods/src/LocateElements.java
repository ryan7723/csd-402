// Ryan Barber assignment 5.2 4/19/26

public class LocateElements {

    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0, col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0, col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0, col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0, col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length;  j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int []{row, col};
    }
}
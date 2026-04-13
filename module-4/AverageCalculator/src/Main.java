// Ryan Barber 4/12/26 Assignment 4.2

public class Main {

    // short array
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;

    }

    // long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // the main test program
    public static void main(String[] args) {

        short[] shortArray = {1, 2, 3};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};

        //display arrays and averages
        System.out.println("Short Array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));

    }

    // helper methods to print arrays
    public static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + "");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + "");
        }
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + "");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + "");
        }
        System.out.println();
    }
}
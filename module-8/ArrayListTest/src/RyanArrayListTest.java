// Ryan Barber Assignment 8.2 5/3/26

import java.util.ArrayList;
import java.util.Scanner;

public class RyanArrayListTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers. Enter 0 to stop:");

        int number;

        do {
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        Integer largest = max(numbers);
        System.out.println("The largest value is: " + largest);

    }

    public static Integer max(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Integer value : list) {
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }
}
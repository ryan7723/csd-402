//Ryan Barber Assignment 5/9/26

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        ArrayList<String> games = new ArrayList<>();

        games.add("Resident Evil 4");
        games.add("Elden Ring");
        games.add("Halo 3");
        games.add("Death Stranding 2: On the Beach");
        games.add("Mario Kart World");
        games.add("Far Cry 3");
        games.add("Max Payne 3");
        games.add("Devil May Cry 5");
        games.add("Cyberpunk 2077");
        games.add("Doom Eternal");

        System.out.println("Top 10 Favorite Games:");

        for (String game : games) {
            System.out.println(game);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the index number of a game from the list to see again: ");

        try {
            Integer Index = input.nextInt();

            System.out.println("You selected: " +games.get(Index));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");

        }catch (Exception e) {
            System.out.println("Invalid Input");
        }

        input.close();
    }
}
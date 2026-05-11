//Ryan Barber Assignment 9.2 5/9/26

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {

                int number = random.nextInt(100);
                writer.write(number + " ");
            }

            writer.write("\n");
            writer.close();

            System.out.println("Contents of file:");

            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext()) {

                System.out.println(fileReader.nextLine() + " ");
            }

            fileReader.close();

        } catch (IOException e) {

            System.out.println("An error has occurred.");
        }
    }
}
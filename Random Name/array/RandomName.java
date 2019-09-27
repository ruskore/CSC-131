package array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/18/2019
 * Time: 10:37 PM
 */
public class RandomName implements NameADT {
    private final int SIZE = 52;
    private String [] array;

    public RandomName (String fileName) throws FileNotFoundException {
        File filePath = new File("src/" + fileName + ".txt");
        Scanner reader = new Scanner(filePath);
        int index = 0;

        array = new String [SIZE];

        while(reader.hasNextLine()) {
            array[index] = reader.nextLine();
            index++;
        }
    }

    public int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(SIZE);
    }

    public String toString() {
        return array[randomNumber()];
    }
}

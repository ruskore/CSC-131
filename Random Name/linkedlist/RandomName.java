package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/18/2019
 * Time: 1:34 PM
 */

public class RandomName {

    private LinkedList<String> list;
    private int limit;


    public RandomName(String fileName) throws FileNotFoundException {
        File filePath = new File("src/" + fileName + ".txt");
        Scanner reader = new Scanner(filePath);

        list = new LinkedList<String>();
        while (reader.hasNextLine()) {
            list.push(reader.nextLine());
        }
        setLimit();
    }

    private int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(getLimit());
    }

    public void setLimit() {
        this.limit = list.size();
    }

    public int getLimit() {
        return this.limit;
    }

    public String toString() {

        if (list.isEmpty()) {
            throw new RuntimeException("Impossible to peek an element from the linked list when it is empty");
        }
        return this.list.peek(randomNumber());
    }
}

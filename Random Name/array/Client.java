package array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/18/2019
 * Time: 10:33 PM
 */
public class Client {
    public static void main(String[] args) throws IOException {
        getName();
    }

    private static void getName() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("          Random Name Raffle Drawer         ");
        System.out.println("============================================");
        System.out.println("\n\'Enter\' for next name or \'q\' to quit");
        System.out.print("\nThe files contains the names:\n" +
                "names.txt\n" +
                "Just enter (\"names\"): ");
        String filename = scan.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cont = "";
        System.out.println("The random names are: \n");
        do {
            RandomName name = new RandomName(filename);
            System.out.print(name);
            System.out.println();
            cont = br.readLine();

        }while (!cont.equals("q"));
    }
}

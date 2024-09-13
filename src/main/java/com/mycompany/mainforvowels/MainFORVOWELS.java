/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainforvowels;
import java.util.Scanner;
/**
 *
 * @author Tumiso
 */
public class MainFORVOWELS {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Call the countVowels function and display the result
        int numOfVowels = countVowels(sentence);
        System.out.println("Number of vowels: " + numOfVowels);
    }
}

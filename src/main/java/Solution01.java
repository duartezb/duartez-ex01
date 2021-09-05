/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/* Program prompts user's name and prints a greeting using name. */

/*import scanner*/
import java.util.Scanner;

/*main code*/
public class Solution01 {
    public static void main(String[] args) {

        /*prompt intro message*/
        System.out.print("What is your name? ");

        /*here a scanner named "input" is created to read user inputs*/
        Scanner input = new Scanner(System.in);

        /*scans in a string named name and input into next line*/
        String name = input.nextLine();

        /*output message back name with salutations*/
        System.out.printf("Hello, %s, nice to meet you!\n", name);


    }
}

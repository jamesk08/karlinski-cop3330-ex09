/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String lengthInput = scanner.nextLine();
        int length = Integer.parseInt(lengthInput);

        System.out.print("What is the width of the room in feet? ");
        String widthInput = scanner.nextLine();
        int width = Integer.parseInt(widthInput);

        int area = length * width;
        final double ONE_GALLON_COVERAGE = 350.0;
        int gallonOfPaintNeeded = (int) Math.ceil(area / ONE_GALLON_COVERAGE);

        String message = MessageFormat.format(
            "You will need to purchase {0} gallons of paint to cover {1} square feet.",
            gallonOfPaintNeeded,
            area
        );
        System.out.println(message);
    }
}
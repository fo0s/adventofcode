package com.fo0s.days.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class partTwo {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        int total = 0;

        try {
            Scanner scanner = new Scanner(new File("src/com/fo0s/input/Day1.txt"));
            while (scanner.hasNextLine()) {
                input.add(Integer.parseInt(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int value : input) {
            int tempNumber = 0;
            while(value > 0) {
                value = ((int) (Math.floor(value/3)) - 2);
                if(value > 0) tempNumber += value;
            }

            total += tempNumber;
        }

        System.out.println(total);
    }
}

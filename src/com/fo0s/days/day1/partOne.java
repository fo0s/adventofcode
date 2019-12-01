package com.fo0s.days.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class partOne {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Integer total = 0;

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
            total += ((int) (Math.floor(value/3)) - 2);
        }

        System.out.println(total);
    }

}
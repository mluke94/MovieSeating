package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

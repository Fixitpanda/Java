package com.javalecture;

import java.io.*;

public class Main {


    public static void main(String[] args) {

        String lecturer = null;
        String[] linesArray = new String[4];

        read("Users.txt", linesArray);

        for (String line : linesArray) {

            String[] splitLine = line.split("\t");

            if (splitLine[4].equals("lecturer")) {
                lecturer = splitLine[2];
                break;
            }

        }


        System.out.println("The lecturer is : " + lecturer);
    }

    public static void read(String fileName, String[] linesArray) {

        String line;

        int index = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src\\resources\\" + fileName), "UTF-8"
                )
        ))
        {

            while ( (line = reader.readLine()) != null) {
                linesArray[index] = line;
                index ++;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

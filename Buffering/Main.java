package com.javalecture;


import java.io.*;

public class Main {


    private static String inputFileName = "image-input.png";
    private static String outputFileName = "image-output.png";


    //Copying with buffering
    public static void copyFileWithBuffer() {

        long startTime, endTime;

        startTime = System.nanoTime();


        //BufferedInputStream --> FileInputStream
        //BufferedOutputStream --> FileOutputStream

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFileName));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFileName)))
        {


            byte[] byteBuffer = new byte[4000];

            int numBytesRead;

            while ( (numBytesRead = input.read(byteBuffer)) != -1 ) {

                output.write(byteBuffer, 0, numBytesRead);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Calculating end time after reading and writing to file
        endTime = System.nanoTime();

        //Printing the time elapsed
        System.out.println("Elapsed time " + (endTime - startTime) / 1000000);


    }


    //Copying with no buffering
    public static void fileCopy() {

        //Variables for calculating the time it took for the copy operation
        long startTime, endTime;

        File inputFile = new File(inputFileName);

        System.out.println("File size is " + inputFile.length());


        //Try with resources
        try (FileInputStream input = new FileInputStream(inputFileName);
             FileOutputStream output = new FileOutputStream(outputFileName))
        {

            //Returns Nano Seconds, popular unit for timing IO operations
            startTime = System.nanoTime();


            //Read method return int
            //1 Byte = 8 bits = 256 values
            int byteReader;

            //Reading and writing to/from files
            while ( (byteReader = input.read()) != -1 ) {

                output.write(byteReader);
            }

            //Calculating end time after reading and writing to file
            endTime = System.nanoTime();

            //Printing the time elapsed
            System.out.println("Elapsed time " + (endTime - startTime) / 1000000);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {
        copyFileWithBuffer();
    }


}

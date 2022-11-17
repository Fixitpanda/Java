package com.javalecture.utils;

import java.io.*;

public class IOUtils {

    public static String read(InputStream in) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                text.append(line).append("\n");
            }


        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return text.toString();
    }

}

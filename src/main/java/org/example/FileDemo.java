package org.example;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\t1786\\Desktop\\demo.txt");

        /* try (FileWriter writer = new FileWriter(file)) {
            writer.write("demo");
        }

        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c=reader.read()) != -1) {
                System.out.print((char)c);
            }
        } */

        /* try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(new byte[]{});
        }

        try (FileInputStream inputStream = new FileInputStream(file)) {
            inputStream.read();
        } */
    }
}

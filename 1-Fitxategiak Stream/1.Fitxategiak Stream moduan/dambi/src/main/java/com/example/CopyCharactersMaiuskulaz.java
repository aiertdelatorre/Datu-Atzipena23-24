package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersMaiuskulaz {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("CopyCharactersMaiuskulaz.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                if(c>=97 && c<=122){
                    c-=32;
                }
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}


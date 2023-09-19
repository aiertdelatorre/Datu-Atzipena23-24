package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesFNEControlatuz {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanatu.txt");
            out = new FileOutputStream("CopyBytesFNEControlatuz.txt");
            
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch(FileNotFoundException FNE){
            System.out.println("Fitxategia ezin izan da aurkitu");
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

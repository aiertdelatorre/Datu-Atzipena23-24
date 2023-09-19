package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class ZerrendaIkusi {
    public static void main(String[] args) throws IOException{
    
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
        outputStream = new PrintWriter(new FileWriter("CopyLines.txt"));

        String l;
        while ((l = inputStream.readLine()) != null) {
            String[] arrofStrings = l.split(";");
            for(int i = 0;i<arrofStrings.length;i++){
                System.out.printf("%15s",arrofStrings[i] );
                if(i >= 2){
                    System.out.println();
                } 
            }
        }
        outputStream.close();
        inputStream.close();
    }
}

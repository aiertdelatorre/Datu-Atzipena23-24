package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class AltuenaBistaratu {
    public static void main(String[] args) throws IOException{
    
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
        outputStream = new PrintWriter(new FileWriter("CopyLines.txt"));

        String l;
        String[][] arr = new String[100][3];
        String[] arr2 = {"omdv",Integer.toString(0),"all"};

        arr[0] = inputStream.readLine().split(";");

        for(int a =1;(l = inputStream.readLine()) != null;a++) {
            arr[a] = l.split(";");
            if(Integer.parseInt(arr[a][1]) > Integer.parseInt(arr2[1])){
                arr2[0] = arr[a][0];               
                arr2[1] = arr[a][1];
                arr2[2] = arr[a][2];
            }
        }
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);
        outputStream.close();
        inputStream.close();
    }
}




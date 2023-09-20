
package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class MendiakEsportatu {
    public static void main(String[] args) throws IOException{
    
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
        outputStream = new PrintWriter(new FileWriter("CopyLines.txt"));

        String l;
        String[][] mendidanak = new String[100][3];
        String[][] gipuzkoa = new String[5][3];       
        String[][] bizkaia = new String[4][3];
        String[][] araba = new String[8][3];

        mendidanak[0] = inputStream.readLine().split(";");

        for(int a =1;(l = inputStream.readLine()) != null;a++) {
            int g = 0;
            int b= 0;
            int ar = 0;
            mendidanak[a] = l.split(";");
            if(mendidanak[a][2] == "Gipuzkoa"){
                gipuzkoa[g] = mendidanak[a];
                g++;
            }else if(mendidanak[a][2] == "Bizkaia"){
                bizkaia[b] = mendidanak[a];
                b++;
            }else{
                araba[ar] = mendidanak[a];
            }
        }

        for(int i = 0;i<bizkaia.length;i++){
            System.out.print(bizkaia[i][0]);
            System.out.print(bizkaia[i][1]);
            System.out.println(bizkaia[i][2]);
        }

        for(int i = 0;i<gipuzkoa.length;i++){
            System.out.print(bizkaia[i][0]);
            System.out.print(bizkaia[i][1]);
            System.out.println(bizkaia[i][2]);
        }

        for(int i = 0;i<gipuzkoa.length;i++){
            System.out.print(bizkaia[i][0]);
            System.out.print(bizkaia[i][1]);
            System.out.println(bizkaia[i][2]);
        }



        outputStream.close();
        inputStream.close();
    }
}




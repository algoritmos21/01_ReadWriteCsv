/*
 * MIT License included in root directory
 */
package pp;

/**
 * @author software@lucianomori.com
 */

import java.io.*;

public class Open {

    public static String[] Leer(String input, String comma) {

        String line = "";
        String outputString;
        String ArrayCsv[] = new String[4];
        
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {

            //Para cada linea no vacia
            for (int i = 0; (line = br.readLine()) != null ; i++) {
                String[] table = line.split(comma);
                //Reordeno y etiqueto datos
                outputString = "Posición= " + table[1] + " ,Grupo= " + table[2]+ " , Nombre= " + table[0] ;
                ArrayCsv[i] = outputString;   
            }
        } catch (IOException e) {
            System.out.println("Error al leer .csv");
            e.printStackTrace();            
        } 
        return ArrayCsv;
    }
}
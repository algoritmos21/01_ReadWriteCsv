/*
 * MIT License included in root directory
 */
package pp;

/**
 * @author software@lucianomori.com
 */

import java.io.*;
        
public class Main {
    
    public static void main(String[] args) {
        String inputFile = "./csv/input.csv";   
        String outputFile = "./csv/output.csv";
        String separator = ",";    
        String carriageReturn = "\n";
        
        //Creo archivo .csv destino
        File file = new File(outputFile);
        
        try{file.createNewFile();
            FileWriter writer = new FileWriter(file); 
            
            //Para cada linea leo input, escribo output y agrego un enter
            for (String Leer : Open.Leer(inputFile, separator)) {
                //System.out.println(Leer);
                writer.write(Leer);
                writer.write(carriageReturn);
            }
            //Cierro archivo
            writer.flush();
            writer.close();            
        }catch (IOException e) {
            System.out.println("Error al acceder a archivo .csv");
            e.printStackTrace();            
        } 
    }    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package stmaryhospital.medicalnumber4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MedicalNumber4 {

    public static void main(String[] args) {
     
        File medicalLogFile = new File("medical_log.txt"); 

        Scanner reader = null;
        try {
            reader = new Scanner(medicalLogFile);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }  catch (IOException e) {
            System.err.println("Error reading the medical log file.");
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}



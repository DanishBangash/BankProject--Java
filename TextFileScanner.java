/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danish Bangash
 */
public class TextFileScanner {

    static String name;
    static int IBAN;
    static int balance;

    public TextFileScanner() {
        String name;
        int IBAN ;
        int balance ;
    }

    public void readFile(String fileName) {
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
           
            while (input.hasNext()) {
               name = input.next();
                IBAN = input.nextInt();
                balance = input.nextInt();
            
                //   System.out.println(name[i] + IBAN[i] + balance[i]);
                
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileScanner.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void main(String[] args) {
        TextFileScanner textFileScanner = new TextFileScanner();
        textFileScanner.readFile("bankdata.txt");
    }
}

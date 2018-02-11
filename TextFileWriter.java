/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danish Bangash
 */
public class TextFileWriter {

    String name;
    int balance;
    int IBAN;
    TextFileScanner tfs = new TextFileScanner();

    public TextFileWriter() {
    }

    public void writeFile(String fileName) {
        PrintWriter output = null;
        int i = 0;
        tfs.readFile("bankdata.txt");
        
        try {
            output = new PrintWriter(new File(fileName));
           
            
                output.print(tfs.name + " ");
                output.print(tfs.IBAN + " ");
                output.print(tfs.balance + " ");
                output.println();
            
            output.print(name + " ");
            output.print(IBAN + " ");
            output.print(balance + " ");
            output.println();
            

            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static void main(String[] args) {
        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeFile("bankdata.txt");
    }
}
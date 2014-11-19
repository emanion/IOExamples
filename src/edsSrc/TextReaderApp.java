package edsSrc;

import ioexamples.*;
import java.io.*;
/**
 * TextReaderApp.java	1.00 Nov 25, 2003
 *
 * A class that reads data from a text file, with buffering. Uses
 * the file "test.txt" which is in this project. Try reading your
 * own text file stored in a different directory.
 */
public class TextReaderApp{
	
   public static void main(String[] args) {
  	File data = new File("src" + 
                File.separatorChar + "lab1.txt");
        
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
           
           int lineCount = 0;
	   String line = in.readLine();
	   while(line != null){
		  //System.out.println(line);
                  lineCount +=1;
                  parseOutLine(line, lineCount);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        
        
        
    }  
   
   
   
   
        
        
        private static void parseOutLine(String line, int lineCount){
            
            String firstName;
            String lastName;
            
            if (lineCount == 1)
            {
                String[] parts = line.split(" ");
                if (parts.length == 2){
                    firstName = parts[0];
                    lastName = parts[1];
                    System.out.println("First Name = " + firstName);
                    System.out.println("Last Name = " + lastName);
                    
                } else {
                    System.out.println("oops, bad name format!!!");
                }
                    
            }
            
            
            
            
        }
   
   
   
   
} // end classd

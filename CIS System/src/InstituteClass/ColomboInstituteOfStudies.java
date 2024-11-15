
package InstituteClass;

import java.io.*;
import java.lang.invoke.MethodHandles;

public class ColomboInstituteOfStudies {
    
    private static String FILE_PATH = "c:\\Example\\";        
    File file;  
    private String fileName;
    private String ex;
    
    public ColomboInstituteOfStudies (String fileName)
    {
    this.fileName = fileName;
    createANewFile();
    }
    
    public boolean createANewFile()
    {
        try 
        {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()) 
            {
                System.out.println("File Created:" + file.getName());
                return true;
                
            } 
            else 
            {
                System.out.println("File Already Exist!");
                return false;
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Something Went Wrong With Creating a File" + ex);
            return false;
        }       
    }
    
    public boolean WriteDataToFile(String Record)
    {
        try 
        {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(Record);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            return true;
            
        } 
        catch (Exception ex) 
        {
            System.out.println("Something Went Wrong With Write Data To File!" + ex);
            return false;
        }    
    }
    
    public BufferedReader ReadFile()
    {
        if(!createANewFile())
        {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            return bufferedReader;
            
            } 
        catch (Exception ex) 
            {
                
            System.out.println("Something Went Wrong With Reading The File"+ex);
            
            }
        }        
        return null;    
    }
}






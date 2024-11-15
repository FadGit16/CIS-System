
package InstituteClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class DepartmentClass {
    
    private String DepartmentID;
    private String DepartmentName;
    private String DepartmentLocationF;
    private String DepartmentLocationL;
    private String DepartmentType;
    
    private int DepartmentCount;
    
    ColomboInstituteOfStudies colomboInstituteOfStudies = new ColomboInstituteOfStudies("Department Details.txt");
    
    public DepartmentClass(){}
    private String allDepartment;

    public DepartmentClass(String DepartmentID, String DepartmentName, String DepartmentLocationF, String DepartmentLocationL, String DepartmentType) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
        this.DepartmentLocationF = DepartmentLocationF;
        this.DepartmentLocationL = DepartmentLocationL;
        this.DepartmentType = DepartmentType;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDepartmentLocationF() {
        return DepartmentLocationF;
    }

    public void setDepartmentLocationF(String DepartmentLocationF) {
        this.DepartmentLocationF = DepartmentLocationF;
    }

    public String getDepartmentLocationL() {
        return DepartmentLocationL;
    }

    public void setDepartmentLocationL(String DepartmentLocationL) {
        this.DepartmentLocationL = DepartmentLocationL;
    }

    public String getDepartmentType() {
        return DepartmentType;
    }

    public void setDepartmentType(String DepartmentType) {
        this.DepartmentType = DepartmentType;
    }

    public int getDepartmentCount() {
        return DepartmentCount;
    }

    public void setDepartmentCount(int DepartmentCount) {
        this.DepartmentCount = DepartmentCount;
    }

    public boolean addDepartment()
    {
        if(!colomboInstituteOfStudies.createANewFile())
        {
            String Record = DepartmentID + " " + DepartmentName + " " + 
                    DepartmentLocationF + " " + DepartmentLocationL + " " +
                    DepartmentType;
            return colomboInstituteOfStudies.WriteDataToFile(Record);
        }
        return false;
    }
    
    public String viewDepartment()
    {
        String Department, viewDepartment = " ";
        String[] words = null;
        int count = 0;
        
        BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
        
        try 
        {
            while ((Department = bufferedReader.readLine()) != null)
            {
                words = Department.split(" ");
                allDepartment = allDepartment + words[0] + "\t" + words[1] + "\t" + 
                        words[2] + "t" + words[3] + "\n";
                count++;
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error View Department!" + ex);
        }
        setDepartmentCount(count);
        return allDepartment;
    }
    
    public boolean SearchDepartmentID(String UserID)
    {
        boolean isFound = false;
        try 
        {
            String [] user = null;
            BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
            
            String Department;
            outerloop:
            
            while ((Department = bufferedReader.readLine()) != null) 
            {
                user = Department.split(" ");
                for(String word : user)
                {
                    if(word.equals(word))
                    {
                        isFound = true;
                        this.setDepartmentID(user[0]);
                        this.setDepartmentName(user[1]);
                        this.setDepartmentLocationF(user[2]);
                        this.setDepartmentLocationL(user[3]);
                        this.setDepartmentType(user[4]);
                        break outerloop;
                    }
                }
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error Search Department");
        }
        return isFound;
    }
}

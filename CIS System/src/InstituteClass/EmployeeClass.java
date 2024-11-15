package InstituteClass;

import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeClass 
{
    
    private String EmployeeID;
    private String EmployeeFirstName;
    private String EmployeeLastName;
    private int Age;
    private String Address;
    private String DOB;
    private String Gender;
    private String PhoneNumber;
    private String Email;
    private String Designation;
    private String Department;
     
    private int EmployeeCount;
    
    ColomboInstituteOfStudies colomboInstituteOfStudies = new ColomboInstituteOfStudies("Employee Information.txt");

    public EmployeeClass(){}
    private String allEmployee;

    public EmployeeClass(String EmployeeID, String EmployeeFirstName, String EmployeeLastName, int Age, String Address, String DOB, String Gender, String PhoneNumber, String Email, String Designation, String Department) {
        this.EmployeeID = EmployeeID;
        this.EmployeeFirstName = EmployeeFirstName;
        this.EmployeeLastName = EmployeeLastName;
        this.Age = Age;
        this.Address = Address;
        this.DOB = DOB;
        this.Gender = Gender;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Designation = Designation;
        this.Department = Department;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public void setEmployeeFirstName(String EmployeeFirstName) {
        this.EmployeeFirstName = EmployeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public void setEmployeeLastName(String EmployeeLastName) {
        this.EmployeeLastName = EmployeeLastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }

    public boolean addEmployee()
    {
        if (!colomboInstituteOfStudies.createANewFile()) 
        {
            String Record = EmployeeID + " " + EmployeeFirstName+" "+EmployeeLastName + " " + 
                Age + " " + Address + " " + DOB + " " + Gender + " " + 
                    PhoneNumber + " " + Email + " " + Department + " " + Designation;
            return colomboInstituteOfStudies.WriteDataToFile(Record);
        } 
        return false;
    }
    
    public String viewAllEmployee ()
    {
        String Employee, viewAllEmployee = " ";
        String[] words = null;
        int count = 0;
        
        BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
        
        try 
        {
         while ((Employee = bufferedReader.readLine()) != null)
         {
             words = Employee.split(" ");
             allEmployee = allEmployee + words[0] + "\t" + words[1] + "\t" + words[2] + "t" + words[3] + "\n";
                count++;
         }   
        } 
        catch (IOException ex) 
        {
            System.out.println("Error View User" + ex);
        }
        setEmployeeCount(count);
        return allEmployee;
    }
    
    public boolean searchEmployee(String UserID)
    {
        boolean isFound = false;
        
        try 
        {
            String [] user = null;
            BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
            
            String Employee;
            outerloop:
            
            while ((Employee = bufferedReader.readLine()) != null)
            {
                user = Employee.split(" ");
                for(String word : user)
                {
                    isFound = true;
                    this.setEmployeeID(user[0]);
                    this.setEmployeeFirstName(user[1]);
                    this.setEmployeeLastName(user[2]);
                    this.setAge(Age);
                    this.setDOB(user[3]);
                    this.setGender(user[4]);
                    this.setPhoneNumber(user[5]);
                    this.setEmail(user[6]);
                    this.setAddress(user[7]);
                    this.setDepartment(user[8]);
                    this.setDesignation(user[9]);
                    break outerloop;
                }
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error Search Employee!");
        }
        return isFound;
    }
}



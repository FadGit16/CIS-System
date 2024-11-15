

package InstituteClass;
import java.io.*;

public class UserClass {
    
    private String UserID;
    private String Password;
    private String UserType;
    private int UserCount;

    ColomboInstituteOfStudies colomboInstituteOfStudies = new ColomboInstituteOfStudies("Registered Information.txt");

    public UserClass() {}

    public UserClass(String UserID, String Password) {
        this.UserID = UserID;
        this.Password = Password;
    }

    public UserClass(String UserID, String Password, String UserType) {
        this.UserID = UserID;
        this.Password = Password;
        this.UserType = UserType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
    
    public boolean addNewUser()
    {
        if(!colomboInstituteOfStudies.createANewFile())
        {
            String Record = UserID + " " + Password + " " + UserType;
            return colomboInstituteOfStudies.WriteDataToFile(Record);
        }
        return false;    
    }
    
    public boolean validateLogin()
    {
        try 
        {
           String[] words = null;
           
           BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
           String user;
           while((user = bufferedReader.readLine()) != null )
           {
               words = user.split(" ");
               if(words[0].equals(UserID) && words[1].equals(Password))
               {
                   this.setPassword(words[0]);
                   this.setUserID(words[1]);
                   this.setUserType(words[2]);
                   return true;
               }
           }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error Validating Login()" + ex);
            return false;
        }
        return false;
    }
    
    public String viewAllUsers ()
    {
        String User, allUsers = " ";
        String[] words = null;
        int count = 0;
        
        BufferedReader bufferedReader = colomboInstituteOfStudies.ReadFile();
        
        try 
        {
            while ((User = bufferedReader.readLine()) != null)
            {
                words = User.split(" ");
                allUsers = allUsers + words[0] + "\t" + words[2] + "\n";
                count++;
            }            
        } 
        catch (IOException ex) 
        {
            System.out.println("Error View User" + ex);           
        }
        setUserCount(count);
        return allUsers;   
    }
}

    


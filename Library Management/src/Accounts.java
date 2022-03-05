import java.util.*;


public class Accounts {
Scanner scnr = new Scanner(System.in);    


private String fullName;
 private String studPassword;
 private int staffName;
 private String staffPassword;
 private int truthValue;


//Default Constructor//
public Accounts(){
    
}
//----------------------------------------------------------------SETTERS-----------------------------------------------------------//

//Check whether if you're a student or staff algortithm
public void setLogin(int Value){

if(Value == 0){
    System.out.println("Welcome Student, please enter your login Details");
    this.setFullName(scnr.nextLine());
    this.setPassword(scnr.nextLine());
}else if(Value == 1){
    System.out.println("Welcome Staff, please enter your login Details");
    this.setStaffName(scnr.nextInt());
    this.setStaffPassword(scnr.nextLine());
}else{
    System.out.println("Error, Choose between 0 or 1");
}

}

 //Student Login//
 public void setFullName(String name){
     fullName = name;
 }

 public void setPassword(String password){
     studPassword = password;
     int i;
     for(i = 0; i< password.length(); i++){
        if(password.contains("@") || password.contains("#") || password.contains("<") || password.contains(">") 
        || password.contains("&")){
           System.out.println("Welcome " + getFullName());
           break;

        }else{
            System.out.println("Your password should contain one of the symbols: "+ "@#<>&");
            break;
        }
  
    }
 }



 //Staff Setter

public void setStaffName(int staffID){
staffName = staffID;
if(isNaN(staffID)){
    System.out.println("Your ID should be in Numbers");
}
}


public void setStaffPassword(String password){
staffPassword = password;
}

/*----------------------------------------------------------GETTER SECTION---------------------------------------------------*/

//Staff Getter
public int getStaffName(){
    return staffName;
}

private boolean isNaN(int staffID) {
    return false;
}

public String getStaffPassword(){
    return staffPassword;
}


 //Student Getters//
 public String getFullName(){
     return fullName;
 }


 public String getPassword(){
     return studPassword;
 }


 public int getLogin(){
     return truthValue;
 }
}
    


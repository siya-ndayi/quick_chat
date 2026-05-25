/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author siyan
 */
public class loginuser {
    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String cellPhoneNumber;
    
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
     
     public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasUpper   = password.chars().anyMatch(Character::isUpperCase);
        boolean hasDigit   = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.chars().anyMatch(c ->
                "!@#$%^&*()-_=+[]{}|;:',.<>?/`~".indexOf(c) >= 0);
        return hasUpper && hasDigit && hasSpecial; 
    } 
     
    
}

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---REGISTRATION---");
        System.out.println("Enter first name:");
        System.out.println("Enter last name:");
        
        System.out.print("Enter first name    : ");
        String firstName = sc.nextLine();
        
        
        System.out.print("Enter last name     : ");
        String lastName = sc.nextLine();

        System.out.print("Enter username      : ");
        String username = sc.nextLine();

        System.out.print("Enter password       ");
        String password = sc.nextLine();

        System.out.print("Enter cell phone (+27...): ");
        String cellphone = sc.nextLine();

        System.out.println("Username successfully captured.");
        System.out.println("Username is not correctly formatted; please ensure that" + "your username contains an underscore and is no more than" + "five characters characters in length");
        System.out.println("password is not correctly formatted; please ensure that" + "the password contains at least eight characters, a captial" + "letter, a number, and a special character.");
        System.out.println("Enter South African cell phone number (e.g.,+27761123456:");
        System.out.println("Cell phone number incorrectly formatted or does not contain " + "international code");
        System.out.println("Registration failed. please restart the application.");
        
        
    }
    

package Strings_May_07_practice;



import java.util.Scanner;

public class UserRegistrationValidation {

    public static int phoneNumberValidation(long number){
        String num=String.valueOf(number);
        if(num.length()!=10){
            System.out.println("The phone number should contain exactly 10 characters");
            return -1;
        }
         for(int i=0;i<num.length();i++){
             if(!Character.isDigit(num.charAt(i))){
                 System.out.println("The phone Number should only contain digits");
                 return -1;
             }
         }
         return 0;
    }

    public static int emailValidation(String emailId){
        String domain="",username="",extension="";
        String[] parts= emailId.split("@");
        if(parts.length==2){
            username= parts[0];
            String[] domainParts = parts[1].split("\\.");
            if(domainParts.length==2){
                domain=domainParts[0];
                extension=domainParts[1];
            }
        }
        for(int i=0;i<username.length();i++){
            char var=username.charAt(i);
            if(!Character.isLetterOrDigit(var)){
                if((var != '.') && (var != '_') && (var != '-')){
                    System.out.println("Invalid username in emailid please check once");
                    return -1;
                }
            }
        }
        for(int i=0;i<domain.length();i++){
            if(!Character.isLetterOrDigit(domain.charAt(i))){
                System.out.println("The domain should only contain letters or digits");
                return -1;
            }
        }
        if(extension.length()>=2) {
            for (int i = 0; i < extension.length(); i++) {
                if(!Character.isLetter(extension.charAt(i))){
                    System.out.println("The extension should contain only letters");
                    return -1;
                }
            }
        }
        else{
            System.out.println("Invalid extension extension should be atleast 2 character");
            return -1;
        }
        return 0;
    }

    public static int passwordValidation(String password){
        int upperCount=0,lowerCount=0,digitCount=0;
        if(password.length()<8){
            System.out.println("password should contai atleast 8 characters");
            return -1;
        }
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                upperCount++;
            }
            if(Character.isLowerCase(password.charAt(i))){
                lowerCount++;
            }
            if(Character.isDigit(password.charAt(i))){
                digitCount++;
            }
        }
        if(upperCount<1 && lowerCount<1 && digitCount<1){
            System.out.println("password should contain 1 uppercase 1lowercase 1 digit");
            return -1;
        }
        return 0;
    }

    public static int userValidation(String username){
        if(username.length()<6 || username.length()>12){
            System.out.println("username should contains 6 to 12 characters");
            return -1;
        }
        if(!Character.isLetter(username.charAt(0))){
            System.out.println("username should starts with a character");
            return -1;
        }
        for(int i=0;i<username.length();i++){
            if(!Character.isLetterOrDigit(username.charAt(i))){
                System.out.println("Username special Characters are not allowed");
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username,password,emailId;
        int age;
        long phoneNumber;
        System.out.println("Welcome to the Website");
        System.out.println("to login please Enter your user name");
        username=sc.next();

        int userInt=userValidation(username);
        if(userInt==-1){
            System.out.println("Invalid username");
            return;
        }
        else{
            System.out.println("Valid user name proceed");
        }
        //password validation
        System.out.println("Please Enter the password here");
        password=sc.next();
        int passwordInt=passwordValidation(password);
        if(passwordInt==-1){
            System.out.println("Invalid password");
            return;
        }
        else{
            System.out.println("Valid password please proceed");
        }
        //Email Validation

        System.out.println("Please Enter the email ");
        emailId=sc.next();
        int emailInt=emailValidation(emailId);
        if(emailInt==-1){
            System.out.println("Invalid emailId please try again");
            return;
        }
        else{
            System.out.println("Valid emailId please proceed");
        }
        //Age validation
        System.out.println("Please enter your age");
        age=sc.nextInt();
        if(age>0){
            System.out.println("Valid age please proceed");
        }
        else{
            System.out.println("Invalid age, Age should be positive integer");
            return;
        }

        //phone number verification
        System.out.println("Please Enter your phone number");
        phoneNumber=sc.nextLong();
        int phoneInt=phoneNumberValidation(phoneNumber);
        if(phoneInt==-1){
            System.out.println("Invalid phone number");
            return;
        }
        else{
            System.out.println("Valid phone Number");
        }

        System.out.println("User registration successful Hurray!!");

    }
}

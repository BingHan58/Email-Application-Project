package email;

import java.util.Locale;
import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //constructor to receive the first name and last name
    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName +" " + this.lastName);

        // Call a method asking for the department
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("your email is: " + email);

    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Department code\n1 for sales\n2 for development\n3 for Accounting\n4 for none");
        Scanner in = new Scanner(System.in);
        int DepChoice = in.nextInt();
        if (DepChoice == 1){
            return "sales";}
        if (DepChoice == 2){
            return "dev";}
        if (DepChoice == 3){
            return "acct";}
        else {
            return"";}
        }

    //Generate a random password
    private String randomPassword (int length){
        String passwordSet = "ABDCEFGHIJKLMNOPQRSTUVWXYZ4567890";
        char[]password = new char[length];
        for (int i=0 ; i<length ; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //set the mailbox capacity
    public void setMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail (String alternateEmail){
        this.alternateEmail=alternateEmail;
    }

    //change the password
    public void changePassword (String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DisPlay Name: " + firstName + "" + lastName +
                "Company Email: " + email + " " +
                "Mailbox capacity: " + mailboxCapacity;
    }
}


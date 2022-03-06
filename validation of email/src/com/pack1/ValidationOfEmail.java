package com.pack1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidationOfEmail {
public static boolean isValidEmail(String emailid) {
String regex = "^(.+)@(.+)$";
 //initialize the Pattern object
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(emailid);
return matcher.matches();
}
public static void main(String[] args) {
List<String> emailstrings = new ArrayList<String>();
// valid email addresses
emailstrings.add("Balayya@loginid.com");
emailstrings.add("Hemanth@loginid.com");
emailstrings.add("@loginid.me.org");
//invalid email addresses
emailstrings.add("satya.example.com");
emailstrings.add("Anil..Merugu@loginiBhemanth@loginid.comd.com");
emailstrings.add("Prince@.loginid.com");
for (String emailvalid : emailstrings) {
System.out.println("The Email address " + emailvalid + " is " + (isValidEmail(emailvalid) ? "valid one " : "not a valid one"));
}
System.out.println("Enter any email address to check");
		       Scanner enteredinput = new Scanner(System.in);
		       String input = enteredinput.nextLine();
		       System.out.println("The Email address what you are  entered one becomes  " + input + " now " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}
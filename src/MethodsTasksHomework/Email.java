package MethodsTasksHomework;

public class Email {
    /*
Create a method createEmail(). Based on values of users name,
lastName and email type, your method should return complete email Address. Example:
createEmail(John, Snow, gmail) → johnsnow@gmail.com or
 */

    String createEmail(String firstName, String lastName, String emailType){
        return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }
    public static void main (String[]args){
        Email task5=new Email();
        String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(task5.createEmail("Niazi","Zamir","outlook"));
    }



}

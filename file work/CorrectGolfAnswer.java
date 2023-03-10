/**
 * golfingTask
 */

 // record structure
import java.io.*;
import java.util.Scanner;
public class CorrectGolfAnswer {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        
      
        System.out.println("Please enter forename");
        String forename = keyboard.nextLine();
        System.out.println("please enter surname");
        String surname = keyboard.nextLine();
        System.out.println("Please enter category");
        String category = keyboard.nextLine();
        String password = getValidPassword();
        //System.out.println(password);
        String [] categoryArray = getCategory(forename, surname, category, password);
        
        displayCategory(categoryArray);
    }
    public static void displayCategory (String [] category) {
        int adultCategory = 0;
        int seniorCategory = 0;
        int juniorCategory = 0;
        for (int i = 0; i < category.length; i++) {
            if (category[i].equals("Adult")) {
                adultCategory++;
            }
            else if(category[i].equals("Junior")) {
                juniorCategory++;
            }
            else {
                seniorCategory++;
            }
        }
        System.out.println("There are currently "+ adultCategory+" adult members");
        System.out.println("There are currently " + juniorCategory + " junior memebers");
        System.out.println("There are currently " + seniorCategory + " senior members");

    }
    public static String [] getCategory(String forename, String surename, String category, String password) throws IOException{
        final int STUDENT_NUMBER = 11;

        String [] forenameArray = new String [STUDENT_NUMBER];
        String [] surenameArray = new String [STUDENT_NUMBER]; 
        String [] categoryArray = new String [STUDENT_NUMBER];
        String [] passwordArray = new String [STUDENT_NUMBER];

        String fileName = "GolfMember.txt";
        
        Scanner fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
        
        fileScanner.useDelimiter("[\\r\\n,]+");

        for(int currentline = 0; currentline < STUDENT_NUMBER-1; currentline ++) {
            forenameArray[currentline] = fileScanner.next();
            surenameArray[currentline] = fileScanner.next();
            categoryArray[currentline] = fileScanner.next();
            passwordArray[currentline] = fileScanner.next();
        }
        fileScanner.close();
        System.out.println(forenameArray[9]);
        forenameArray[10] = forename;
        surenameArray[10] = surename;
        categoryArray[10] = category;
        passwordArray[10] = password;

        System.out.println("The members are:");
        for (int i = 0; i < passwordArray.length; i++) {
            System.out.println(forenameArray[i]+" "+ surenameArray[i]+ " "+ categoryArray[i]);
        }
        return categoryArray;

    }
    public static String getValidPassword () {
        String password = " ";
        boolean valid = false;
        do {
            System.out.println("Please enter a valid Password");
            password = keyboard.nextLine();
            int firstCharAsciiValue = (int) password.charAt(0);
            int lastCharAsciiValue = (int) password.charAt(password.length()-1);

            if (firstCharAsciiValue > 64 && firstCharAsciiValue < 91) {
                if (lastCharAsciiValue > 34 && lastCharAsciiValue < 38) {
                    valid = true;
                }
            }

        }while (valid == false);
        return password;
    }
}

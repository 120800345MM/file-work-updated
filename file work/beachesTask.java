//record structures

import java.util.Scanner;
import java.io.*;

class BeachData {
    String name;
    int rating;
    
}

public class beachesTask {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        
        BeachData [] beaches = readBeachesFromFile();
        double avg = average(beaches);
        averagething(avg);
        ratingFromUser( beaches);
        }
        public static void averagething(double avg) {
            System.out.println(avg);

        }
 
        
        public static void ratingFromUser(BeachData [] beaches){
            System.out.println("etner ratasd ting ");//lachlans bad spelling line
            int usersRating = keyboard.nextInt();
            for (int index = 0; index < beaches.length; index ++) {
                if (usersRating == beaches[index].rating){
                    System.out.println(beaches[index].name);
                }

            }

        }
        
        // sub program to read from file
        public static BeachData[] readBeachesFromFile() {
        String fileName = "beachData.csv";
        Scanner fileScanner = null;
        BeachData [] beaches = new BeachData[973];

        // for loop saying everytime there is a comma or new line                           
        try{
            fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
            fileScanner.useDelimiter("[\\r\\n,]+");
            int currentLine = 0;
            
            while (fileScanner.hasNext()){
                beaches[currentLine] = new BeachData();
                beaches[currentLine].name = fileScanner.next();
                beaches[currentLine].rating = fileScanner.nextInt();
                
                currentLine++;
            }
        }

        catch (FileNotFoundException error) {
            System.out.println("file not found " + error);
        }

        finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }

        return beaches;
        }

        //code to find average 
        public static double average(BeachData [] beaches){
            int total = 0;
            double  average = 0;
            int count = 0;
            for (int index = 0; index < beaches.length; index ++) {
                if (beaches[index].rating != 5) {
                    total = total +  beaches[index].rating;
                    count++;
                }

            }
            average = (double )total/(double) count;
            return average;
        }

        


        
    }

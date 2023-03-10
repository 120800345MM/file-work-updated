import java.util.Scanner;
import java.io.*;

class GOLF {

   String foreName;
   String SurName;
   String member;
   String password;

}

public class GolfTask {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) { 

        public static GOLF[] readBeachesFromFile() {
            String fileName = "beachData.csv";
            Scanner fileScanner = null;
            GOLF [] GolfMembers = GolfMembers[10]

       
        try{
            fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
            fileScanner.useDelimiter("[\\r\\n,]+");
            int currentLine = 0;
            while (fileScanner.hasNext()){
                GolfMembers[currentLine] = new GOLF();
                GolfMembers[currentLine].foreName = fileScanner.next();
                GolfMembers[currentLine].SurName = fileScanner.next();
                GolfMembers[currentLine].member = fileScanner.next();
                GolfMembers[currentLine].password = fileScanner.next();
                
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
        
        public static double average(GOLF [] golfs)






    }
}

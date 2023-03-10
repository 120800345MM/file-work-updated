import java.util.Scanner;
import java.io.*;

class runner {
    int bibNo;
    String runnerName;
    int age;
    int laneNo;
    double time;
}

public class RunnersTask {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException { 
        // make an array for the runners
        runner [] runnerDetails = new runner[8];
        // read file
        readFile(runnerDetails);
        // info of runner
        info(runnerDetails);
        
    }

    public static void info(runner [] runners) throws IOException {
        for (int index = 0; index < runner.length; index ++)
        System.out.println("" + bibNo );
    }
        

    // read file sub program
    public static void readFile(runner [] runners) throws IOException {
        
        // change file name
        String fileName = "Runners.csv";
        
        Scanner fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
        
        fileScanner.useDelimiter("[\\r\\n,]+");
        
        

        try{
            fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
            fileScanner.useDelimiter("[\\r\\n,]+");
            int currentLine = 0;
            while (fileScanner.hasNext()){
                runners[currentLine] = new runner();
                runners[currentLine].bibNo = fileScanner.nextInt();
                runners[currentLine].runnerName = fileScanner.next();
                runners[currentLine].age = fileScanner.nextInt();
                runners[currentLine].laneNo = fileScanner.nextInt();
                runners[currentLine].time = fileScanner.nextDouble();
                currentLine = currentLine + 1;
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
    }




}
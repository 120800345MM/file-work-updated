import java.util.Scanner;
import java.io.*;

public class WriteToFile {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        
        String fileName = "writeExample.txt";

        File writeFile = new File(fileName);

              if(!writeFile.exists()){
            writeFile.createNewFile();
        }

        FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Please enter your name");
        String name = keyboard.nextLine();

        System.out.println("Please enter a number");
        int number = keyboard.nextInt(); keyboard.nextLine();

        bw.write(name);


        bw.close();
    }
}






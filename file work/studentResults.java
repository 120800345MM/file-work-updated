//parrallel array 

import java.util.Scanner;
import java.io.*;



public class studentResults {
    static final int Results = 50;

    static String [] fName = new String [Results];
    static String [] sName = new String [Results]; 
    static int [] maths   = new int [Results];
    static int [] english = new int [Results];
    static int [] history = new int [Results];
    static int [] science = new int [Results]; 

    static Scanner keyboard = new Scanner(System.in);
      public static void main(String[] args) throws IOException{
      readFromFile();
      int [] total = calculateTotal(maths, english, history, science);
      findMax(total,fName,sName);
      busses(fName,sName,total);
      int counter = totalsOver250(total);
      System.out.println(counter);
      }

      public static int totalsOver250 (int []total) {
        int counterOf250 = 0;

        for (int i = 0; i < Results; i++) {
          int scoreCounter = 0;
          
           if (total[i] > 250){
            counterOf250++;

           }

        }
        return counterOf250;
        
      }
      
      

      public static int [] calculateTotal (int[] maths, int[] english, int[] history, int[] science) {
        int [] total = new int [Results];
        for (int i = 0; i < Results; i++) {
          total[i] = (maths[i] + english[i] + history[i] + science[i]);
    
        } 
        return total;

      } 

      public static void findMax(int [] allStudentsScore,String [] forename ,String [] surname ){
        int highScore = allStudentsScore[0];
        int pos = 0;
        for (int i = 1; i < Results; i++) {
          if (allStudentsScore[i] > highScore){
            highScore = allStudentsScore[i];
            pos = i;
          }
      }
      System.out.println("the highscoring student was " + forename[pos] + " " + surname[pos] + " with a score of " + highScore);
 
    }
      public static void readFromFile () throws IOException{
      String fileName = "studentResults.csv";
      
      Scanner fileScanner = new Scanner (new BufferedReader (new FileReader(fileName)));
      
      fileScanner.useDelimiter("[\\r\\n,]+");

      for(int currentline = 0; currentline < Results; currentline ++) {
        
        fName[currentline] = fileScanner.next();
        sName[currentline] = fileScanner.next();
        maths[currentline] = fileScanner.nextInt();
        english[currentline] = fileScanner.nextInt();
        history[currentline] = fileScanner.nextInt();
        science[currentline] = fileScanner.nextInt();
      }

    }
      public static void busses(String [] foreName,String [] surName, int [] total)throws IOException {
       String fileName = "busses.csv";



        File writeFile = new File(fileName);

              if(!writeFile.exists()){
            writeFile.createNewFile();
        }

        FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 1; i < Results; i++) {
          if (total[i] % 2 == 0) {
            bw.write (foreName[i] + "," + surName[i] +",EVEN");
            bw.newLine();
          }

          else {
            bw.write (foreName[i] + "," + surName[i] +",ODD");
            bw.newLine();
          }

    }
    bw.close();
  }
}


//MY NAME IS MICHAEL AND IM AMAZING IM GOING TO DO THIS SO WELL! NO BODY CAN COME CLOSE TO MY CODING SKILLS EXCEPT SMALL MOUTH SAM HES PRETTY GOOD I WILL DO THIS PEREFECTLY LIKE LITTLE TIMMY DID ME. GOT A BIT OF TOPIC THERE ANYWAY BACK TO THE MAIN THING IN LINE IM GOING TO DO AMAZING AT THIS NOW WHISH ME LUCK OH WAIT I DON'T NEED LUCK IM MICHY MICHY MOO MOO THE LEDGENDE 27
import java.util.Scanner;
import java.io.*;

public class writeTask2 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        
        int [] numbers = {17, 9, 23, 4, 3, 2, 5, 6, 7, 7, 13, 100, 12};
        String [] names = {"James" , "Tom", "Cameron", "Zoe", "Mia", "Robyn", "Alexander", "Euan", "Andrew", "Cameron"};
        count7s(numbers);
        displayAndFindMaxNum(numbers);
        displayAndFindMinNum(numbers);
        nameChecker(names);
    }

// Find and write the highest number to a file
            // 1. Max = numbers[0]
            
            // 2. fixed loop for index 1 to lenfth of numbers start
            // 3.   if (max < numbers[index]) then
            // 4.       max = numbers[index]
            // 5.   end if 
            // 6. end loop
            // 7. write the maximum value is & max to file


        public static void displayAndFindMaxNum (int [] numbers)throws IOException {
        String fileName = "moo";
            File writeFile = new File(fileName);

         

              if(!writeFile.exists()){
            writeFile.createNewFile();
        }

        FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        

        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i]; 
            }
        }
        bw.write(""+maxNum);
 
        bw.close();
        }

        // Find and write the position of the lowest number to file
            // 1. minPos = 0
            // 2. fixed loop for index 1 to lenfth of numbers start
            // 3.   if (numbers[minPos] > numbers[index]) then
            // 4.       minPos = index
            // 5.   end if 
            // 6. end loop
            // 7. write the minimum value is at & minPos to file

            public static void displayAndFindMinNum (int [] numbers)throws IOException {
                
                String fileName = "baa.txt";
                File writeFile = new File(fileName);
    
             
    
                  if(!writeFile.exists()){
                writeFile.createNewFile();
            }
    
            FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
        
                int minNum = numbers[0];
                int position =0;

                for (int i = 1; i > numbers.length; i++) {
                    if (minNum > numbers[i]) {
                        minNum = numbers[i]; 
                        if (numbers[position] > numbers[i]) 
                        position = i;
                        
                        
                    }
                }
                bw.write("The min number is "+minNum +" the position of the min number is "+ position);
         
                bw.close();
            }    
        
        // Find and write the number of 7s in the array to file
            // 1. count = 0
            // 2. fixed loop for index 0 to lenth of numbers start
            // 3.   if (numbers[index] == 7) then
            // 4.       count = count + 1
            // 5.   end if 
            // 6. end loop
            // 7. write the number of 7s & count to file        
        
            public static void count7s (int [] numbers) throws IOException{
                String fileName = "cluck.txt";
                File writeFile = new File(fileName);
    
             
    
                  if(!writeFile.exists()){
                writeFile.createNewFile();
            }
    
            FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

                int counter = 0;
                for (int index = 1; index < numbers.length; index++){
                    if(numbers[index] == 7) {
                        counter++;
                    }
                }
                bw.write("sevens appered = "+ counter + " times");
                bw.close();
                
                
                
            }
              
            
        // Get a name from the keyboard and write if it is in the list of names to the file
            // 1. name = STRING from keyboard
            // 2. found BOOLEAN initially false
            // 3. fixed loop for index 0 to lenth of names start
            // 4.   if (names[index].equals(name)) then
            // 5.       found = true
            // 6.   end if 
            // 7. end loop
            // 8. if (found = true)
            // 9.   write the person & name & is in the list
            //10. else
            //11.   write the person & name & is not in the list
      
            //12. end if

            public static void nameChecker (String [] names) throws IOException{
                String fileName = "cluck.txt";
                File writeFile = new File(fileName);

                  if(!writeFile.exists()){
                writeFile.createNewFile();
            }

            FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("entername");
            String name = keyboard.nextLine();
            boolean found = false;

            for (int index = 1; index < names.length; index++){
                if (name.equals(name)){
                    found = true; 
                }
            }

            if (found == true ){
                bw.write("" + name + " is in the array");
            }
             
            else {
                bw.write("" + name + " is not in the array") ;
            }
            bw.close();
    
        }
    }

        

        
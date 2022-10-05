import java.io.*;
import java.util.*;
public class S_S_Scoreboard{
    public static void main(String [] args)
    {
     Scanner fileInput;
     try {
         fileInput=new Scanner(new File("submissions.txt"));
     } catch (FileNotFoundException ex ) {
         System.out.println("An error has occurred: "+ex.getMessage());
         return;
     }
     String line="";
     while (fileInput.hasNextLine())
     {
     line= fileInput.nextLine();
     if(line.isEmpty())
     {
         continue;
     }
     System.out.println(line);
     }
    }
}
//  class S_S_ScoreboardMethods{
//      static boolean DataCheck(){

//      }
//  }
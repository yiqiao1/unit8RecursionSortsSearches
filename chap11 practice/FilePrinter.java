import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a description of class FilePrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FilePrinter
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int numChar = 0;
        int numWords = 0;
        int numLines = 0;
        
        Scanner ask = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String answer = ask.next();
        
        File inputFile = new File(answer);
        Scanner in = new Scanner(inputFile);
        
        in.useDelimiter(" ");
        while (in.hasNext())
        {
            numChar++;
        }
        
        in.useDelimiter("[^A-Za-z]+");
        while (in.hasNext())
        {
            numWords++;
        }
        
        while (in.hasNextLine())
        {
            numLines++;
        }
        
    }
}

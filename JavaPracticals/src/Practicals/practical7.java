package Practicals;
import java.io.*;
public class practical7 {
    public static void main(String[] args) {
        int charCount = 0, wordCount = 0, lineCount = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Practicals/Sample.txt"));
            String currentLine = br.readLine();
            while(currentLine != null){
                lineCount++;
                String[] words= currentLine.split(" ");
                wordCount = wordCount + words.length;
                for(String word: words){
                    charCount = charCount + word.length();
                }
                currentLine = br.readLine();
            }
            System.out.println("Number of line in file: "+lineCount);
            System.out.println("Number of words in file: "+wordCount);
            System.out.println("Number of characters in file: "+charCount);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
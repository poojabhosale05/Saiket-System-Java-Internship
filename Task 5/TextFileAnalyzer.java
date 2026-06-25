import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {

        try {

            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            String searchWord = "Java";
            int searchCount = 0;

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                lineCount++;

                charCount += line.length();

                String[] words = line.split("\\s+");

                wordCount += words.length;

                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        searchCount++;
                    }
                }
            }

            sc.close();

            System.out.println("===== Text File Analyzer =====");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
            System.out.println("'" + searchWord + "' found " + searchCount + " times.");

        } catch (FileNotFoundException e) {

            System.out.println("File not found!");

        }
    }
}
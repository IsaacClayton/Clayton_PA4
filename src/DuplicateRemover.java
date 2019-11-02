import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DuplicateRemover
{
    ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));
        String line = reader.readLine();
        while(line != null)
        {
            String temp[] = line.split(" ");
            for(String i:temp)
            {
                if(!uniqueWords.contains(i))   uniqueWords.add(i);
            }
            line = reader.readLine();
        }

        reader.close();
    }

    public void write(String outputFile) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(outputFile);
        for(String i:uniqueWords)
        {
            writer.print(i + " ");
        }
        writer.close();
    }
}
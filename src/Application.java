import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
        System.out.println("Duplicates have been removed!");

        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count("problem2.txt");
        duplicateCounter.write("unique_word_counts.txt");
        System.out.println("Duplicates have been counted!");
    }
}

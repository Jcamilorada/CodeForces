import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Template File for solutions.
 *
 * @author Juan Rada
 */
public class Template
{
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String readln() throws IOException
    {
        String line = input.readLine();
        return line;
    }

    public static void main(String[] args) throws IOException
    {
        Locale.setDefault(Locale.US);
        String input = Template.readln();

        solution(input);
    }

    public static void solution(String input)
    {

    }
}


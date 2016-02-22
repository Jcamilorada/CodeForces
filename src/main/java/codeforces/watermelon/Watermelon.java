package codeforces.watermelon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author Juan Rada
 */
public class Watermelon
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
        int input = Integer.parseInt(Watermelon.readln());

        solution(input);
    }

    public static void solution(int input)
    {
        if (input > 2 && input % 2 == 0)
        {
            System.out.println("YES");
        }

        else
        {
            System.out.println("NO");
        }
    }
}

package codeforces.way_too_long_words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Solution to Way Too Long Words exercises. http://codeforces.com/problemset/problem/71/A
 *
 * @author Juan Rada
 */
public class TooLong
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
        int words = Integer.parseInt(TooLong.readln());

        String[] wordsArray = new String[words];
        for (int i = 0; i< words; i++)
        {
            wordsArray[i] = TooLong.readln();
        }

        solution(wordsArray);
    }

    public static void solution(String[] wordsArray)
    {
        for(String word : wordsArray)
        {
            int wordLenght = word.length();
            String formattedWord = word;

            if (wordLenght > 10)
            {
                formattedWord = String.format("%s%d%s", word.charAt(0), wordLenght -2, word.charAt(wordLenght - 1));
            }

            System.out.println(formattedWord);
        }
    }
}

package codeforces.r_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 *
 * Solution for R-Game problem http://codeforces.com/problemset/problem/630/R
 *
 * @author Juan Rada
 */
public class RGame
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
        long size = Long.parseLong(RGame.readln());

        solution(size);
    }

    public static void solution(long size)
    {
        boolean isEvenSize =  size % 2 == 0;
        long oddLine = isEvenSize ? (size / 2) : (size / 2) + 1;
        long evenLine = size - oddLine;

        long totalCells = (size / 2) * (oddLine + evenLine);
        totalCells = isEvenSize ? totalCells : totalCells + oddLine;

        if (totalCells % 2 == 0)
        {
            System.out.println("2");
        }

        else
        {
            System.out.println("1");
        }
    }
}

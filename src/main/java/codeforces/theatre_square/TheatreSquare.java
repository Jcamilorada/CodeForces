package codeforces.theatre_square;

import java.io.*;
import java.util.*;

/**
 * Solution for exercise Theatre Square http://codeforces.com/problemset/problem/1/A
 *
 * @author Juan Rada
 */
public class TheatreSquare
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
        String[] input = TheatreSquare.readln().split(" ");

        long n = Integer.valueOf(input[0]);
        long m = Integer.valueOf(input[1]);
        long a = Integer.valueOf(input[2]);

        solution(n, m, a);
    }

    public static void solution(long n, long m, long a)
    {
        long hFlagstones = n / a;
        if (n % a > 0) hFlagstones ++;

        long vFlagstones = m / a;
        if (m % a > 0) vFlagstones ++;

        long total =  orOne(hFlagstones) * orOne(vFlagstones);
        System.out.println(total);
    }

    private static long orOne(long num)
    {
        return num == 0 ? 1 : num;
    }
}

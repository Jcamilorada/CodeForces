package codeforces.amr_and_music;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Soluction for Amr and Music problem. http://codeforces.com/problemset/problem/507/A
 *
 * @author Juan Rada
 */
public class ArmMusic
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
        String[] input = ArmMusic.readln().split(" ");
        String[] learningDays = ArmMusic.readln().split(" ");

        int instruments =  Integer.parseInt(input[0]);
        int days = Integer.parseInt(input[1]);

        int[] learningDaysArray = new int[instruments];
        for (int i =0; i < instruments; i++)
        {
            learningDaysArray[i] = Integer.parseInt(learningDays[i]);
        }

        solution(learningDaysArray, days);
    }

    public static void solution(int[] learningDaysArray, int days)
    {
        List<Pair> pairs = getOrderedPairsList(learningDaysArray);
        int listSize = pairs.size();

        int instruments = 0;
        StringBuilder builder = new StringBuilder();
        for (Pair pair : pairs)
        {
            if (pair.value > days)
            {
                break;
            }

            days = days - pair.value;
            instruments ++;
            builder.append(pair.index);
            builder.append(" ");
        }

        System.out.println(instruments);
        System.out.println(builder.toString());

    }

    private static List<Pair> getOrderedPairsList(final int[] learningDaysArray)
    {
        List<Pair> pairs = new ArrayList<>(learningDaysArray.length);

        int i = 1;
        for(int value : learningDaysArray)
        {
            pairs.add(new Pair(value, i++));
        }

        Collections.sort(pairs);
        return pairs;
    }

    public static class Pair implements Comparable<Pair>
    {
        public int value;
        private int index;

        Pair(int value, int index)
        {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(final Pair pair)
        {
            return Integer.compare(this.value, pair.value);
        }
    }
}

package table_bowling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Solution for table bowling problem. http://codeforces.com/problemset/problem/64/H
 *
 * @author Juan Rada
 */
public class TableBowling
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
        int scores = Integer.parseInt(TableBowling.readln());
        Score[] scoresArray = new Score[scores];

        for(int i = 0; i < scores; i++)
        {
            String[] line = input.readLine().split(" ");
            scoresArray[i] = new Score(line[0], Integer.parseInt(line[1]));
        }

        solution(scoresArray);
    }

    public static void solution(Score[] scoresArray)
    {
        Arrays.sort(scoresArray, Collections.reverseOrder());
        Map<Integer, Integer> positionsMaps = getPositionsMap(scoresArray);

        int position = 1;
        int lastScore = scoresArray[0].score;
        for (Score score: scoresArray)
        {
            if (lastScore != score.score) position ++;
            lastScore = score.score;

            int times = positionsMaps.get(score.score);
            String positionString = getPositionString(position, times);

            System.out.println(String.format("%s %s",  positionString, score.name));
        }
    }

    private static String getPositionString(final int position, final int times)
    {
        String positionString = String.format("%s", position);
        if (times > 1)
        {
            positionString = String.format("%s-%s", position, position + times - 1);
        }
        return positionString;
    }

    private static Map<Integer, Integer> getPositionsMap(final Score[] scoresArray)
    {
        Map<Integer, Integer> positionsMap = new HashMap<>();

        for (Score score: scoresArray)
        {
            if (positionsMap.containsKey(score.score))
            {
                positionsMap.put(score.score, positionsMap.get(score.score) +1);
            }

            else
            {
                positionsMap.put(score.score, 1);
            }
        }

        return positionsMap;
    }

    public static class Score implements Comparable<Score>
    {
        public int score;
        public String name;

        public Score(String name, int score)
        {
            this.score = score;
            this.name = name;
        }

        @Override
        public int compareTo(final Score o)
        {
            return Integer.compare(this.score, o.score);
        }
    }
}

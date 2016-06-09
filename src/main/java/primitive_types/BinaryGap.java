package primitive_types;

/**
 * Binary gap problem solution.
 *
 * @author Juan Rada
 */
public class BinaryGap
{
    public int solution(int N)
    {
        String binary = Integer.toBinaryString(N);

        int binaryGap = 0;
        int currentBinaryGap = 0;
        boolean startCounting = false;

        for (String b :binary.split(""))
        {
            if (b.equalsIgnoreCase("1"))
            {
                startCounting = true;
                binaryGap = currentBinaryGap > binaryGap ? currentBinaryGap : binaryGap;
                currentBinaryGap = 0;
            }
            else if (startCounting)
            {
                currentBinaryGap ++;
            }
        }

        return binaryGap;
    }

    public int solution2(int N)
    {
        int binaryGap = 0;
        int currentBinaryGap = 0;
        boolean startCounting = false;
        while (N > 0)
        {
            if ((N & 1) == 1)
            {
                startCounting = true;
                binaryGap = currentBinaryGap > binaryGap ? currentBinaryGap : binaryGap;
                currentBinaryGap = 0;
            }
            else if (startCounting)
            {
                currentBinaryGap ++;
            }

            N = N >> 1;
        }

        return binaryGap;
    }
}

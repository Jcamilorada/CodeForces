import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < iterations ; i++)
        {
            int digits = Integer.parseInt(sc.nextLine());

            if (digits < 3)
            {
                System.out.println("-1");
                continue;
            }

            StringBuilder builder = new StringBuilder(digits);
            int fives = 0;
            while(digits >= 3)
            {
                if (digits % 5 < digits % 3)
                {
                    builder.append(33333);
                    digits -= 5;
                }

                else
                {
                    builder.insert(0, 555);
                    digits -= 3;
                }
            }

            System.out.println(builder.toString());
        }
    }
}

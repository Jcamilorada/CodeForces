package codeforces.registration_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Solution for registrarion system problem. http://codeforces.com/problemset/problem/4/C
 *
 * @author Juan Rada
 */
public class RegistrationSystem
{
    private static final String OK = "OK";

    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String readln() throws IOException
    {
        String line = input.readLine();
        return line;
    }

    public static void main(String[] args) throws IOException
    {
        Locale.setDefault(Locale.US);
        int userAttemps = Integer.parseInt(RegistrationSystem.readln());

        String[] userNames = new String[userAttemps];
        for (int i =0; i < userAttemps; i ++)
        {
            userNames[i] = RegistrationSystem.readln();
        }
        solution(userNames);
    }

    public static void solution(String[] userNames)
    {
        Map<String, Integer> db = new HashMap<>(userNames.length);

        for(String user : userNames)
        {
            int times = 1;

            if (db.containsKey(user))
            {
                times = db.get(user);
                System.out.println(user.concat(String.valueOf(times ++)));
            }

            else
            {
                System.out.println(OK);
            }

            db.put(user, times);
        }
    }
}

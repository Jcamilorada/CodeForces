package primitive_types;

/**
 *  Check if an integer is a panlindrome.
 */
public class Palindrome
{
    public static boolean isPalindrome(int value)
    {
        char[] charArray = String.valueOf(value).toCharArray();
        boolean isPalindrome = true;

        int limit = charArray.length / 2;
        for(int i =0; i < limit; i ++)
        {
            if (charArray[i] != charArray[(charArray.length -1) - i])
            {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}

package algorithms;

public class MyMath
{
    public static boolean isPrime(int num)
    {
        boolean prime = true;

        if(num < 2)
        {
            return false;
        }
        else if(num == 2)
        {
            return true;
        }
        else
        {
            for(int factor = 2; factor * factor <= num; factor++)
            {
                if(num % 2 == 0)
                {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }
}


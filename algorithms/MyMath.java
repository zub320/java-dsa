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

    public static void DisplayFactors(int num)
    {
        int factor = 1;

        while (factor < num)
        {
            if(num % factor == 0)
            {
                System.out.print(factor + ", ");
            }

            factor ++;
        }

        System.out.print(num + "\n");
    }

    public static int Factorial(int num)
    {
        int result = 1;

        if (num < 0)
        {
            System.out.println("Error: Cannot compute factorial for a negative number!");
            return -1;
        }
        else if (num == 0)
        {
            return 1;
        }
        else
        {
            while (num > 1)
            {
                result = result * num;
                num--;
            }
        }

        return result;
    }
}
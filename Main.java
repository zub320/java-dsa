import java.util.*;

import javax.lang.model.util.ElementScanner14;

import algorithms.MyMath;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());

        if (MyMath.isPrime(num))
        {
            System.out.println(num + " is a prime number!");
        }
        else
        {
            System.out.println(num + " is not a prime number!");
        }
        
    }
}
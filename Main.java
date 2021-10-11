import java.util.*;

import algorithms.MyMath;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.print("The prime factors of " + num +  " are: ");
        MyMath.DisplayPrimeFactors(num);
    }
}
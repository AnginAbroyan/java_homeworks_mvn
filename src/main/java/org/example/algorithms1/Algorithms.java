package org.example.algorithms1;
import java.util.Scanner;
import java.util.Random;

public class Algorithms {
    Scanner myScanner = new Scanner(System.in);

    /**
     * ricePack method calculates if it's possible to get n quantity of rice, by having only 5kg*y and
     * kg*x bags of rices.
     * @param smallBag is the number of 1kg rice bags.
     * @param bigBag is the number of 5kg rice bags.
     * @return true if it's possible to get n quantity of rice with smallBag and bigBag.
     *
     * O(1) complexity
     */
    public boolean ricePack(int smallBag, int bigBag, int goal) {
        if (smallBag < 0 || bigBag < 0 || goal < 0) {
            return false;
        }
        int x = smallBag;
        int y = bigBag * 5;
        if (x + y == goal || (x + y > goal && y < goal))
            return true;
        else
            return false;

    }

    /**
     * largestPrimeFactor method calculates the largest prime factor of a given number.
     * @return the largest prime factor of the given number.
     *
     * O(N) complexity
     */
    public long largestPrimeFactor() {
        System.out.println("Please enter the number: ");
        long number = myScanner.nextInt();
        long largestPrime = -5;


        if (number % 2 == 0) {
            largestPrime = 2;
            while (number % 2 == 0) {
                number = number / 2;
            }
        }
        for (long i = 3; i*i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number = number / i;
            }
        }

        if (number > 2)
            largestPrime = number;

        return largestPrime;
    }

    /**
     * odd_even method prints out odd if a random number between 1 and 100 is odd, otherwise it prints even.
     *
     * O(1) complexity
     */
    void odd_even() {
        Random rand = new Random();
        int rand_numb = rand.nextInt(1, 100);
        System.out.println("The random number between 1 to 100 is: " + rand_numb);
        if (rand_numb == 0)
            System.out.println("0 is neither odd nor even");
        else if (rand_numb % 2 == 0)
            System.out.println("The given number is even.");
        else
            System.out.println("The given number is odd.");

    }

    /**
     * max_min_Rand method return the largest and the smallest random numbers between  and 100.
     * O(1) complexity
     */
    public void max_min_Rand() {
        Random rand = new Random();
        int count = 1;
        int maxNumb = 1;
        int minNumb = 100;
        while (count < 11) {
            int randNumb = rand.nextInt(1, 100);
            if (randNumb < minNumb)
                minNumb = randNumb;
            if (randNumb > maxNumb)
                maxNumb = randNumb;
            count++;
            System.out.print(randNumb + " ");
        }
        System.out.println("\nThe largest random between numbers is: " + maxNumb);
        System.out.println("The smallest random between numbers is: " + minNumb);
    }
}


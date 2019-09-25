package sample;

import java.io.*;
import java.util.*;

public class Prob2 {
    
    //checks whether an int is prime or not.
    private static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n == 1 || n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int max = scan.nextInt();
        ArrayList<Integer> primes = new ArrayList(max-min);
        for (int i = min; i <= max; ++i){
            if (isPrime(i)){
                primes.add(i);
            }
        }
        
        int count = 0;
        for (int i = 0; i < primes.size()-1; ++i){
            int first = primes.get(i);
            int second = primes.get(i+1);
            if (second - first == 2){
                ++count;
            }
        }
        System.out.println(count);
        
    }
}
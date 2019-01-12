//https://practice.geeksforgeeks.org/problems/largest-prime-factor/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int largestPrime(int n){
        int maxPrime=-1;
        while(n%2==0){
            maxPrime=2;
            n >>= 1;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                maxPrime=i;
                n=n/i;
            }
        }
        if(n>2) maxPrime=n;
        return maxPrime;
     }
	public static void main (String[] args)
	 {
     //code
     Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int n=Integer.parseInt(sc.nextLine());
            System.out.println(largestPrime(n));
            t--;
        }
     }
     
}
//https://practice.geeksforgeeks.org/problems/armstrong-numbers/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int tmp=n;
            int n=Integer.parseInt(sc.nextLine());
            int a=n/100;
            n=n%100;
            int b=n/10;
            n=n%10;
            if((a*a*a+b*b*b+n*n*n)==tmp)
                sb.append("Yes");
            else
                sb.append("No");
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}
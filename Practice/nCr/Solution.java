//https://practice.geeksforgeeks.org/problems/ncr/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int mod=1000000007;

    static int comb(int n , int r)
	{
		int arr[]=new int[r+1];
        arr[0]=1;
        for(int i=1;i<=n;++i)
        {
         //Min is performed so that it won't go more than r (array range)
            for(int j=Math.min(i,r);j>0;--j)
            {
//add previous values
                arr[j]=(arr[j]+arr[j-1])%1000000007;
            }
        }
        return arr[r];
	}
	
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String[] s=sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int r=Integer.parseInt(s[1]);
            System.out.println(comb(n,r));
            t--;
        }
    }
}
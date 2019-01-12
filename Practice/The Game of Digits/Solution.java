//https://practice.geeksforgeeks.org/contest-problem/the-game-of-digits1904/0/

import java.math.BigInteger;
import java.util.*;

class SeriesGP {

    static long findMin(long x){
        if(x<10){
            return x;
        }
        
        List<Long> factors = new ArrayList<>();
        long min=Long.MAX_VALUE;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                long tmp=Long.parseLong(i+""+(x/i));
                //System.out.println("tmp="+tmp);
                if(tmp<min){
                    min=tmp;
                }
                tmp=Long.parseLong((x/i)+""+i);
                //System.out.println("tmp="+tmp);
                if(tmp<min){
                    min=tmp;
                }
            }
        }

        return min;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            long a=Long.parseLong(sc.nextLine());
            long value=findMin(a);
            sb.append(value);
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}



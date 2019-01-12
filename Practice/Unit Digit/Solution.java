//https://practice.geeksforgeeks.org/contest-problem/unit-digit/0/
import java.math.BigInteger;
import java.util.*;

class SeriesGP {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            BigInteger a=new BigInteger(sc.nextLine());
            int value;
            if(a.compareTo(BigInteger.ONE)==0)
                value=1;
            if(a.compareTo(BigInteger.valueOf(2))==0)
                value=2;
            else if(a.compareTo(BigInteger.valueOf(3))==0)
                value=6;
            else if(a.compareTo(BigInteger.valueOf(4))==0)
                value=4;
            else 
                value=0;
            sb.append(value);
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}



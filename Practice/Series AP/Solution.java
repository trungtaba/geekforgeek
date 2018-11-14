//https://practice.geeksforgeeks.org/problems/series-ap/0
import java.util.*;

class SeriesAP {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String[]ab= sc.nextLine().split(" ");
            int a=Integer.parseInt(ab[0]);
            int b=Integer.parseInt(ab[1]);      
            int n=Integer.parseInt(sc.nextLine());
            int value=(b-a)*(n-1)+a;
            sb.append(value);
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}



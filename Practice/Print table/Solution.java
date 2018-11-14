//https://practice.geeksforgeeks.org/problems/print-table/0
import java.util.*;

class PrintPattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<=10;i++){
                sb.append(n*i);
                sb.append(" ");
            }
            System.out.println(sb);

            t--;
        }
    }
}



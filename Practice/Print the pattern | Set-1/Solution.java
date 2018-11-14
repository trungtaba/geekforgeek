//https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1
import java.util.*;

class PrintPattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            GfG g = new GfG();
            g.printPat(n);
            System.out.println();

            t--;
        }
    }
}

/*Please note that it's Function problem i.e.
    you need to write your solution in the form of Function(s) only.
    Driver Code to call/invoke your function is mentioned above.*/
class GfG {

    void printPat(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            int s = n;
            for (int j = 1; j <= n * i; j = j + i) {
                for (int u = 1; u <= i; u++) {
                    sb.append(s);
                    sb.append(" ");
                }
                s = s - 1;
            }
            sb.append("$");
        }
        System.out.print(sb);
    }
}

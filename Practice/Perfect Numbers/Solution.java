
//https://practice.geeksforgeeks.org/problems/perfect-numbers/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static int factors(long x) {
        List<Long> factors = new ArrayList<>();
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                factors.add(i);
                factors.add(x / i);
            }
        }
        int sum = 0;
        for (long i : factors) {
            sum += i;
        }
        if (sum == (2 * x)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long t = Long.parseLong(sc.nextLine());
        while (t > 0) {
            long a = Long.parseLong(sc.nextLine());

            sb.append(factors(a));
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}

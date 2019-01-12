//https://practice.geeksforgeeks.org/problems/jumping-numbers/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static void jumpingNumber(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        for (int i = 1; i <= 9 && i <= n; i++) {
            array.addAll(bfs(n, i));
        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("");
    }

    static ArrayList<Integer> bfs(int n, int num) {
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(num);
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (tmp <= n) {
                result.add(tmp);
                int last_dig = tmp % 10;
                switch (last_dig) {
                    case 0:
                        queue.add((tmp * 10) + (last_dig + 1));
                        break;
                    case 9:
                        queue.add((tmp * 10) + (last_dig - 1));
                        break;
                    default:
                        queue.add((tmp * 10) + (last_dig - 1));
                        queue.add((tmp * 10) + (last_dig + 1));
                        break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int n = Integer.parseInt(sc.nextLine());
            jumpingNumber(n);
            t--;
        }
    }
}

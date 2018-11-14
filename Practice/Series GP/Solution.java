//https://practice.geeksforgeeks.org/problems/series-gp/0
import java.util.*;

class SeriesGP {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String[]ab= sc.nextLine().split(" ");
            double a=Double.parseDouble(ab[0]);
            double b=Double.parseDouble(ab[1]);      
            int n=Integer.parseInt(sc.nextLine());
            int value=(int)Math.floor(a*Math.pow((b/a), n-1));
            sb.append(value);
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}



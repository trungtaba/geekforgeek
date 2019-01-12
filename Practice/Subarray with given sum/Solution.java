//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0

import java.util.*;

class GFG {

    static void subArraySum(int n, long sumArr, long arr[])  
    { 
        //System.out.println("sumArr="+sumArr);
        Map<Long, Integer> map = new HashMap<>();
        map.put(0l, 0);
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=arr[i];
            //System.out.println("sum="+sum);
            if(map.containsKey(sum-sumArr)){
                //System.out.println("map contain key "+(sum-sumArr)+" with value "+map.get(sum-sumArr));
                System.out.println((map.get(sum-sumArr)+1)+" "+i);
                return;
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("-1");
    } 
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String[] str=sc.nextLine().split(" ");
            int N=Integer.parseInt(str[0]);
            long S=Long.parseLong(str[1]);
            
            long[]array=new long[N+1];
            str=sc.nextLine().split(" ");
            for(int i=1;i<=N;i++){
                array[i]=Long.parseLong(str[i-1]);
            }
            subArraySum(N, S, array);
            t--;
        }

    }
}



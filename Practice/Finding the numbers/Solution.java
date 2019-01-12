//https://practice.geeksforgeeks.org/problems/finding-the-numbers/0

import java.util.*;

class GFG {

    static void findingNumber(int n, long arr[])  
    { 
        Map<Long,Integer> map = new HashMap<>();
        for(int i=0;i<2*n+2;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }else{
                map.remove(arr[i]);
            }
        }
        long[]result=new long[map.keySet().size()];
        int index=0;
        for(Long i:map.keySet()){
            result[index++]=i;
        }
        if(result[0]<result[1]){
            System.out.println(result[0]+" "+result[1]);
        }else{
            System.out.println(result[1]+" "+result[0]);
        }
    } 
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int N=Integer.parseInt(sc.nextLine());
            long[]array=new long[2*N+2];
            String[] str=sc.nextLine().split(" ");
            for(int i=0;i<2*N+2;i++){
                array[i]=Long.parseLong(str[i]);
            }
            findingNumber(N, array);
            t--;
        }

    }
}



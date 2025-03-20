package Day1;

import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDifference(int[] arr, int n, int m) {
        if(m==0 || n==0){
            return 0;
        }
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;

        for(int i=0;i+m-1<n;i++){
            int diff = arr[i+m-1] - arr[i];
            mindiff = Math.min(mindiff, diff);
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,12,3,1};
        int n = arr.length;
        int m = 3;
        int result = findMinDifference(arr,n,m);
        System.out.println("Minimum difference: " + result);
    }
    
}

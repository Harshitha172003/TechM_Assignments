package Day1;
import java.util.*;
public class Busybee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        findvalidpairs(arr,n,k);
        sc.close();
    }
    public static void findvalidpairs(int[] arr, int n, int k){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double average = (arr[i] + arr[j])/2.0;
                if(average>=k){
                    System.out.println("("+arr[i]+ "," +arr[j]+")");
                }
            }
        }
    }
    
}

package Day2;
import java.util.Arrays;
public class DutchNationalFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,1,1,1,0,1,0,2,1,2};
		int n=arr.length;
		
		Arrays.sort(arr);
		
		
				for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}

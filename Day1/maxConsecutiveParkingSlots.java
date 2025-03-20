package Day1;
public class maxConsecutiveParkingSlots{
    public static int maxconsecutiveParkingSlots(String arr){
        int maxCount = 0;
        int currentCount = 0;
        for(char ch : arr.toCharArray()){
            if(ch=='S'){
                currentCount++;
                maxCount = Math.max(maxCount,currentCount);
            }else{
                currentCount = 0;
            }
           
        }
        return maxCount;
    }
    public static void main(String[] args){
        String arr = "XXXSSSXXSXXSSXXSXX"; 
        int result = maxconsecutiveParkingSlots(arr);
        System.out.println(result);
    }
}
import java.util.Arrays;
public class QueEight {
     public static int[] shuffle(int[] nums, int n) {
        int[] rev = new int[2*n];
       int j=0;
       for(int i=0;i<rev.length-1;i+=2){
           rev[i]=nums[j++];
           rev[i+1]=nums[n++];
       }
       return rev;
   }
   public static void main(String[] args) {
    int nums []= { 2 , 5 ,1 ,3 , 4 ,7};
    int n= 3;  
    System.out.println(Arrays.toString(shuffle(nums , n ))); 
}
}

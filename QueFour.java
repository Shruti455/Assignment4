public class QueFour {
     public static final int MAX_N = 10000;
    public static int arrayPairSum(int[] nums) {
        int minN = nums[0];
      int maxN = minN;
      int counts[] = new int[2*MAX_N+1];
      
      for (final int n: nums) {
        counts[n + MAX_N]++;
        if (minN > n) {
          minN = n;
        } else if (maxN < n) {
          maxN = n;
        }
      }
      int offset = 0;
      int total = 0;
    
      for (int n = minN; n <= maxN; ++n) {
        int i = n + MAX_N;
        int freq = counts[i];
        
        if (freq > 0) {
          if (freq - offset > 0) {
            total += ((freq + 1 - offset) >> 1) * n;
          }
          counts[i] = 0;
          offset = offset^(freq & 1);
        }
      }
      return total;
        
    }
    public static void main(String[] args) {
        int [] nums = {  1 , 4, 3 , 2 };  
        System.out.println(arrayPairSum(nums)); 
    }
}

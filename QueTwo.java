import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueTwo {
     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
      List<Integer> ans1 = new ArrayList<Integer>();
      List<Integer> ans2 = new ArrayList<Integer>();
      Set<Integer> set1 = new HashSet<Integer>();
      Set<Integer> set2 = new HashSet<Integer>();        
      
      for(int n : nums1) set1.add(n);
      for(int n : nums2) set2.add(n);
      for (int n : set1){
          if(set2.contains(n) == false){
              ans1.add(n);
          }
      }
      for (int n : set2){
          if(set1.contains(n) == false){
              ans2.add(n);
          }
      }
      ans.add(ans1);
      ans.add(ans2);
      return ans;
  }
 
 public static void main(String[] args) {
    int [] nums1 = {  1 , 2, 3 };
    int [] nums2 = {  2 , 4, 6 };   
    System.out.println(findDifference(nums1 , nums2)); 
}
}

import java.util.LinkedList;
import java.util.List;

public class QueOne {
    public  static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> rst = new LinkedList<>();
        int i = arr1.length - 1, j = arr2.length - 1, k = arr3.length - 1;
        
        while (i >= 0 && j >= 0 && k >= 0) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                if (rst.isEmpty() || arr1[i] != rst.get(rst.size() - 1)) rst.add(0, arr1[i]);
                i--;
                j--;
                k--;
            } else if (arr2[j] < arr3[k]) k--; 
            else if (arr1[i] < arr2[j]) j--;
            else i--;
        }
        
        return rst;
    }
    public static void main(String[] args) {
    int arr1 []= { 1 , 2 , 3 , 4 , 5};
    int arr2 []= { 1 , 2 , 5 , 7 , 9}; 
    int arr3 []= { 1 , 3 , 4 , 5 , 8};
    System.out.println(arraysIntersection(arr1 , arr2 , arr3)); 
}
}

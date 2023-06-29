public class QueSeven {
        public static int maxCount(int m, int n, int[][] ops) {
        int k=ops.length;
       for (int i=0;i<k;i++)
       {
           int z=ops[i][0] ,x=ops[i][1];
           n=Math.min(n,x);
           m=Math.min(m,z);
       }
       return (m*n);
   }
   public static void main(String[] args) {
    int m= 3;
    int n= 3;
    int [] [] ops = { { 2 , 2} , {3, 3} };  
    System.out.println(maxCount(m , n , ops)); 
}
}

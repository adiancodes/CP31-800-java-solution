    import java.util.*;
     
    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while( t-- > 0){
                int n = in.nextInt();
                int k = in.nextInt();
                int[] arr = new int[n];
                for(int i = 0 ; i < n ;i++){
                    arr[i] = in.nextInt();
                }
                boolean res = helper(n,k,arr);
                if(res){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
     
        public static boolean helper(int n, int k, int[] arr){
            //sorted check
            if(sorted(arr)){
                return true;
            }
            else{
                if(k<=1){
                    return false;
                }
            }
            return true;
     
        }
     
        public static boolean sorted (int[] arr){
            for(int i = 0 ; i < arr.length-1 ; i++){
                if(arr[i] > arr[i+1]){
                    return false;
                }
            }
            return true;
        }
    }

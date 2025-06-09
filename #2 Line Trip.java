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
            int res = helper(n,k,arr);
            System.out.println(res);
        }
    }

    public static int helper(int n, int k, int[] arr){

        int[] nums = new int[2*n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = arr[i];
        }
        int j = n-1;
        for(int i = n ; i < nums.length ; i++){
            nums[i] = (2*k) - nums[j];
            j--;
        }
        int dist = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            dist = Math.max(dist, nums[i] - nums[i-1]);
        }
        return dist;

    }
}

package StriverssdeSheet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arrays3 {
    public static boolean searchMatrix(int martix[][],int target){
        int i=martix.length-1;
        int j=0;
        while(i>=0 && j<martix[0].length){
            //checking for row of target
            if(martix[i][j]<target){
                //go right
                j++;
            }else if(martix[i][j]>target){
                //go up
                i--;
            }else{
                //found
                return true;
            }
        }
        return false;
    }
    public static double mypow(Double x,int n){
        return (Math.pow(x, n));
    }
    public static int majorityElement(int nums[]){
        Arrays.sort(nums);
        return  nums[nums.length/2+1];
    }
    public static List<Integer> majorityElement2(int[] nums) {
        int freq = (nums.length/3);
        List<Integer> ans = new LinkedList<>();
        Arrays.sort(nums);
        int i=0;int j=0;
        while(i<nums.length){
            int count=1;
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            if(count>freq){
                ans.add(nums[i]);
            }
            i++;
        }
        return ans;
    }
    public static int uniquePaths(int m, int n) {
        if(n==1 || m==1){
            return 1;
        }
        m--;
        n--;
       //setting m as max 
       if(n>m){
        m = m+n;
        n = m -n;
        m = m-n;
       }
        long ans =1;
        int j =1;
        //calutating factorial in another method (m+n)!/(m!*n!)
        for(int i=m+1;i<=m+n;i++,j++){
            ans *= i;
            ans /= j;
        }
        return (int)(ans);
    }

    public static int reversePairs(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
                long a = nums[i];
                long b = nums[j];
                if(a>2*b){
                    System.out.println(nums[i]+"   "+nums[j]+" "+i+" "+j);
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String args[]){
        int martix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        //System.out.println(searchMatrix(martix, 3));
        // Double x=2.00000; int n=10;
        // System.out.println(mypow(x, n));
        // Double a = 12.00000;
        // int b =5;
        // System.out.println(a);
        int arr[] = {1};
        //System.out.println(majorityElement2(arr));
        //System.out.println(uniquePaths(10, 10));
        // [2147483647,2147483647,2147483647,2147483647,2147483647,2147483647]
        int nums[] = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(nums));
    }
}

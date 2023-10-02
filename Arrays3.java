package StriverssdeSheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
        //fast expo by converting power into binary
        long a = n;
        int flag =0;
        if(a<0){
            a =Math.abs(a);
            flag++;
        }
        double ans =1;
        while(a>0){
            if((a&1)!=0){
                ans = ans*x;
            }
            x = x*x;
            a = a>>1;
        }
        if(flag>0){
            return 1/ans;
        }else{
            return ans;
        }  
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
    public static int uniquePaths(int m, int a) {
        if(a==1 || m==1){
            return 1;
        }
        m--;
        a--;
       //setting m as max 
       if(a>m){
        m = m+a;
        a = m -a;
        m = m-a;
       }
        long ans =1;
        int j =1;
        //calutating factorial in another method (m+a)!/(m!*a!)
        for(int i=m+1;i<=m+a;i++,j++){
            ans *= i;
            ans /= j;
        }
        return (int)(ans);
    }
    static int ans =0;
    public static int reversePairs(int[] nums) {
        
        return ans;
    }
    public static void utilreversepairs(int sei,int fei,int nums[],int fsi,int ssi){
        if(ssi==nums.length-1){
            long a = nums[fsi];
            long b = nums[ssi];
            if(a>2*b){
                ans++;
            }
            return;
        }
        Arrays.sort(nums,ssi,sei);
        Collections.reverse(Arrays.asList(nums));
        //now as the array is reversed starting indexes and end indexes are also reversed 
        
        
    }
      public int reversepairs(int[] nums) {
        HashMap<Integer,Long> hm = new HashMap<>();
        int n=nums.length;
        for(int i=1;i<n;i++){
            long num = 2*nums[i];
            hm.put(i,num);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            int x = nums[i];
            for(long y:hm.values()){
                if(x>y){

                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int martix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        //System.out.println(searchMatrix(martix, 3));
        // Double x=2.00000; int a=10;
        // System.out.println(mypow(x, a));
        // Double a = 12.00000;
        // int b =5;
        // System.out.println(a);
        int arr[] = {1};
        //System.out.println(majorityElement2(arr));
        //System.out.println(uniquePaths(10, 10));
        // [2147483647,2147483647,2147483647,2147483647,2147483647,2147483647]
        int nums[] = {2,3,4,5,1};
        //System.out.println(reversePairs(nums));
        //System.out.println(reversePairs(nums));
        //System.out.println(5/2);
       // System.out.println(mypow(2.0000,-2147483648));
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(11, 1);
        hm.put(12, 2);
        System.out.println(hm.entrySet());
        
    }
}

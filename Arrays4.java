package StriverssdeSheet;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Arrays4 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int component = target - nums[i];
            if(map.containsKey(component)){
                return new int[]{map.get(component),i};
            }else{
                map.put(nums[i], i);
            }    
        }
        /*outer:
        for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                        if(nums[i]+nums[j]==target){
                        arr[0] = i;
                        arr[1] = j;
                        break outer;
                    }
                }
            
        } */
        return new int[]{};
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        int i=-1;
        for(int a=0;a<nums.length-3;a++){
            for(int b=a+1;b<nums.length-2;b++){
                for(int c=b+1;c<nums.length-1;c++){
                    for(int d = c+1;d<nums.length;d++){
                        if((nums[a]+nums[b]+nums[c]+nums[d])==target){
                            List<Integer> l = new LinkedList<>();
                            l.add(nums[a]);l.add(nums[b]);l.add(nums[c]);l.add(nums[d]);
                            Collections.sort(l);
                            if(ans.contains(l)){
                                    continue;
                                }else{
                                    ans.add(l); i++;
                                }  
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res=0;
        for(int n : nums){
            if(!hm.containsKey(n)){
                int left = hm.containsKey(n-1)?hm.get(n-1):0;
                int right = hm.containsKey(n+1)?hm.get(n+1):0;

                int sum = left+right+1;
                hm.put(n, sum);
                res = Math.max(res,sum);

                hm.put(n-left,sum);
                hm.put(n+right, sum);
            }else{
                continue;
            }
        }
        return res;
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxlength=0;
        int length=0;int k=0;
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                length++;
                hm.put(s.charAt(i),i+1);
                if(length>maxlength){
                    maxlength = length;
                }
            }else{
                int n = hm.get(s.charAt(i));
                System.out.println(hm+" "+length+" "+n);
                for(int j=k;j<n;j++){
                    hm.remove(s.charAt(j));
                    System.out.println(hm);
                    k++;
                }
                length = hm.size();
                hm.put(s.charAt(i),i+1);
                length++;
                System.out.println(hm+"|"+length);
            }
        }
        System.out.println(length);
        if(length>maxlength){
            maxlength = length;
        }
        if(maxlength<hm.size()){
            maxlength = hm.size();
        }
       return maxlength;

    }   

    public static void main(String[] args) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        int ans[] = new int[2];
       // ans = twoSum(nums, 9);
        //System.out.println(ans[0]+" "+ans[1]);
       // fourSum(nums, 4);
      // System.out.println(longestConsecutive(nums));
       String s = "abcadefbhi";
       System.out.println(lengthOfLongestSubstring(s));
       
    }
}

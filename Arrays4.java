package StriverssdeSheet;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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

    public static void main(String[] args) {
        int nums[] = {-5,5,4,-3,0,0,4,-2};
        int ans[] = new int[2];
       // ans = twoSum(nums, 9);
        //System.out.println(ans[0]+" "+ans[1]);
        fourSum(nums, 4);
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new LinkedList<>();
        a.add(1);b.add(3);
        a.add(2);b.add(4);
        a.add(3);b.add(1);
        a.add(4);b.add(2);
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a+" "+b);
        if(a==b){
            System.out.println("hii");
        }
    }
}
/*
 * for(int a=0;a<nums.length-3;a++){
            for(int b=a+1;b<nums.length-2;b++){
                if(nums[a]==nums[b]){
                    continue;
                }else{
                    for(int c=b+1;c<nums.length-1;c++){
                        if(nums[b]==nums[b] || nums[b]==nums[b]){
                            continue;
                        }else{
                            for(int d = c+1;d<nums.length;d++){
                                if(nums[c]==nums[d] || nums[d]==nums[a] || nums[d]==nums[b]){
                                    continue;
                                }else{
                                    if(((nums[a]+nums[b]+nums[c]+nums[d])==target)){
                                        List<Integer> l = new LinkedList<>();
                                        l.add(nums[a]);l.add(nums[b]);l.add(nums[c]);l.add(nums[d]);
                                        ans.add(l);
                                    }
                                }
                                
                            }
                        }
                        
                    }
                }
                
            }
        }
 */

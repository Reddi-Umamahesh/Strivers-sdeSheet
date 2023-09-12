package StriverssdeSheet;

import java.util.ArrayList;
import java.util.List;

public class Arrays1 {
        
    public static void setZeroes(int matrix[][]){
        ArrayList<Integer> ar = new ArrayList<>();
       ArrayList<Integer> ar2 = new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0){
                   ar.add(i);
                   ar2.add(j);
               }
           }
       }
       for(int i=0;i<ar.size();i++){
           for(int j=0;j<matrix[0].length;j++){
               matrix[ar.get(i)][j]=0;
           }
       }
       for(int i=0;i<ar2.size();i++){
           for(int j=0;j<matrix.length;j++){
               matrix[j][ar2.get(i)] = 0;
           }
       }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
           }System.out.println();
       }
   } 
   public static void pascalstriangle(int n){
       List<List<Integer>> l = new ArrayList<>();
       
       int arr[][] = new int[30][30];
       for(int i=0;i<30;i++){
           for(int j=0;j<30;j++){
               arr[i][j] = 0;
           }
       }
       arr[0][0]=1;
       for(int i=1;i<n;i++){
           arr[i][0] =1;
           for(int j=1;j<=i;j++){
               arr[i][j]= arr[i-1][j-1]+arr[i-1][j];
           }
       }
       for(int i=0;i<n;i++){
           List<Integer> l1 = new ArrayList<>();
           for(int j=0;j<=i;j++){
               
               l1.add(arr[i][j]);
               
           }
           
           l.add(l1);
       }
       
       System.out.println(l);
   }
   public static void nextpermutation(int nums[]){
    int idx1=-1;
    int idx2=-1;
    //step -1 finding break point from rigth to left
    for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx1 =i;
            break;
        }
    }
    //if no break point'
    if(idx1==-1){
    reverse(nums, 0);

    return;
    }
    
    // breaking point present s-2= find next greatest element & swap idx1 and idx 2
    for(int i=idx1+1;i<nums.length;i++){
        if(nums[idx1]<nums[i]){
            idx2 = i;
        }
    }
    swap(nums, idx1, idx2);
    //s-3 reverse right half
    reverse(nums, idx1+1);

    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
}
public static void swap(int nums[],int x,int y){
    int temp = nums[x];
    nums[x] = nums[y];
    nums[y] =temp;
}
public static void reverse(int nums[],int si){
    int x =si;
    int y= nums.length-1;
    while(x<y){
        swap(nums,x,y);
        x++;
        y--;
    }
}
public static int maxAubArray(int nums[]){
    int curr=0;
    int max= Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(curr<0){
            curr =0;
        }
        curr+=nums[i];
        if(max<curr){
            max = curr;
        }
    }

    return max;
}

   public static void main(String[] args){
       //int matrix[][] =  {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       // setZeroes(matrix);
       //  for(int i=0;i<matrix.length;i++){
       //     for(int j=0;j<matrix[0].length;j++){
       //         System.out.print(matrix[i][j]+" ");
       //     }System.out.println();
       // }
       pascalstriangle(3);
       
       
       
   } 
   
}

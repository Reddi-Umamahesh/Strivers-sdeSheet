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

package StriverssdeSheet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Arrays2 {
    public static void rotate(int matrix[][]){
        int n=matrix.length;
        //step-1 transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step-2 switch corners
        int front=0;
        int rear=n-1;
        while(front<rear){
            for(int i=0;i<n;i++){
                int temp = matrix[i][front];
                matrix[i][front]= matrix[i][rear];
                matrix[i][rear] = temp;
            }
            front++;
            rear--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }

    }
    public static void merge(int intervals[][]){
        //sort staring idxes
        Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);

        Queue <Integer> q = new LinkedList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        int i=1;
        while(i<intervals.length){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s<=end){
                //merge both intervals;
                end = Math.max(e,end);
            }else{
                //merge not possible insert above interval
                q.add(start);
                q.add(end);
                start = s;
                end =e;
            }
            i++;
        }
        q.add(start);
        q.add(end);
        int n = q.size();
        int ans[][] = new int[n/2][2];
        for(int j=0;j<n/2;j++){
            ans[j][0] = q.remove();
            ans[j][1]= q.remove();
        }
        for(int j=0;j<n/2;j++){
            System.out.println(ans[j][0]+" "+ans[j][1]);
        }
    }
    public static void main(String[] args) {
        // int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        // rotate(matrix);
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        int arr1[][] = {{1,4}};
        merge(arr1);
    }
}

//2022. Convert 1D Array Into 2D Array
import java.util.*;
public class Convert_1D_Array_Into_2D_Array {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int[m][n];
        if((m*n)==(original.length)){ 
            int k=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=original[k++];
                }
            }
            return arr;
        }
        return new int[0][0];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int []og=new int[num];
        for(int i=0;i<num;i++){
            og[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(Arrays.deepToString(construct2DArray(og, m, n)));
        sc.close();
    }
}

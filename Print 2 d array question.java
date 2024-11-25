import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int colm=sc.nextInt();
        int nums[][]=new int[rows][colm];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int nums[][]=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int colm=sc.nextInt();
        int num[][]=new int[rows][colm];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int search=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                if(num[i][j]==search){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

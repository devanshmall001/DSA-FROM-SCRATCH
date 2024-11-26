import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int nums[]=new int[a];
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.println(nums[i]);
        }
    }
}

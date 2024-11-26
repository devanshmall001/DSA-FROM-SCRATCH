import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String name[]=new String[a];
        for(int i=0;i<a;i++){
            name[i]=sc.next();
        }
        for(int i=0;i<a;i++){
            System.out.println(name[i]);
        }
    }
}

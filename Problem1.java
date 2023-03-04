import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int a [] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int b [] = new int[n];
        for(int i=0;i<n;i++) b[i]=sc.nextInt();
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<b[i]){  //simple swapping sending all greater numbers to 1st array and vice versa
                int x = b[i];
                b[i] = a[i];
                a[i]=x;
            }
            max1=Math.max(max1,a[i]); //keeping max1 of 1st array
            max2=Math.max(max2,b[i]); //keeping max2 of 2nd array
        }
        System.out.print(max1*max2);

        


    }
    
    
}

import java.util.*;

class Problem5{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    System.out.print(isPerfectNumber(n));

   
} 
public static boolean isPerfectNumber(int n){
    int sum = 0;
    for(int i=1;i<=n/2;i++)
        if(n%i==0) sum+=i; //we just need to check whether the i can divide n perfectly or not 
    return sum==n;    
} 
}




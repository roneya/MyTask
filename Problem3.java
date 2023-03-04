import java.math.BigInteger;
import java.util.*;

class Problem3{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    List<String> list =  new ArrayList<>();
    while(n-->0) list.add(sc.next());
    sort1(list);
    sort2(list);

   
} 
public static void sort1(List<String> list){
       Collections.sort(list, new Comparator<String>(){
        @Override
        public int compare (String s1, String s2){
           if(s1.charAt(0)==s2.charAt(0)) return 0;
           else if(s1.charAt(0) < s2.charAt(0)) return -1;
           return 1;
           
        }
       });
       int i = 0;
       while(list.size()>i)
       {System.out.print(list.get(i)+" "); i++;}
       System.out.println();
}

public static void sort2(List<String> list){
    Collections.sort(list, new Comparator<String>(){
        @Override
        public int compare (String s1, String s2){
           if(s1.charAt(0)==s2.charAt(0)){
            BigInteger a = new BigInteger(s1.substring(1));  //this can handle large values thhan int or long
            BigInteger b = new BigInteger(s2.substring(1)); //we just cutting 1st character as we know rest number
            //although our number are less 99 but this code can hadle number larger than long
            return b.compareTo(a);  // cz we need in decending order
           }
           else
           return 0;
           
        }
       });
       int i = 0;
       while(list.size()>i)
       {System.out.print(list.get(i)+" "); i++;}
       
} 
}




import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start [] = new int [2];
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();
        String path = sc.next();
        System.out.print(distance(start, path));  //returning as float


    }
    public static float distance(int start[], String path){

        int x = start[0];
        int y = start[1];
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N') y++;
            if(path.charAt(i)=='S') y--;
            if(path.charAt(i)=='E') x++;
            if(path.charAt(i)=='W') x--;
            if(x<0 || x>10 || y<0 || y>10) return 0; //as it has crossed our graph
        }
        return (float) Math.sqrt(Math.pow(start[0]-x, 2)+Math.pow(start[1]-y, 2));
    }
    
}

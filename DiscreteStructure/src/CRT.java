
import java.util.Scanner;

public class CRT {
    int query[][];
    int n;
    int M;
    
    public CRT(int n) { 
        this.n = n;
        //0 -- a 1 -- m 2 -- M 3 --- Y
        M = 1;
        query = new int[n][4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter value of a for " + (i+1) + " ");
            query[i][0] = in.nextInt();
            System.out.print("Enter value of m for " + (i+1) + " ");
            query[i][1] = in.nextInt();
            M *= query[i][1];
        }
        Inverse inv = new Inverse();
        for(int i=0;i<n;i++) {
            query[i][2] = M / query[i][1];
            query[i][3] = inv.inv(query[i][2], query[i][1]);
        }
    }
    int calculate(){
        int number = 0;
        for(int i=0;i<n;i++) number += (query[i][0]*query[i][3]*query[i][2]);
        number = number % M;
        return number;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of input querries ");
        int n = in.nextInt();
        CRT c = new CRT(n);
        System.out.println(c.calculate());
    }
}
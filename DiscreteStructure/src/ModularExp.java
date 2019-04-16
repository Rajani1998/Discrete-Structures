import java.util.Scanner;

public class ModularExp {
    int calculate(int x,int y,int p){
        int res =1;
        x = x % p;
        while(y>0){
            if(y%2==1) res = res * x % p;
            y = y /2;
            x = (x*x) % p;
        }
        return res;
    }
    int cal2(int x,int y,int p){
        int ans = x;
        for(int i=0;i<y;i++) ans *= x;
        if(y == 0)ans = 1;
        ans = ans % p;
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x , y and p (x^y % p) ");
        int x = in.nextInt();
        int y = in.nextInt();
        int p = in.nextInt();
        ModularExp md  = new ModularExp();
        System.out.println(md.calculate(x, y, p));
    }
}
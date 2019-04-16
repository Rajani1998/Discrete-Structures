public class Inverse {
    int inv(int a,int n){
        int t = 0, newt = 1, r = n, newr = a, quo = 0 , tt = 0 ,tr = 0;
        while (newr != 0) {            
            quo = r / newr;
            tt = t;
            t = newt;
            newt = tt - quo*newt;
            tr = r;
            r = newr;
            newr = tr - quo*newr;
        }
        if(r>1) {
            System.out.println(a + " is not invertible.");
            return 9999;
        }
        if(t<0) t += n;
        return t;
    }
    public static void main(String[] args) {
        Inverse in = new Inverse();
        System.out.println(in.inv(24, 251));
        
    }
}

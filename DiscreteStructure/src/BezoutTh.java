public class BezoutTh {
    void bz(int a,int b){
        int s=0,old_s = 1,t=1,old_t=0,r=a,old_r=b,quo=0,t_r=0,t_s=0,t_t=0;
        while(r!=0){
            quo = old_r / r;
            t_r = old_r;
            old_r = r;
            r = t_r - quo*r;
            t_s = old_s;
            old_s = s;
            s = t_s - quo*s;
            t_t = old_t;
            old_t = t;
            t = t_t - quo*t;
        }
        System.out.println("Bézout coefficients: " + old_s + " " + old_t);
        System.out.println("Greatest Common Divisor " + old_r);
        System.out.println("Quotients by the GCD " + t + " " + s);
    }
    public static void main(String[] args) {
        BezoutTh bz = new BezoutTh();
        bz.bz(60,24);
    }
}

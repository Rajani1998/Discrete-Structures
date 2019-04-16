public class EuclideanTh {
    private int gcdP(int a,int b){
        int r = a % b;
	if(r==0)return b;
	return gcdP(b,r); 	
    }
    int gcd(int a,int b){
        int max,min;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        return gcdP(max,min);
    }
    public static void main(String[] args) {
        EuclideanTh e = new EuclideanTh();
        System.out.println(e.gcd(150, 210));
    }
}

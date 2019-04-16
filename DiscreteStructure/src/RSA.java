public class RSA {
    char[] encrypt(char[] msg,int key){
        char ans[] = new char[msg.length];
        int temp;
        for(int i=0;i<msg.length;i++) {
            temp = (int) msg[i];
            temp += key;
            temp = temp % 97 + 97;
            ans[i] = (char)temp;
        }
        return ans;
    }
    char[] decrypt(char[] msg,int key){
        char ans[] = new char[msg.length];
        int temp;
        for(int i=0;i<msg.length;i++) {
            temp = (int) msg[i];
            temp -= key;
            temp = temp % 97 + 26;
            System.out.println(temp);
            ans[i] = (char)temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        RSA r = new RSA();
        char[] msg = {'a','b','c','d'};
        System.out.println(r.encrypt(msg, 2));
        System.out.println(r.decrypt(msg, 5));
    }
}
package codewars;

public class KataReversal {

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8};
        int len = a.length;
        int buf = 0;
        for (int i = 0; i < len/2; i++){
            buf = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = buf;
        }
        String lac = "lac";
        for (int i = 0; i < len; i++){
            System.out.print(a[i]);
        }
    }
}

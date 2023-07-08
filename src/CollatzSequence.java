import java.util.Scanner;

public class CollatzSequence {
    static void collatzSeq(int n, int count){
        System.out.print(n+" ");
        if(n == 1){
            System.out.print(count+" ");
        }
        count++;
        if(n>1){
            if(n%2==0) {
                n /= 2;
                collatzSeq(n, count);
            }else{
                n = 3*n + 1;
                collatzSeq(n, count);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), count = 0;
        collatzSeq(n, count);
    }
}

package lab02_09;
import java.util.Scanner;

public class lab02_09 {
    public static boolean checkPrime(int x){
        int i ;
        if (x==0||x==1){
            return false;
        }
        for (i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int temp = -1;
        do {
            x = sc.nextInt();
            boolean prime = checkPrime(x);
            if(prime){
                if (x>temp){
                    temp = x;
                }
            }

        }
        while (x != 0);
        System.out.println(temp);

    }
}

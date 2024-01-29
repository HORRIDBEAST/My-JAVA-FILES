import java.util.Scanner;

public class Smallestelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int x = sc.nextInt();

        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 9; i >= 2; i--) {
            while (x % i == 0) {
                x = x / i;
                a[i]++;
            }
        }
        
        if (x != 1) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < 10; i++) {
                if (a[i] != 0) {
                    for (int j = 0; j < a[i]; j++) {
                        System.out.print(i);
                    }
                }
            }
        }
    }
}

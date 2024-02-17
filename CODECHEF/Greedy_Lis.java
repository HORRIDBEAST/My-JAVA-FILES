
import java.util.Scanner;

public class Greedy_Lis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter X: ");
        int X = scanner.nextInt();

        int[] permutation = findPermutation(N, X);

        if (permutation == null) {
            System.out.println("-1");
        } else {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
    }

   
    private static int[] findPermutation(int N, int X) {
        if (X < 0 || X >= N - 1) {
            return null;  // No valid permutation exists
        }

        int[] permutation = new int[N];
        int value = N - X;

        for (int i = 0; i < X; i++) {
            permutation[i] = value++;
        }

        for (int i = X; i < N; i++) {
            permutation[i] = i - X + 1;
        }

        return permutation;
    }
}

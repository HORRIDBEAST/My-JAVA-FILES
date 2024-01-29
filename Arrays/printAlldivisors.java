import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class printAlldivisors {
    public static List<Integer> printDivisors(int n) {
        List<Integer> al = new LinkedList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                al.add(i);
                if (i != (n / i)) {
                    al.add(n / i);
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=sc.nextInt();
        List<Integer> divisors = printDivisors(num);

        System.out.println("Divisors of " + num + " are: " + divisors);
    }
}

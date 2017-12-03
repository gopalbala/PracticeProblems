import java.util.Arrays;

/**
 * Created by gbalasubramanian on 02/12/17.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        threeSum(A,sum);
    }

    static void threeSum(int[] a, int sum) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int start = i + 1;
            int end = a.length - 1;
            while (start < end) {
                if (a[i] + a[start] + a[end] == sum){
                    System.out.println(a[i] + " " + a[start] + " "+a[end]);
                    break;
                }else if (a[i] + a[start] + a[end] < sum){
                    start++;
                } else {
                    end --;
                }
            }
        }
    }
}

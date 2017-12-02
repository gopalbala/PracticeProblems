import java.util.LinkedList;

/**
 * Created by gbalasubramanian on 02/12/17.
 */
public class MaximumElementOfSubArray {
    public static void main(String[] args) {
        int[] a = {9, 6, 11, 8, 10, 5, 14, 13, 93, 14};
        int k = 4;
        printMaximumFromSubArray(a, k);
    }

    static void printMaximumFromSubArray(int[] a, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!linkedList.isEmpty() && a[linkedList.getLast()] < a[i]) {
                linkedList.removeLast();
            }
            linkedList.addLast(i);
        }
        for (int i = k; i < a.length; i++) {
            System.out.println(a[linkedList.getFirst()]);

            while (!linkedList.isEmpty() && linkedList.getFirst() < (i - k + 1)) {
                linkedList.removeFirst();
            }
            while (!linkedList.isEmpty() && a[linkedList.getLast()] < a[i]) {
                linkedList.removeLast();
            }
            linkedList.add(i);
        }
        System.out.println(a[linkedList.getFirst()]);
    }
}

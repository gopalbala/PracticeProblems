import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by fax6 on 02/12/17.
 */
public class TwoSum {
    public static void main(String[] args) {
        int a[] = {1, 5, 7, -1, 5};
        int sum = 6;
        twoSum(a,sum);
    }

    static void twoSum(int[] a, int sum) {
        HashMap<Integer, Integer> hashtable = new HashMap<>(a.length);
        for (int i = 0; i < a.length; i++) {
            if (hashtable.get(a[i]) != null) {
                int val = hashtable.get(a[i]);
                hashtable.put(a[i], val + 1);
            } else {
                hashtable.put(a[i], 1);
            }
        }
        for (int i=0;i<a.length -1;i++){
            if(hashtable.get(sum - a[i])!= null){

                System.out.println(a[i] + " "+ (sum - a[i]));
            }
        }
    }
}

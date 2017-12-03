/**
 * Created by gbalasubramanian on 02/12/17.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int [] arrA = {1,3,5,5,5,5,4,1,5};
        findMajorityElement(arrA);
    }

    static void findMajorityElement(int[] a) {
        int maj_elem = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (maj_elem == a[i]){
                count++;
            } else if(count == 0) {
                maj_elem = a[i];
                count++;
            }else {
                count--;
            }
        }
        count = 0;
        for (int i=0;i<a.length;i++){
            if (a[i] == maj_elem){
                count++;
            }
        }
        if (count > a.length / 2){
            System.out.println(maj_elem);
        }
    }
}

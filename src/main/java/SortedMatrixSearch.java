/**
 * Created by fax6 on 02/12/17.
 */
public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {{2, 6, 7, 11},
                {3, 8, 10, 12},
                {4, 9, 11, 13},
                {5, 15, 16, 18}
        };
        search(mat, 9);
    }

    static void search(int[][] matrix, int elem) {
        int i = matrix.length -1;
        int j = matrix[0].length -1;

        int start = 0, end = j;
        int i1 = 0;
        while (start <= i && end >= 0) {
            if (matrix[start][end] == elem) {
                System.out.println(start + " " + i1 + " found " + elem);
                break;
            }
            if (matrix[start][end] < elem){
                start++;
            } else {
                end--;
            }

        }
    }
}

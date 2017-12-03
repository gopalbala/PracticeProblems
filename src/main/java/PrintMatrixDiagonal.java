/**
 * Created by gbalasubrmanian on 03/12/17.
 */
public class PrintMatrixDiagonal {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMAtrixDiagonally(a);
    }

    static void printMAtrixDiagonally(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int i1 = i;
            for (int j = 0; j <= i; j++) {
                System.out.print(mat[i1][j] + " ");
                i1 = i1 - 1;
            }
            System.out.println();
        }
        int row = mat.length - 1;
        for (int i = 1; i < mat.length; i++) {
            int i2 = row;
            for (int j1 = i; j1 <= mat.length - 1; j1++) {
                System.out.print(mat[i2][j1] + " ");
                i2 = i2 - 1;
            }
            System.out.println();
        }
    }
}

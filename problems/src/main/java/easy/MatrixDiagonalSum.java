package easy;

//1572. Matrix Diagonal Sum

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int crossValue = 0;
        int i,j;
        for (i = 0, j = mat.length-1; i < mat.length; i++, j--) {
            if(i!=j) {
                sum = sum + mat[i][i] + mat[i][j];
            }
            else {
                crossValue = mat[i][i];
            }
        }
        return sum+crossValue;
    }

    public static void main(String[] args)
    {
        // Creating an object class inside main() method
        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        final int[][] mat = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
        };

        // Calling the class object inside main() method
        System.out.println(obj.diagonalSum(mat));
    }
}

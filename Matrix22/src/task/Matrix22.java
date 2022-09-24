package task;

public class Matrix22 {
    int[][] matrix = new int[2][2];
    int matrix_trace;
    int matrix_disc;

    public Matrix22(int a, int b, int c, int d) {
        matrix = new int[][]{{a, b}, {c, d}};
    }

    public Matrix22(int[][] matrix) {
        this.matrix = matrix;
    }

    public void traceDisc() {
        this.matrix_trace = matrix[0][0] + matrix[1][1];
        this.matrix_disc = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

}

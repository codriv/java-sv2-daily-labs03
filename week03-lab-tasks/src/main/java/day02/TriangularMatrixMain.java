package day02;

public class TriangularMatrixMain {
    public static void main(String[] args) {
        System.out.println("\nType of square matrix\n");
//        int[][] matrix = {{0, 1, 2, 3}, {3, 0, 1, 2}, {2, 3, 0, 1}, {1, 2, 3, 0}}; //Square
        int[][] matrix = {{1, 1, 2, 3}, {0, 2, 1, 2}, {0, 0, 2, 1}, {0, 0, 0, 3}}; //UpperTriangular
//        int[][] matrix = {{1, 0, 0, 0}, {3, 2, 0, 0}, {2, 3, 1, 0}, {1, 2, 3, 1}}; //LowerTriangular
//        int[][] matrix = {{1, 0, 0, 0}, {0, 2, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}; //Diagonal

        TriangularMatrix triangularMatrix = new TriangularMatrix(matrix);
        triangularMatrix.printOutInMatrixFormat();

        System.out.println("\n" + triangularMatrix.getType());
    }
}

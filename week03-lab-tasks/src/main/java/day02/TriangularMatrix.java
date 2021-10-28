package day02;

public class TriangularMatrix {

    private int[][] matrix;

    public TriangularMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void printOutInMatrixFormat() {
        for (int[] innerArray: matrix) {
            String lineString = "";
            for ( int item: innerArray) {
                lineString += item + " ";
            }
            System.out.println(lineString.trim());
        }
    }

    public boolean isLowerTriangular() {
        int startItem = 1;
        for (int i= 0; i < matrix.length; i++) {
            for ( int j = startItem; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {return false;}
            }
            startItem++;
        }
        return true;
    }

    public boolean isUpperTriangular() {
        for (int  i= 1; i < matrix.length; i++) {
            for ( int j = 0; j < (matrix[i].length - (matrix[i].length - i)); j++) {
                if (matrix[i][j] != 0) {return false;}
            }
        }
        return true;
    }

    public String getType() {

//        String text = "This is a triangular matrix";
//        if (isLowerTriangular() && !isUpperTriangular()) {return text.substring(0, 9) + " lower" + text.substring(9);}
//        if (!isLowerTriangular() && isUpperTriangular()) {return text.substring(0, 9) + "n upper" + text.substring(9);}
//        if (isLowerTriangular() && isUpperTriangular()) {return text.substring(0, 9) + " diagonal" + text.substring(20);}
//        return text.substring(0, 8) + "not" + text.substring(7);

        if (isLowerTriangular() && !isUpperTriangular()) {return "This is a lower triangular matrix";}
        if (!isLowerTriangular() && isUpperTriangular()) {return "This is an upper triangular matrix";}
        if (isLowerTriangular() && isUpperTriangular()) {return "This is a diagonal matrix";}
        return "This is not a triangular matrix";
    }
}

public class Main {
    public static final char SYMBOL = 'X';

    public static void main(String[] args) {
        char[][] array = getX(6);

        for (char[] chars : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    public static char[][] getX(int size) {
        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ' ';
            }
        }

        for (int i = 0; i < size; i++) {
            matrix[i][i] = SYMBOL;
            matrix[size - 1 - i][i] = SYMBOL;
        }
        return matrix;
    }
}
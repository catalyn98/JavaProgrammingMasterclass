package _27.MultipleArrays;

public class Main {

    public static void main(String[] args) {

        // matrix
        // i - row
        // j - column
        int[][] twoDimensionalArray = new int[3][5];
        for(int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
                System.out.print(twoDimensionalArray[i][j] + " ");
            System.out.println();
        }
        System.out.println("_".repeat(20));

        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        System.out.println("_".repeat(20));
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print("a[" + i + "]" + "[" + j + "]" + " ");
            System.out.println();
        }

        System.out.println("_".repeat(20));
        System.out.println(array[3][3]);
    }
}
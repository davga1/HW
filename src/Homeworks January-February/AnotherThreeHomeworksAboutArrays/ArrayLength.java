public class ArrayLength {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 4, 5, 6, 3, 7, 8, 9, 7, 45, 10, 15, 55, 44},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 31, 68, 94, 11, 51},
                {1, 2, 15, 55, 46, 31, 24, 65, 55, 25, 25, 67, 84, 13, 64, 221,11,111}};
        int LongestArray = arr[0].length;
        int a;
        for(a = 0; a < arr.length; a++) {
            if (arr[a].length > LongestArray) {
                LongestArray = arr[a].length;
            }
        }
        for(a = 0; a < arr.length; a++) {
            if (arr[a].length == LongestArray) {
                System.out.println(" ");
                System.out.println("The Largest dimension is ");
                for(int b = 0; b < arr[a].length; ++b) {
                    System.out.print( " " + arr[a][b] + " ");
                }
            }
        }
    }
}
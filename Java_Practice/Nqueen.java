public class Nqueen {

    public static int[] leftFinal(int i, int j) {
        if (i == 0 || j == 0) {
            int index[] = { i, j };
            return index;
        }
        return leftFinal(i - 1, j - 1);
    }

    public static int[] rightFinal(int i, int j) {
        if (i == 0 || j == 3) {
            int index[] = { i, j };
            return index;
        }

        return rightFinal(i - 1, j + 1);
    }

    public static boolean leftCross(int[][] arr, int i, int j) {
        int x = leftFinal(i, j)[0];
        int y = leftFinal(i, j)[1];

        while (x <= 3 && y <= 3) {
            if (arr[x][y] == 1) {
                return false;
            }
            x++;
            y++;
        }
        return true;
    }

    public static boolean rightCross(int[][] arr, int i, int j) {
        int x = rightFinal(i, j)[0];
        int y = rightFinal(i, j)[1];

        while (x <= 3 && y >= 0) {
            if (arr[x][y] == 1) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public static boolean vertical(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    // public static boolean horizontal(int[][] arr, int i) {
    //     for (int j = 0; j < arr.length; j++) {
    //         if (arr[i][j] == 1) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean safeNor(int arr[][], int i, int j) {
        if (leftCross(arr, i, j) && rightCross(arr, i, j) && vertical(arr, j))
            return true;
        else
            return false;
    }

    public static boolean validate(int arr[][]) {
        int flag = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] == 1) {
                    flag++;
                }

            }

        }

        if (flag == 4) {
            return true;
        } else
            return false;
    }

    /* 
    public static int[][] copyArray(int arr[][]) {
        int copy[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copy[i][j] = arr[i][j];
            }
        }
        return copy;
    }
    */

    public static boolean solveNqueen(int arr[][], int i, int j) {
        if (j == arr.length) {
            j = 0;
            i++;
        }

        if (i > 3) {
            if (validate(arr)) {
                for (int a = 0; a < arr.length; a++) {
                    for (int b = 0; b < arr[a].length; b++) {

                        System.out.print(arr[a][b]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return validate(arr);
        }

        if (safeNor(arr, i, j)) {
            
            arr[i][j] = 1;
            boolean pos = solveNqueen(arr, i+1, 0);
            // if (!pos) {
                arr[i][j] = 0;
                return solveNqueen(arr, i, j + 1);
            // } else {
            //     return pos;
            // }
        } else {
            return solveNqueen(arr, i, j + 1);
        }

    }

    public static void main(String[] args) {

        int arr[][] = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }

        };

        solveNqueen(arr, 0, 0);

    }
}
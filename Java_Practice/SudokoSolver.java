import java.util.ArrayList;

import java.util.HashMap;

public class SudokoSolver {

    public static int[][][] answer;

    public static boolean found = false;

    public static int[][][] copyArray(int[][][] arr) {
        int[][][] copy = new int[9][3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    copy[i][j][k] = arr[i][j][k];
                }
            }
        }

        return copy;
    }

    public static ArrayList<Integer> posibleValues(int arr[][]) {

        ArrayList<Integer> pos = new ArrayList<>();

        HashMap<Integer, Integer> keyValue = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            keyValue.put(i, 0);
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (keyValue.containsKey(arr[a][b])) {
                    keyValue.put(arr[a][b], 1);
                }
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (keyValue.get(i) == 0) {
                pos.add(i);
            }
        }

        return pos;

    }

    public static int reduceBythree(int num) {
        if ((num - 3) < 0) {
            return num;
        }
        return reduceBythree(num - 3);
    }

    public static int reduceBymod(int num) {
        int mod = num % 3;

        return num - mod;
    }

    public static boolean verticalCheck(int[][][] arr, int iv, int jv, int kv, int pos) {

        for (int i = reduceBythree(iv); i < 9; i += 3) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j][kv] == pos) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean horizontalCheck(int[][][] arr, int iv, int jv, int kv, int pos) {
        for (int i = reduceBymod(iv); i < (reduceBymod(iv) + 3); i++) {
            for (int k = 0; k < 3; k++) {
                if (arr[i][jv][k] == pos) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sudokoMan(int[][][] arr, int i, int j, int k) {
        if (found) {
            return;
        }

        if ((i == 8 && j == 2 && k == 3) || (i == 8 && j == 2 && k == 2)) {
            answer = copyArray(arr);
            found = true;
            return;
        }

        if (k > 2) {
            k = 0;
            j++;
        }
        if (j > 2) {
            j = 0;
            i++;
        }

        // not if the value is 0 move to next
        if (arr[i][j][k] > 0) {

            sudokoMan(arr, i, j, k + 1);
        } else {
            ArrayList<Integer> possible_value = posibleValues(arr[i]);
            for (int pos : possible_value) {
                if (

                verticalCheck(arr, i, j, k, pos)
                        &&
                        horizontalCheck(arr, i, j, k, pos)

                ) {
                    int[][][] cc = copyArray(arr);
                    cc[i][j][k] = pos;

                    sudokoMan(cc, i, j, k + 1);
                }
            }
        }

    }

    public static void main(String[] args) {

        int[][][] data = {
                // 1
                {
                        { 9, 0, 0 },
                        { 0, 0, 1 },
                        { 0, 0, 0 }
                },
                // 2
                {
                        { 0, 2, 5 },
                        { 8, 0, 0 },
                        { 3, 0, 0 }
                },
                // 3
                {
                        { 0, 0, 8 },
                        { 0, 0, 5 },
                        { 0, 2, 0 }
                },
                // 4
                {
                        { 5, 0, 0 },
                        { 0, 3, 0 },
                        { 8, 9, 0 }
                },
                // 5
                {
                        { 0, 1, 0 },
                        { 0, 0, 0 },
                        { 0, 3, 0 }
                },
                // 6
                {
                        { 0, 9, 3 },
                        { 0, 8, 0 },
                        { 0, 0, 4 }
                },
                // 7
                {
                        { 0, 7, 0 },
                        { 4, 0, 0 },
                        { 2, 0, 0 }
                },
                // 8
                {
                        { 0, 0, 9 },
                        { 0, 0, 3 },
                        { 6, 4, 0 }
                },
                // 9
                {
                        { 0, 0, 0 },
                        { 7, 0, 0 },
                        { 0, 0, 1 }
                }
        };

        sudokoMan(data, 0, 0, 0);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                for (int k = 0; k < answer[i][j].length; k++) {
                    System.out.print(answer[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

}
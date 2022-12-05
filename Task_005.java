/**
 * Одномерные массивы
 * Task_001
public class Task_005 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5
    }
}
 */

/**
 * Task_002
public class Task_005 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[3] = 16;
        System.out.println(arr[3]);
    }
}
 */

/**
 * Многомерные массивы
 * Task_003
public class Task_005 {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}
 */

/**
 * Task_004
 */
public class Task_005 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

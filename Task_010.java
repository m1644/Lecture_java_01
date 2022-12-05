/**
 * Цикл while
 * Task_001
public class Task_010 {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);  // 3
    } 
}
 */

/**
 * Цикл  do while
 * Task_002
public class Task_010 {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);  // 3        
    }
}
 */

/**
 * Цикл for
 * Task_003
public class Task_010 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);  // 1 3 5 7 9
        }
    }
}
 */

/**
 * Цикл for
 * Task_004
public class Task_010 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);  // 0 2 4 6 8
        }
    }
}
 */

/**
 * Цикл for
 * Task_005
public class Task_010 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println(i);  // 0
        }
    }
}
 */

/**
 * Оператор цикла for
 * Task_006
public class Task_010 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);  // 55
    }
}
 */

/**
 * Вложенные циклы
 * Task_007
 */
public class Task_010 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

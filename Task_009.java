/**
 * Функции и методы
 * Task_001
public class Task_009 {
    static void sayHi() {
        System.out.println("Hi!");
    }
    static int sum(int a, int b) {
        return a=b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi();  // Hi!
        System.out.println(sum(1, 3));  // 3
        System.out.println(factor(5));  // 120.0
    }
}
 */

/**
 * Управляющие конструкции:
 * условный оператор
 * Task_002
public class Task_009 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);  // 2
    }
}
 */

/**
 * Task_003
public class Task_009 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;
        System.out.println(c);  // 2
    }
}
 */

/**
 * Task_004
 */
public class Task_009 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);    // 1
    }
}

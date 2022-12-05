/**
 * Основы: типы данных
 * Task_001
public class Task_003 {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);  // 123
        var b = 123.321;
        System.out.println(b);  // 123.321
    }
}
 */

/**
 * Task_002
 */
public class Task_003 {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a);  // 123
        var b = 123.321;
        System.out.println(b);  // 123.321
        System.out.println(getType(a)); // Integer
        System.out.println(getType(b)); //Double
        b = 1022;
        System.out.println(b);  // 1022.0
        //b = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}

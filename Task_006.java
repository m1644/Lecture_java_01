/**
 * Преобразования
 * Task_001
public class Task_006 {
    public static void main(String[] args) {
        int i = 123; double d = i;
        System.out.println(i);  // 123
        System.out.println(d);  // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3       
        d = 3.9415; i = (int)d;
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3
        byte b = Byte.parseByte("123");
        System.out.println(b);  // 123
        b = Byte.parseByte("1234");
        System.out.println(b);  // NumberFormatException: Value out of range.
    }   
}
 */

/**
 * Task_002
 */
public class Task_006 {
    public static void main(String[] args) {
        byte b = Byte.parseByte("12");
        System.out.println(b);    // 12
        byte d = Byte.parseByte("1211");    // только от 0 до 255 !!!
        System.out.println(d);  // NumberFormatException: Value out of range.
    }    
}

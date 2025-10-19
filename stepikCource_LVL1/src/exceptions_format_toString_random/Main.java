package exceptions_format_toString_random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    /* 
        int a = 1;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("sdf1123");
        } catch (Exception exception) {
            System.out.println(exception.getClass());

        }
        System.out.println("hello");
    // System.out.println(String.format("Hello, %s", "reduke"));
    */
    // We can override method 'toString' in own classes a
    // because all of classes extended by super class 'Object'.
    
    
    Random random = new Random();
    int a = random.nextInt();
    System.out.println(a); 

    }
}

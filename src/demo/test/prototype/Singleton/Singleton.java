package demo.test.prototype.Singleton;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:05
 */
public class Singleton {
    private static Singleton instance;


    private  Singleton() {

    }

    public static Singleton getResult() {
       if (instance == null) {
           instance = new Singleton();
       }
       return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getResult();
        Singleton s2 = Singleton.getResult();
        System.out.println(s1==s2);
    }
}

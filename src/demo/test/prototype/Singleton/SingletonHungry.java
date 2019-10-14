package demo.test.prototype.Singleton;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:22
 */
public class SingletonHungry {
    private static SingletonHungry instance=new SingletonHungry();


    private  SingletonHungry() {

    }

    public static SingletonHungry getResult() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonHungry s1 = SingletonHungry.getResult();
        SingletonHungry s2 = SingletonHungry.getResult();
        System.out.println(s1==s2);
    }
}

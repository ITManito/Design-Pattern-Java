package demo.singleton;

/** 懒汉式, 线程不安全
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 15:02
 */
public class Singleton {

    //static
    private static Singleton instance;

    //private
    private Singleton() {

    }

    public static Singleton GetInstance() {

        //如果事件为空,新建实例
            if (instance == null) {
                instance = new Singleton();
            }


        return instance;
    }

    public static void main(String[] args) {

        //触发Singleton类的获取事件方法
        Singleton s1 = Singleton.GetInstance();
        Singleton s2 = Singleton.GetInstance();
        if (s1==s2) {
            System.out.println("俩对象是相同实例");
        }
    }
}

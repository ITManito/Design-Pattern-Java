package demo.singleton;

/** todo 懒汉式: 多线程加锁, 双重锁定 ?? readOnly? 静态初始化Java?
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 15:50
 */
public  class SingletonDoublelock {
    //static
    private static SingletonDoublelock instance;

    //static
    private SingletonDoublelock() {

    }

    public static synchronized SingletonDoublelock GetInstance() {
        //双重锁定

        //实例未被创建时加锁
        if (instance == null) {

            //防止多线程 线程不安全
            synchronized (SingletonDoublelock.class) {
                //如果事件为空,新建实例
                if (instance == null) {
                    instance = new SingletonDoublelock();
                }
            }
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

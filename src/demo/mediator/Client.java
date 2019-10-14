package demo.mediator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:47
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague c1 = new ConcreteColleague(m);
        ConcreteColleagueOne c2 = new ConcreteColleagueOne(m);

        m.setConcreteColleague(c1);
        m.setConcreteColleagueOne(c2);

        c1.send("吃过饭了么");
        c2.send("没有呢,你打算请客?");
    }
}

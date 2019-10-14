package demo.test.prototype.observermm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 16:25
 */
public class Client {
    public static void main(String[] args) {
        ConSubA conSub = new ConSubA();
        conSub.add(new ConObserverlA("mm", conSub));
        conSub.setSubjectment("龙梁");
        conSub.notifyml();
    }
}

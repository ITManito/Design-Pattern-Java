package demo.state;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:00
 */
public class Context {
    //todo 构造方法
    public Context(Statem statem) {
        this.statem = statem;
    }

    private Statem statem ;

    public Statem getStatem() {
        return statem;
    }

    public void setStatem(Statem statem) {
//        ?? todo
        this.statem = statem;
        System.out.println("当前状态:"+statem.getClass().getName());
    }

    //    todo this?
    public void request() {
        statem.handle(this);
    }

}

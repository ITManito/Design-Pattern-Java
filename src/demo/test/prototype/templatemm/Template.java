package demo.test.prototype.templatemm;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 16:44
 */
public abstract class Template {
    abstract void tm1();

    abstract void tm2();

    //    钩子方法
    protected boolean isTmgz() {
        return true;
    }

    public void ttm() {
        tm1();

        if (this.isTmgz()) {
            this.tm2();
        }

    }

}

package demo.test.prototype.factory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:54
 */
public class ConcreteFactory implements IFactory{
    @Override
    public IDepartment createDepartment() {
        return  new AccessDepartment();
    }
}

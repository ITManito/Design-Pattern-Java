package demo.test.prototype.AbstractFactory;


/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:35
 */
public class AccessFactory implements IFactory{

    @Override
    public IUser createUser() {
        return null;
    }

    @Override
    public IDepartment createDepartment() {
        return  new AccessDepartment();
    }
}

package demo.abstractFactory;


/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 17:14
 */
public class AccessFactory implements IFactory {

    @Override
    public IUser CreateUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment CreatDepartment() {
         return new AccessDepartment();
    }
}

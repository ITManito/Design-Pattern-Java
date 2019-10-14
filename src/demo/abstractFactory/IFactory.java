package demo.abstractFactory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 17:04
 */
public interface IFactory {
    IUser CreateUser();

    IDepartment CreatDepartment();
}

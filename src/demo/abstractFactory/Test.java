package demo.abstractFactory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 17:35
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();

        IDepartment id = factory.CreatDepartment();
        id.Insert(new Department());
        id.getDepartment(1);
    }
}

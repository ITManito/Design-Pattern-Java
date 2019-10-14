package demo.test.prototype.AbstractFactory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:41
 */
public class AbstractTest {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IDepartment iDepartment = factory.createDepartment();
        Department department = new Department();
        department.setId(2);
        department.setDepartment("中国部门");
        iDepartment.insert(department);
        iDepartment.getResult(2);
    }
}

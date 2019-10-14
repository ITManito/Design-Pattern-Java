package demo.test.prototype.factory;

import demo.test.prototype.AbstractFactory.Department;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:57
 */
public class FactoryTest {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactory();
        IDepartment iDepartment = (IDepartment) factory.createDepartment();
        Department department = new Department();
        department.setId(2);
        department.setDepartment("中国部门");
        iDepartment.insert(department);
        iDepartment.getResult(2);
    }
}

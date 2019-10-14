package demo.test.prototype.factory;

import demo.test.prototype.AbstractFactory.Department;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:53
 */
public interface IDepartment {
    void insert(Department department);

    Department getResult(int id );
}

package demo.test.prototype.AbstractFactory;


/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 16:38
 */
public class SqlServerDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在SqlServer数据库中新增一条记录成功");
    }

    @Override
    public Department getResult(int id) {
        System.out.println("通过ID在SqlServer数据库中查询记录成功");
        return null;
    }
}

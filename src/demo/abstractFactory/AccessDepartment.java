package demo.abstractFactory;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/27 17:19
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void Insert(Department department) {
        System.out.println("Access数据库中给DepartMent表新增一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Access数据库中根据ID得到DepartMent表一条记录");
        return null;
    }
}

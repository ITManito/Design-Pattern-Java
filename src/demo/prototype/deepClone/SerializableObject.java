package demo.prototype.deepClone;
import	java.io.ObjectInputStream;
import	java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 11:46
 */
public class SerializableObject implements Serializable {
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流 todo ??

        //输出到流
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);

//        本类写入对象
        oos.writeObject(this);

        //将对象从流中取出 todo ??

        //
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(bis);

        return (ois.readObject());
    }
}

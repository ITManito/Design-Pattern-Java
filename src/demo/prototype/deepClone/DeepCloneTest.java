package demo.prototype.deepClone;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/9/29 11:57
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        SerializableObject serializableObject,copyObject = null;
        serializableObject = new SerializableObject();
        try {
             copyObject=(SerializableObject) serializableObject.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("serializableObject==copyObject??");
        System.out.println(serializableObject==copyObject);
    }
}

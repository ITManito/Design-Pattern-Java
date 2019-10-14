package demo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/2 9:46
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();
    public void add(Element e){
        elements.add(e);
    }
    public void remove(Element e){

        elements.remove(e);
    }

    public void accept(Visitor visitor) {
        elements.forEach((Element e) -> e.accept(visitor));
    }
}

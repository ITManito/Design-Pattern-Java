package demo.observer;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 15:28
 */
public class ConcreteSubject extends Subjectm {
    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    private String subjectState;

}

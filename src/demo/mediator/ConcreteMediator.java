package demo.mediator;

/**
 * @author 任蒙蒙
 * @version 1.0.0
 * @since 2019/10/1 16:30
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague concreteColleague;
    private ConcreteColleagueOne concreteColleagueOne;

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }

    public void setConcreteColleagueOne(ConcreteColleagueOne concreteColleagueOne) {
        this.concreteColleagueOne = concreteColleagueOne;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague==concreteColleague) {
            concreteColleagueOne.notify(message);
        }else{
            concreteColleagueOne.notify(message);
        }
    }
}

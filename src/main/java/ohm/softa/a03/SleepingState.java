package ohm.softa.a03;

public class SleepingState extends State{

    public SleepingState(Cat cat) {
        super(cat.getSleep());
    }

    @Override
    public State successor(Cat cat) {
        return new HungryState(cat);
    }
}

package ohm.softa.a03;

public class PlayfulState extends State{

    public PlayfulState(Cat cat) {
        super(cat.getAwake());
        time=10;
    }

    @Override
    public State successor(Cat cat) {
        return new SleepingState(cat);
    }
}

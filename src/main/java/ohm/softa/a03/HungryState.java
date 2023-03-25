package ohm.softa.a03;

public class HungryState extends State{
    public HungryState(Cat cat) {
        super(cat.getAwake());
    }

    @Override
    public State successor(Cat cat) {
        return new DeathState(cat);
    }
}

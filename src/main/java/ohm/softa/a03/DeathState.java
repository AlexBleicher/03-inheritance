package ohm.softa.a03;

public class DeathState extends State{
    public DeathState(Cat cat) {
        super(Integer.MAX_VALUE);
    }

    @Override
    public State successor(Cat cat) {
        return this;
    }
}

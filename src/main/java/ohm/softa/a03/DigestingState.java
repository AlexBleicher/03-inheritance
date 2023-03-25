package ohm.softa.a03;

public class DigestingState extends State{

    public DigestingState(Cat cat) {
        super(cat.getDigest());
        time = 0;
    }

    @Override
    public State successor(Cat cat) {
        return new PlayfulState(cat);
    }
}

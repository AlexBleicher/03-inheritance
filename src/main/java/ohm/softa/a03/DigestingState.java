package ohm.softa.a03;

public class DigestingState extends State{

    public DigestingState(Cat cat) {
        time = 0;
        duration = cat.getDigest();
    }

    @Override
    public State successor(Cat cat) {
        return new PlayfulState();
    }
}

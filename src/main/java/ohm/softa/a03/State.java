package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    protected int time;
    protected final int duration;

    public State(int duration) {
        this.duration = duration;
    }

    public final State tick(Cat cat) {
        time++;
        if (time >= duration) {
            return successor(cat);
        }
        return this;
    }

    public abstract State successor(Cat cat);
}

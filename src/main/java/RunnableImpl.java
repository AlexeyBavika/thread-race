import org.apache.log4j.Logger;

public class RunnableImpl implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(RunnableImpl.class);
    private final Incrementer incrementer;

    public RunnableImpl(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    public void run() {
        while (!incrementer.isFinished()) {
            incrementer.incrementPosition();
            LOGGER.info("RunnableImpl position : " + incrementer.getPosition());
        }
    }
}

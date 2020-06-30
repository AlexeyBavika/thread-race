import org.apache.log4j.Logger;

public class ThreadImpl extends Thread {
    private static final Logger LOGGER = Logger.getLogger(ThreadImpl.class);
    private final Incrementer incrementer;

    public ThreadImpl(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isFinished()) {
            incrementer.incrementPosition();
            LOGGER.info("ThreadImpl position : " + incrementer.getPosition());
        }
    }
}

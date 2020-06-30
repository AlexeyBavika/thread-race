public class Incrementer {
    private static final int DISTANCE = 100;
    private int position;

    public void incrementPosition() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFinished() {
        return position == DISTANCE;
    }

}

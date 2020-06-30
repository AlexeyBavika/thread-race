public class Main {

    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        ThreadImpl threadImpl = new ThreadImpl(incrementer);
        Thread runnableImpl = new Thread(new RunnableImpl(incrementer));
        threadImpl.start();
        runnableImpl.start();
    }
}

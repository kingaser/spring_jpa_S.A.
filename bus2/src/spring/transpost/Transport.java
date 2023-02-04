package spring.transpost;

public interface Transport {

    public boolean start();

    public void status();

    public void take(int passenger);

    public void changeSpeed(int speed);
}

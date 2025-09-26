package sprint1_01;

abstract class Instrument {
    protected String name;
    protected double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();
}

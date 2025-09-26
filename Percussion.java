package sprint1_01;

class Percussion extends Instrument {
    static {
        System.out.println("A percussion instrument is being played.");
    }

    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is being played.");
    }
}

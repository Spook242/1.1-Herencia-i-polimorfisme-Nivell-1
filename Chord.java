package sprint1_01;

class Chord extends Instrument {
    static {
        System.out.println("A chord instrument is being played.");
    }

    public Chord(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
    }
}


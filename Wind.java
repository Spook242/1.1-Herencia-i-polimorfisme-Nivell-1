package sprint1_01;

class Wind extends Instrument {

    public Wind(String nom, double price) {
        super(nom, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is being played.");
    }
}

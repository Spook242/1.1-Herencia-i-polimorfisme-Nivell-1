package sprint1_01;

public class Main {
    static void main() {

        Instrument guitar = new Chord("Guitar", 500.0);
        guitar.play();

        Instrument drums = new Percussion("Drums", 1200.0);
        drums.play();

        Instrument flute = new Wind("Flute", 150.0);
        flute.play();
    }
}


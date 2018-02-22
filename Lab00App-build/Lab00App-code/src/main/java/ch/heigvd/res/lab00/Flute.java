package ch.heigvd.res.lab00;

/**
 * Classe définisant l'instrument Flute
 */
public class Flute implements IInstrument {
    // Variables privés de la classe flute
    private int vol = 5;
    private String color = "wood";
    private String sound = "tut";

    // Constructeur par défaut de la classe Flute
    public Flute(){}

    // Pour les override => CF interface IInstrument
    @Override
    public int getSoundVolume() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String play() {
        return null;
    }
}

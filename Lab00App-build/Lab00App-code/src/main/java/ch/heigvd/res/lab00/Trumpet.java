package ch.heigvd.res.lab00;

/**
 * Classe définisant l'instrument Trumpet
 */
public class Trumpet implements IInstrument{

    // Variables privés de la classe
    private int vol = 5;
    private String color = "golden";
    private String sound = "pouet";

    // Constructeur par défaut
    public Trumpet(){}

    // Pour les override => CF interface IInstrument
    @Override
    public int getSoundVolume() {
        return vol;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String play() {
        return sound;
    }
}

package ch.heigvd.res.lab00;

/**
 * Classe définisant l'instrument Harmonica
 */
public class Harmonica implements IInstrument {
    // Variables privés de la classe harmonica
    private int vol = 5;
    private String color = "golden";
    private String sound = "dap dap";

    // Constructeur par défaut
    public Harmonica(){}

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

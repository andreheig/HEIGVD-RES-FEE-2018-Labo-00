package ch.heigvd.res.lab00;

/**
 * Classe définisant l'instrument Clavier
 */
public class Clavier implements IInstrument {
    // Variables privés de la classe clavier
    private int vol = 5;
    private String color = "ivory";
    private String sound = "dayyyn";

    // Constructeur par défaut
    public Clavier(){}

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
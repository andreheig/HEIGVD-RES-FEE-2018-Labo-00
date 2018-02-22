package ch.heigvd.res.lab00;

/**
 * Interface permettant de définir ce qui est important pour les classes implémentant
 * l'interface IInstrument
 */
public interface IInstrument {

   /**
    * Permet d'obtenir le volume en décibels de l'instrument
    * @return la valeur du volume en décibels de l'instrument
    */
   int getSoundVolume();

   /**
    * Permet de savoir le bruit que fait l'instrument
    * @return bruit que fait l'instrument
    */
   String play();

   /**
    * Permet d'obtenir la couleur de base de l'instrument
    * @return couleur de l'instrument
    */
   String getColor();

}

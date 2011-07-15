/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

//############################################################################
/**
  *
  * @author Thomas Gerlach
*/
//############################################################################
public class Vertrieb
{
  private int minimum = 0;
  private int maximum = 150;
  private int anzahlTage = 0;
  private int anzahlProdukte = 0;
  private int[][] daten = null;
  
  //############################################################################
  /**
  */
  //############################################################################
  public Vertrieb(int tage, int produkte)
  {
    anzahlTage = tage;
    anzahlProdukte = produkte;
    daten = erzeugen();
  }
  
  //############################################################################
  /**
  */
  //############################################################################
  public int[][] getDaten()
  {
    return daten;
  }

  //############################################################################
  /**
  */
  //############################################################################
  public int[][] erzeugen()
  {
    daten = new int[anzahlTage][anzahlProdukte];
    Generator zufall = new Generator(minimum, maximum);
    for (int i = 0; i < anzahlTage; i++)
    {
      daten[i] = zufall.listeGanzzahl(anzahlProdukte);
    }
    return daten;
  }
}
/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

//############################################################################
/**
  *
  * @author Thomas Gerlach
*/
//############################################################################
public enum Wochentage
{
  
  TAG1(0, "Sonntag", "So"),
  TAG2(1, "Montag", "Mo"),
  TAG3(2, "Dienstag", "Di"),
  TAG4(3, "Mittwoch", "Mi"),
  TAG5(4, "Donnerstag", "Do"),
  TAG6(5, "Freitag", "Fr"),
  TAG7(6, "Samstag", "Sa");

  public int index;
  public String titel;
  public String kurz;

  //##########################################################################
  /**
  */
  //##########################################################################
	private Wochentage(int derIndex, String derTitel, String dasKurzwort)
	{
    index = derIndex;
    titel = derTitel;
    kurz = dasKurzwort;
  }

  //##########################################################################
  /** Liefert den Wert des Attribut index
    *
    * @return Wert des Attribut index
  */
  //##########################################################################
  public double getIndex() 
  {
    return index;
  }
  
  //##########################################################################
  /** Liefert den Wert des Attribut titel
    *
    * @return Wert des Attribut titel
  */
  //##########################################################################
  public String getTitel() 
  {
    return titel;
  }

  //##########################################################################
  /** Liefert den Wert des Attribut kurz
    *
    * @return Wert des Attribut kurz
  */
  //##########################################################################
  public String getKurz() 
  {
    return kurz;
  }

  //##########################################################################
  /** Liefert eine Liste als Zusammenstellung aller Titel des Enum
    *
    * @return Liste von Zeichenketten aller möglichen Titel
  */
  //##########################################################################
  public static String[] getListeTitel() 
  {
    String[] ergebnis = new String[Wochentage.values().length];
    for (int i = 0; i < ergebnis.length; i++)
    {
      ergebnis[i] = Wochentage.values()[i].getTitel();
    }
    return ergebnis;
  }

}

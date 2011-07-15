/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

//############################################################################
/**
  *
  * @author Thomas Gerlach
*/
//############################################################################
public enum Zeitungen
{
  ZEITUNG1("Nachtmär", 3.5, 0.1025),
  ZEITUNG2("Tippy", 4.8, 0.125),
  ZEITUNG3("Moon", 3.9, 0.125);

  public String titel;
  public double preis;
  public double anteil;

  //##########################################################################
  /**
  */
  //##########################################################################
	private Zeitungen(String derTitel, double derPreis, double derAnteil)
	{
    titel = derTitel;
    preis = derPreis;
    anteil = derAnteil;
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
  /** Liefert den Wert des Attribut preis
    *
    * @return Wert des Attribut preis
  */
  //##########################################################################
  public double getPreis() 
  {
    return preis;
  }

  //##########################################################################
  /** Liefert den Wert des Attribut anteil
    *
    * @return Wert des Attribut anteil
  */
  //##########################################################################
  public double getAnteil() 
  {
    return anteil;
  }

  //##########################################################################
  /** Liefert eine Liste als Zusammenstellung aller Titel des Enum
    *
    * @return Liste von Zeichenketten aller möglichen Titel
  */
  //##########################################################################
  public static String[] getListeTitel() 
  {
    String[] ergebnis = new String[Zeitungen.values().length];
    for (int i = 0; i < ergebnis.length; i++)
    {
      ergebnis[i] = Zeitungen.values()[i].getTitel();
    }
    return ergebnis;
  }

  //##########################################################################
  /** Liefert eine Liste als Zusammenstellung aller Preise des Enum
    *
    * @return Liste aller möglichen Preise
  */
  //##########################################################################
  public static double[] getListePreis() 
  {
    double[] ergebnis = new double[Zeitungen.values().length];
    for (int i = 0; i < ergebnis.length; i++)
    {
      ergebnis[i] = Zeitungen.values()[i].getPreis();
    }
    return ergebnis;
  }

  //##########################################################################
  /** Liefert eine Liste als Zusammenstellung aller Anteile des Enum
    *
    * @return Liste aller möglichen Anteile
  */
  //##########################################################################
  public static double[] getListeAnteil() 
  {
    double[] ergebnis = new double[Zeitungen.values().length];
    for (int i = 0; i < ergebnis.length; i++)
    {
      ergebnis[i] = Zeitungen.values()[i].getAnteil();
    }
    return ergebnis;
  }

}

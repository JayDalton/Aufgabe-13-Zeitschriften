/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

import java.util.Comparator;

//##########################################################################
/** Dient dem Vergleich und der Sortierung der Gewinne von Studenten
  *
  * @author Thomas Gerlach
*/
//##########################################################################
public class GewinnComparator implements Comparator<Student>
{
  //##########################################################################
  /**
    * Vergleicht den Gewinn der Studenten und liefert das Ergebnis.
    * 
    * @param  a Erster Student
    * @param  b Zweiter Student
    * 
    * @return   Ergebnis des Vergleich wobei gilt:
    *           -1: Der erste Parameter ist untergeordnet
    *            0: Beide Parameter werden gleich eingeordnet
    *            1: Der erste Parameter ist uebergeordnet
  */
  //##########################################################################
  public int compare( Student a, Student b ) 
  {
    int ergebnis = 0;

    if( a.getGewinn() < b.getGewinn() )
    {
      ergebnis = -1;
    }
    
    if( a.getGewinn() > b.getGewinn() )
    {
      ergebnis = 1;
    }

    return ergebnis;
  }
        
}
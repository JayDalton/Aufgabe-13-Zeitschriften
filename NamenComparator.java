/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

import java.util.Comparator;

//##########################################################################
/** Dient dem Vergleich und der Sortierung der Namen von Studenten
  *
  * @author Thomas Gerlach
*/
//##########################################################################
public class NamenComparator implements Comparator<Student>
{
  //##########################################################################
  /**
    * Vergleicht die Namen der Studenten und liefert das Ergebnis.
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

    if( a.getName() == null && b.getName() == null )
    {
      ergebnis = 0;
    }
    if( b.getName() == null )
    {
      ergebnis = -1;
    }
    
    if( a.getName() == null )
    {
      ergebnis = 1;
    }
    
    ergebnis = a.getName().compareTo(b.getName());


    return ergebnis;
  }
}
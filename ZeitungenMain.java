/*############################################################################
  Kodierung: UTF-8 ohne BOM - üöä
############################################################################*/

//############################################################################
/** Repräsentiert Verkauf von Zeitungen eines Verlages
  *
  * @author Thomas Gerlach
*/
//############################################################################
public class ZeitungenMain
{
  //##########################################################################
  /** Programmaufruf zur Steuerung des Umsatzes eines Verlages
  */
  //##########################################################################
	public static void main(String[] args)
	{
    if (validiereArgs(args))
    {
      String folge = new String("+");
      int anzahl = Integer.parseInt(args[0]);

      if (args.length == 2) {
        folge = args[1];
      }

      Ausgabe.leere();
  		Ausgabe.zeile("\n\n\tZ e i t s c h r i f t e n\n\n");
  		Ausgabe.zeile("Lesen fetzt ...");
      
      do {
        
        Umsatz umsatz = new Umsatz(anzahl);
        umsatz.zeigeTagesschau(folge);
        umsatz.zeigeWochenschau(folge);
        
      } while (Eingabe.auswahl("Noch einmal? (j/n): ", "j", "n"));
      
      Ausgabe.zeile("\n\n\tAuf Wiedersehen!\n\n");
      
    } else {
      schreibeAnleitung();
    }
	}

  //##########################################################################
  /** Validiert die übergebenen Parameter aud Anzahl und Datentyp
    *
    * @param args Eine zu prüfende Liste von Zeichenketten
    *
    * @return Ergebnis der Prüfung
  */
  //##########################################################################
  private static boolean validiereArgs(String[] args)
  {
    boolean ergebnis = false;
    if (0 < args.length && args.length < 3)
    {
      try
      {
        if (args.length == 1) {
          int anzahl = Integer.parseInt(args[0]);
          ergebnis = (0 < anzahl) && (anzahl <= 200);
        } else if (args.length == 2) {
          int anzahl = Integer.parseInt(args[0]);
          ergebnis = (0 < anzahl) && (anzahl <= 200) && (args[1].compareTo("+") == 0 || args[1].compareTo("-") == 0);
        }
      }
      catch (NumberFormatException nfe)
      {
      }
    }
    return ergebnis;
  }
  //##########################################################################
  /** Schreibt eine Anleitung zum Programmaufruf in die Standardausgabe
  */
  //##########################################################################
  private static void schreibeAnleitung()
  {
    System.out.format("\nBenutzung        : java ZeitungenMain anzahlStudenten <folgeSortierung>");
    System.out.format("\nanzahlStudenten  : Ganzzahl [1 <= n <= 200]");
    System.out.format("\nfolgeSortierung  : Symbol   [+ | -]");
    System.out.format("\n\n");
  }
}



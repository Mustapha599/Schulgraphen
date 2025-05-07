import utils.Graph;
import utils.List;
import utils.Vertex;

/**
 * Beschreiben Sie hier die Klasse Schulgraph.
 *
 *  @author  (Ihr Name)
 *  @version  (eine Versionsnummer oder ein Datum)
 */
public class Schulgraph
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Graph g;
    private double [][] admatrix;

    /**
     * Konstruktor für Objekte der Klasse Schulgraph
     */
    public Schulgraph()
    {
        // Aufbau des Schulgraphens
        g = new Graph();

        //alle Kanten und Knoten werden deklariert und initialisiert
        Vertex rueckertstr = new Vertex ("Rückertstraße");
        Vertex lz = new Vertex ("LZ");

        //Die Knoten und Kanten werden dem Graphen hinzugefügt
        g.addVertex(rueckertstr);
        g.addVertex(lz);

        adListe();
    }

    /**
     * Die Anfrage gibt die ID aller Knoten auf der Konsole aus!
     */
    public void knotenAnzeigen() {

    }

    /**
     * Man erstellt eine Liste mit allen Knoten(s) und durchläuft diese - hierbei werden vom jeden einzelnen
     * Knoten die Verbindungen mit anderen Knoten ausgegeben und ebenso das Gewicht der Kanten
     */
    public void adListe() {
        //dein Quellcode hier
    }

    /**
     * Alle direkt verbundenen Knoten des übergebenen Knoten sollen ausgegeben werden.
     *  @param  pVertex
     */

    public void kantenAnzeigen(String pVertex) {
        //dein Quellcode hier
    }

    /**
     * Die Anzahl aller Knoten im Graph wird zurückgegeben und gleichzeitig auf der konsole ausgegeben.
     *  @return  anzahl : int
     */
    public int zaehleKnoten()
    {
        int anzahl = 0;//dein Quellcode hier
        return anzahl;
    }

    /**
     * Die Anfrage liefert den Graph als Adjazenzmatrix in Form eines zweidimensionalen Arrays zurück
     *
     *  @return  admatrix : [][]double
     */

    public double [][] admatrixRueckgabe()
    {
        //dein Quellcode hier
        return admatrix;
    }

    /**
     * Breitensuche: Weitere Informationen zur Breitensuche findest du im Buch! Der Parameter gibt den Startknoten an
     *  @param  pStart : String
     *  @return  Ergebnisliste der Breitensuche
     */
    public List<Vertex> breitensuche(String pStart)
    {
        Vertex gesuchterKnoten = g.getVertex(pStart);
        return breitensucheIntern(gesuchterKnoten);
    }

    /**
     * Interne Methode zur rekursiven Breitensuche.
     */
    private List<Vertex> breitensucheIntern(Vertex pStart) {
        List<Vertex> ergebnisListe = new List<>();
        // dein Quellcode hier
        return ergebnisListe;
    }

    /**
     * Tiefensuche: Weitere Informationen zur Tiefensuche findest du im Buch! Der Parameter gibt den Startknoten an
     *  @param  pStart : String
     *  @return  Ergebnisliste der Breitensuche
     */
    public List<Vertex> tiefendurchlauf(String pStart)
    {
        Vertex gesuchterKnoten = g.getVertex(pStart);
        return tiefendurchlaufIntern(gesuchterKnoten);
    }

    /**
     * Interne Methode zur rekursiven Tiefensuche.
     */
    private List<Vertex> tiefendurchlaufIntern(Vertex pStart) {
        List<Vertex> ergebnisListe = new List<>();
        //Dein Quellcode hier
        return ergebnisListe;
    }

}

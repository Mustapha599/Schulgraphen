import utils.Graph;
import utils.List;
import utils.Queue;
import utils.Vertex;
import utils.Edge;


/**
 * Beschreiben Sie hier die Klasse Schulgraph.
 *
 *  @author  (Ihr Name)
 *  @version  (eine Versionsnummer oder ein Datum)
 */
public class schulgraph
{
    List<Vertex> Nachbar = new List();
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Graph schulgraph;
    private double [][] admatrix;
    public static void main(String[] args){
        new schulgraph();
    }
    /**
     * Konstruktor für Objekte der Klasse Schulgraph
     */
    public schulgraph()
    {
        // Aufbau des Schulgraphens
        schulgraph = new Graph();
        Vertex Informatikraum = new Vertex( "Inforaum");
        schulgraph.addVertex(Informatikraum);
        Vertex PZ = new Vertex( "PZ");
        schulgraph.addVertex(PZ);
        schulgraph.addEdge(new Edge(Informatikraum, PZ, 96));
        Vertex WC = new Vertex( "WC");
        schulgraph.addVertex(WC);
        schulgraph.addEdge(new Edge(Informatikraum, WC, 80));
        Vertex Aula = new Vertex( "Aula");
        schulgraph.addVertex(Aula);
        schulgraph.addEdge(new Edge(Informatikraum, Aula, 95));
        schulgraph.addEdge(new Edge(Aula, WC, 15));
        Vertex Kunstraum = new Vertex( "Kunstraum");
        schulgraph.addVertex(Kunstraum);
        schulgraph.addEdge(new Edge(Kunstraum, Aula, 71));
        schulgraph.addEdge(new Edge(Informatikraum, Kunstraum, 64));
        Vertex Musikraum = new Vertex( "Musikraum");
        schulgraph.addVertex(Musikraum);
        schulgraph.addEdge(new Edge(Informatikraum, Musikraum, 50));
        schulgraph.addEdge(new Edge(Musikraum, Kunstraum, 9));
        Vertex Informatikraum2 = new Vertex( "Inforaum2");
        schulgraph.addVertex(Informatikraum2);
        schulgraph.addEdge(new Edge(Musikraum, Informatikraum2, 55));
        schulgraph.addEdge(new Edge(Informatikraum, Kunstraum, 55));
        schulgraph.addEdge(new Edge(Informatikraum, Informatikraum2, 5));
        Vertex schulzoo= new Vertex( "schulzoo");
        schulgraph.addVertex(schulzoo);
        schulgraph.addEdge(new Edge(Informatikraum, schulzoo, 17));
        Vertex Chemieraum= new Vertex( "Chemieraum");
        schulgraph.addVertex(Chemieraum);
        schulgraph.addEdge(new Edge(Chemieraum, schulzoo, 7));
        Vertex Bioraum= new Vertex( "Bioraum");
        schulgraph.addVertex(Bioraum);
        schulgraph.addEdge(new Edge(Chemieraum, Bioraum, 4));
        Vertex Treppenhaus= new Vertex( "TreppenhausNW");
        schulgraph.addVertex(Treppenhaus);
        schulgraph.addEdge(new Edge(Chemieraum, Treppenhaus, 22));
        schulgraph.addEdge(new Edge(Treppenhaus, Bioraum, 21));
        schulgraph.addEdge(new Edge(Informatikraum, Treppenhaus, 13));
        Vertex Fussballplatz= new Vertex( "Fussballplatz");
        schulgraph.addVertex(Fussballplatz);
        schulgraph.addEdge(new Edge(Informatikraum, Fussballplatz, 34));
        Vertex Sporthalle= new Vertex( "Sporthalle");
        schulgraph.addVertex(Sporthalle);
        schulgraph.addEdge(new Edge(Informatikraum, Sporthalle, 95));
        schulgraph.addEdge(new Edge(Sporthalle, Fussballplatz, 38));
        Vertex TorSF= new Vertex( "TorSF");
        schulgraph.addVertex(TorSF);
        schulgraph.addEdge(new Edge(Sporthalle, TorSF, 63));
        schulgraph.addEdge(new Edge(TorSF, Fussballplatz, 34));
        Vertex Tischtennisplatten= new Vertex( "Tischtennisplatten");
        schulgraph.addVertex(Tischtennisplatten);
        schulgraph.addEdge(new Edge(TorSF, Tischtennisplatten, 8));
        schulgraph.addEdge(new Edge(Sporthalle, Tischtennisplatten, 28));
        Vertex Radkeller= new Vertex( "Radkeller");
        schulgraph.addVertex(Radkeller);
        schulgraph.addEdge(new Edge(Radkeller, PZ, 45));
        Vertex Sekreteriat = new Vertex( "Sekreteriat");
        schulgraph.addVertex(Sekreteriat);
        schulgraph.addEdge(new Edge(Sekreteriat, PZ, 37));
        Vertex Lehrerzimmer = new Vertex( "Lehrerzimmer");
        schulgraph.addVertex(Lehrerzimmer);
        schulgraph.addEdge(new Edge(Lehrerzimmer, PZ, 37));
        schulgraph.addEdge(new Edge(Sekreteriat, Lehrerzimmer, 18));
        schulgraph.addEdge(new Edge(Radkeller, Lehrerzimmer, 27));
        Vertex TorRH = new Vertex( "TorRH");
        schulgraph.addVertex(TorRH);
        schulgraph.addEdge(new Edge(TorRH, Lehrerzimmer, 79));
        schulgraph.addEdge(new Edge(TorRH, PZ, 98));
        schulgraph.addEdge(new Edge(TorRH, Sekreteriat, 78));
        Vertex Mensa = new Vertex( "Mensa");
        schulgraph.addVertex(Mensa);
        schulgraph.addEdge(new Edge(Lehrerzimmer,Mensa, 96));
        schulgraph.addEdge(new Edge(WC, Mensa, 22));
        Vertex Cafeteria = new Vertex( "Cafeteria");
        schulgraph.addVertex(Cafeteria);
        schulgraph.addEdge(new Edge(Cafeteria,Mensa, 7));
        schulgraph.addEdge(new Edge(Cafeteria,WC, 22));
        schulgraph.addEdge(new Edge(Cafeteria,Aula, 7));
        schulgraph.g.addEdge(new Edge(Cafeteria,Kunstraum, 90));
        //alle Kanten und Knoten werden deklariert und initialisiert
       // Vertex rueckertstr = new Vertex ("Rückertstraße");
       // Vertex lz = new Vertex ("LZ");

        //Die Knoten und Kanten werden dem Graphen hinzugefügt
        //g.addVertex(rueckertstr);
        //g.addVertex(lz);

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
        Vertex gesuchterKnoten = schulgraph.getVertex(pStart);
        return breitensucheIntern(gesuchterKnoten);
    }

    /**
     * Interne Methode zur rekursiven Breitensuche.
     */
    private List<Vertex> breitensucheIntern(Vertex pStart) {
        List<Vertex> ergebnisListe = new List<>();
        Queue breitensuche = new Queue<>();
        ergebnisListe.toFirst();
        while (ergebnisListe.hasAccess()){
            ergebnisListe.toFirst();
            ergebnisListe.remove();
        }
        ergebnisListe.toFirst();
        breitensuche.enqueue(schulgraph.getVertex("Inforaum"));
        schulgraph.getVertex("Inforaum").setMark(true);

        while(!breitensuche.isEmpty()){
            Vertex aktuellerNode;
            aktuellerNode = new Vertex();
            aktuellerNode = (Vertex)breitensuche.front();
            ergebnisListe.append(aktuellerNode);
            aktuellerNode.setMark(true);

            List<Vertex> Nachbar = schulgraph.getNeighbours(aktuellerNode);
        }
        while(Nachbar.hasAccess()) {
          if(Nachbar.getContent().isMarked()){
              breitensuche.enqueue(Nachbar.getContent());
          }
          Nachbar.next();
        }
        return ergebnisListe;
    }

    /**
     * Tiefensuche: Weitere Informationen zur Tiefensuche findest du im Buch! Der Parameter gibt den Startknoten an
     *  @param  pStart : String
     *  @return  Ergebnisliste der Breitensuche
     */
    public List<Vertex> tiefendurchlauf(String pStart)
    {
        Vertex gesuchterKnoten = schulgraph.getVertex(pStart);
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

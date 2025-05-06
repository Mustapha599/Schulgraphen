/**
 * <p>
 * Materialien zu den zentralen NRW-Abiturpruefungen im Fach Informatik ab 2018
 * </p>
 * <p>
 * Klasse Edge
 * </p>
 * <p>
 * Die Klasse Edge stellt eine einzelne, ungerichtete Kante eines Graphen dar. 
 * Beim Erstellen werden die beiden durch sie zu verbindenden Knotenobjekte und eine 
 * Gewichtung als double uebergeben. Beide Knotenobjekte koennen abgefragt werden. 
 * Des Weiteren koennen die Gewichtung und eine Markierung gesetzt und abgefragt werden.
 * </p>
 * 
 * @author Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule
 * @version Oktober 2015
 */
public class Edge{
  private Vertex[] vertices;
  private double weight;
  private boolean mark;
  
  /**
  * Ein neues Objekt vom Typ Edge wird erstellt. Die von diesem Objekt 
  * repraesentierte Kante verbindet die Knoten pVertex und pAnotherVertex mit der 
  * Gewichtung pWeight. Ihre Markierung hat den Wert false.
  */
  public Edge(Vertex pVertex, Vertex pAnotherVertex, double pWeight){
    vertices = new Vertex[2];
    vertices[0] = pVertex;
    vertices[1] = pAnotherVertex;
    weight = pWeight;
    mark = false;
  }
  
  /**
  * Die Anfrage gibt die beiden Knoten, die durch die Kante verbunden werden, als neues Feld vom Typ Vertex zurueck. Das Feld hat 
  * genau zwei Eintraege mit den Indexwerten 0 und 1.
  */
  public Vertex[] getVertices(){
    Vertex[] result = new Vertex[2];
    result[0] = vertices[0]; 
    result[1] = vertices[1];
    return result;
  }
  
  /**
  * Der Auftrag setzt das Gewicht der Kante auf pWeight.
  */
  public void setWeight(double pWeight){
    weight = pWeight;
  } 
  
  /**
  * Die Anfrage liefert das Gewicht der Kante als double.
  */
  public double getWeight(){
    return weight;
  } 
  
  /**
  * Der Auftrag setzt die Markierung der Kante auf den Wert pMark.
  */
  public void setMark(boolean pMark){
    mark = pMark;
  }
  
  /**
  * Die Anfrage liefert true, wenn die Markierung der Kante den Wert true hat, ansonsten false.
  */
  public boolean isMarked(){
    return mark;
  }

  /**
  * <p>
  * Materialien zu den zentralen NRW-Abiturpruefungen im Fach Informatik ab 2018
  * </p>
  * <p>
  * Generische Klasse Edge.Stack<ContentType>
  * </p>
  * <p>
  * Objekte der generischen Klasse Edge.Stack (Keller, Stapel) verwalten beliebige
  * Objekte vom Typ ContentType nach dem Last-In-First-Out-Prinzip, d.h., das
  * zuletzt abgelegte Objekt wird als erstes wieder entnommen. Alle Methoden
  * haben eine konstante Laufzeit, unabhaengig von der Anzahl der verwalteten
  * Objekte.
  * </p>
  *
  * @author Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule
  * @version Generisch_02 2014-02-21
  */
 public static class Stack<ContentType> {

   /* --------- Anfang der privaten inneren Klasse -------------- */

   private class StackNode {

     private ContentType content = null;
     private StackNode nextNode = null;

     /**
      * Ein neues Objekt vom Typ StackNode<ContentType> wird erschaffen. <br />
      * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
      *
      * @param pContent der Inhalt des Knotens
      */
     public StackNode(ContentType pContent) {
       content = pContent;
       nextNode = null;
     }

     /**
      * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
      * gesetzt.
      *
      * @param pNext der Nachfolger des Knotens
      */
     public void setNext(StackNode pNext) {
       nextNode = pNext;
     }

     /**
      *
      * @return das Objekt, auf das der aktuelle Verweis zeigt
      */
     public StackNode getNext() {
       return nextNode;
     }

     /**
      * @return das Inhaltsobjekt vom Typ ContentType
      */
     public ContentType getContent() {
       return content;
     }
   }

   /* ----------- Ende der privaten inneren Klasse -------------- */

   private StackNode head;

   /**
    * Ein leerer Stapel wird erzeugt. Objekte, die in diesem Stapel verwaltet
    * werden, muessen vom Typ ContentType sein.
    */
   public Stack() {
     head = null;
   }

   /**
    * Die Anfrage liefert den Wert true, wenn der Stapel keine Objekte
    * enthaelt, sonst liefert sie den Wert false.
    *
    * @return true, falls der Stapel leer ist, sonst false
    */
   public boolean isEmpty() {
     return (head == null);
   }

   /**
    * Das Objekt pContentType wird oben auf den Stapel gelegt. Falls
    * pContentType gleich null ist, bleibt der Stapel unveraendert.
    *
    * @param pContent
    *        das einzufuegende Objekt vom Typ ContentType
    */
   public void push(ContentType pContent) {
     if (pContent != null) {
       StackNode node = new StackNode(pContent);
       node.setNext(head);
       head = node;
     }
   }

   /**
    * Das zuletzt eingefuegte Objekt wird von dem Stapel entfernt. Falls der
    * Stapel leer ist, bleibt er unveraendert.
    */
   public void pop() {
     if (!isEmpty()) {
       head = head.getNext();
     }
   }

   /**
    * Die Anfrage liefert das oberste Stapelobjekt. Der Stapel bleibt
    * unveraendert. Falls der Stapel leer ist, wird null zurueckgegeben.
    *
    * @return das oberste Stackelement vom Typ ContentType oder null, falls
    *         der Edge.Stack leer ist
    */
   public ContentType top() {
     if (!this.isEmpty()) {
       return head.getContent();
     } else {
       return null;
     }
   }
 }
}

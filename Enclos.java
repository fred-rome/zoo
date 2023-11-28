

/**
 * Class Enclos
 */
public class Enclos {

  //
  // Fields
  //

  private String id;
  private String nom;
  private Zone zone;
  private String coordonnees;
  private unsigned int superficie;
  
  //
  // Constructors
  //
  public Enclos () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of nom
   * @param newVar the new value of nom
   */
  public void setNom (String newVar) {
    nom = newVar;
  }

  /**
   * Get the value of nom
   * @return the value of nom
   */
  public String getNom () {
    return nom;
  }

  /**
   * Set the value of zone
   * @param newVar the new value of zone
   */
  public void setZone (Zone newVar) {
    zone = newVar;
  }

  /**
   * Get the value of zone
   * @return the value of zone
   */
  public Zone getZone () {
    return zone;
  }

  /**
   * Set the value of coordonnees
   * @param newVar the new value of coordonnees
   */
  public void setCoordonnees (String newVar) {
    coordonnees = newVar;
  }

  /**
   * Get the value of coordonnees
   * @return the value of coordonnees
   */
  public String getCoordonnees () {
    return coordonnees;
  }

  /**
   * Set the value of superficie
   * @param newVar the new value of superficie
   */
  public void setSuperficie (unsigned int newVar) {
    superficie = newVar;
  }

  /**
   * Get the value of superficie
   * @return the value of superficie
   */
  public unsigned int getSuperficie () {
    return superficie;
  }

  //
  // Other methods
  //

}



/**
 * Class Action
 */
public class Action {

  //
  // Fields
  //

  private String id;
  private String nom;
  private String description;
  private Salarie createur;
  private Enclos enclos;
  /**
   * 0 (basse), 1 (moyenne) et 2 (haute)
   */
  private unsigned int priorite;
  private date datePrevue;
  
  //
  // Constructors
  //
  public Action () { };
  
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
   * Set the value of description
   * @param newVar the new value of description
   */
  public void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  public String getDescription () {
    return description;
  }

  /**
   * Set the value of createur
   * @param newVar the new value of createur
   */
  public void setCreateur (Salarie newVar) {
    createur = newVar;
  }

  /**
   * Get the value of createur
   * @return the value of createur
   */
  public Salarie getCreateur () {
    return createur;
  }

  /**
   * Set the value of enclos
   * @param newVar the new value of enclos
   */
  public void setEnclos (Enclos newVar) {
    enclos = newVar;
  }

  /**
   * Get the value of enclos
   * @return the value of enclos
   */
  public Enclos getEnclos () {
    return enclos;
  }

  /**
   * Set the value of priorite
   * 0 (basse), 1 (moyenne) et 2 (haute)
   * @param newVar the new value of priorite
   */
  public void setPriorite (unsigned int newVar) {
    priorite = newVar;
  }

  /**
   * Get the value of priorite
   * 0 (basse), 1 (moyenne) et 2 (haute)
   * @return the value of priorite
   */
  public unsigned int getPriorite () {
    return priorite;
  }

  /**
   * Set the value of datePrevue
   * @param newVar the new value of datePrevue
   */
  public void setDatePrevue (date newVar) {
    datePrevue = newVar;
  }

  /**
   * Get the value of datePrevue
   * @return the value of datePrevue
   */
  public date getDatePrevue () {
    return datePrevue;
  }

  //
  // Other methods
  //

}



/**
 * Class Espece
 */
public class Espece {

  //
  // Fields
  //

  private String Id;
  private String nom;
  private boolean sociable = false;
  private String observations;
  private boolean dangereux = true;
  private Enclos enclos;
  
  //
  // Constructors
  //
  public Espece () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Id
   * @param newVar the new value of Id
   */
  public void setId (String newVar) {
    Id = newVar;
  }

  /**
   * Get the value of Id
   * @return the value of Id
   */
  public String getId () {
    return Id;
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
   * Set the value of sociable
   * @param newVar the new value of sociable
   */
  public void setSociable (boolean newVar) {
    sociable = newVar;
  }

  /**
   * Get the value of sociable
   * @return the value of sociable
   */
  public boolean getSociable () {
    return sociable;
  }

  /**
   * Set the value of observations
   * @param newVar the new value of observations
   */
  public void setObservations (String newVar) {
    observations = newVar;
  }

  /**
   * Get the value of observations
   * @return the value of observations
   */
  public String getObservations () {
    return observations;
  }

  /**
   * Set the value of dangereux
   * @param newVar the new value of dangereux
   */
  public void setDangereux (boolean newVar) {
    dangereux = newVar;
  }

  /**
   * Get the value of dangereux
   * @return the value of dangereux
   */
  public boolean getDangereux () {
    return dangereux;
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

  //
  // Other methods
  //

}

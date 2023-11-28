

/**
 * Class Animal
 */
public class Animal {

  //
  // Fields
  //

  private String id;
  private String nom;
  private Espece espece;
  private date naissance;
  private date deces;
  /**
   * M ou F
   */
  private String sexe;
  private String observations;
  /**
   * 0 (dedans), 1 (dehors), 2 (clinique) et 3 (prêt)
   */
  private unsigned int position;
  
  //
  // Constructors
  //
  public Animal () { };
  
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
   * Set the value of espece
   * @param newVar the new value of espece
   */
  public void setEspece (Espece newVar) {
    espece = newVar;
  }

  /**
   * Get the value of espece
   * @return the value of espece
   */
  public Espece getEspece () {
    return espece;
  }

  /**
   * Set the value of naissance
   * @param newVar the new value of naissance
   */
  public void setNaissance (date newVar) {
    naissance = newVar;
  }

  /**
   * Get the value of naissance
   * @return the value of naissance
   */
  public date getNaissance () {
    return naissance;
  }

  /**
   * Set the value of deces
   * @param newVar the new value of deces
   */
  public void setDeces (date newVar) {
    deces = newVar;
  }

  /**
   * Get the value of deces
   * @return the value of deces
   */
  public date getDeces () {
    return deces;
  }

  /**
   * Set the value of sexe
   * M ou F
   * @param newVar the new value of sexe
   */
  public void setSexe (String newVar) {
    sexe = newVar;
  }

  /**
   * Get the value of sexe
   * M ou F
   * @return the value of sexe
   */
  public String getSexe () {
    return sexe;
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
   * Set the value of position
   * 0 (dedans), 1 (dehors), 2 (clinique) et 3 (prêt)
   * @param newVar the new value of position
   */
  public void setPosition (unsigned int newVar) {
    position = newVar;
  }

  /**
   * Get the value of position
   * 0 (dedans), 1 (dehors), 2 (clinique) et 3 (prêt)
   * @return the value of position
   */
  public unsigned int getPosition () {
    return position;
  }

  //
  // Other methods
  //

}

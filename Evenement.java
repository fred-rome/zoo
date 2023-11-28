

/**
 * Class Evenement
 */
public class Evenement {

  //
  // Fields
  //

  private String id;
  private TypeEvenement Type;
  private Enclos enclos;
  private Salarie salarie;
  private date date;
  private time heure;
  private String observations;
  private Action action;
  
  //
  // Constructors
  //
  public Evenement () { };
  
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
   * Set the value of Type
   * @param newVar the new value of Type
   */
  public void setType (TypeEvenement newVar) {
    Type = newVar;
  }

  /**
   * Get the value of Type
   * @return the value of Type
   */
  public TypeEvenement getType () {
    return Type;
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
   * Set the value of salarie
   * @param newVar the new value of salarie
   */
  public void setSalarie (Salarie newVar) {
    salarie = newVar;
  }

  /**
   * Get the value of salarie
   * @return the value of salarie
   */
  public Salarie getSalarie () {
    return salarie;
  }

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  public void setDate (date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  public date getDate () {
    return date;
  }

  /**
   * Set the value of heure
   * @param newVar the new value of heure
   */
  public void setHeure (time newVar) {
    heure = newVar;
  }

  /**
   * Get the value of heure
   * @return the value of heure
   */
  public time getHeure () {
    return heure;
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
   * Set the value of action
   * @param newVar the new value of action
   */
  public void setAction (Action newVar) {
    action = newVar;
  }

  /**
   * Get the value of action
   * @return the value of action
   */
  public Action getAction () {
    return action;
  }

  //
  // Other methods
  //

  /**
   * @param        enclos
   */
  public void FiltrerParEnclos(Enclos enclos)
  {
  }


  /**
   * @param        espece
   */
  public void FiltrerParEspece(Espece espece)
  {
  }


  /**
   * @param        animal
   */
  public void FiltrerParAnimal(Animal animal)
  {
  }


}

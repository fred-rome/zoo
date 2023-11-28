

/**
 * Class EvenementAnimal
 */
public class EvenementAnimal {

  //
  // Fields
  //

  private Evenement evenement;
  private Animal animal;
  
  //
  // Constructors
  //
  public EvenementAnimal () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of evenement
   * @param newVar the new value of evenement
   */
  public void setEvenement (Evenement newVar) {
    evenement = newVar;
  }

  /**
   * Get the value of evenement
   * @return the value of evenement
   */
  public Evenement getEvenement () {
    return evenement;
  }

  /**
   * Set the value of animal
   * @param newVar the new value of animal
   */
  public void setAnimal (Animal newVar) {
    animal = newVar;
  }

  /**
   * Get the value of animal
   * @return the value of animal
   */
  public Animal getAnimal () {
    return animal;
  }

  //
  // Other methods
  //

}

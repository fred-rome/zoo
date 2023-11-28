

/**
 * Class Bassin
 */
public class Bassin extends Enclos {

  //
  // Fields
  //

  private unsigned int temperatureMini;
  private unsigned int temperatureMaxi;
  /**
   * 5.0 à 8.0
   */
  private float PH = 7;
  private unsigned int salinite = 35;
  
  //
  // Constructors
  //
  public Bassin () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of temperatureMini
   * @param newVar the new value of temperatureMini
   */
  public void setTemperatureMini (unsigned int newVar) {
    temperatureMini = newVar;
  }

  /**
   * Get the value of temperatureMini
   * @return the value of temperatureMini
   */
  public unsigned int getTemperatureMini () {
    return temperatureMini;
  }

  /**
   * Set the value of temperatureMaxi
   * @param newVar the new value of temperatureMaxi
   */
  public void setTemperatureMaxi (unsigned int newVar) {
    temperatureMaxi = newVar;
  }

  /**
   * Get the value of temperatureMaxi
   * @return the value of temperatureMaxi
   */
  public unsigned int getTemperatureMaxi () {
    return temperatureMaxi;
  }

  /**
   * Set the value of PH
   * 5.0 à 8.0
   * @param newVar the new value of PH
   */
  public void setPH (float newVar) {
    PH = newVar;
  }

  /**
   * Get the value of PH
   * 5.0 à 8.0
   * @return the value of PH
   */
  public float getPH () {
    return PH;
  }

  /**
   * Set the value of salinite
   * @param newVar the new value of salinite
   */
  public void setSalinite (unsigned int newVar) {
    salinite = newVar;
  }

  /**
   * Get the value of salinite
   * @return the value of salinite
   */
  public unsigned int getSalinite () {
    return salinite;
  }

  //
  // Other methods
  //

}

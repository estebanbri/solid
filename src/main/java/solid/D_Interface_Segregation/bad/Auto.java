package solid.D_Interface_Segregation.bad;

public class Auto implements Interruptores {

  private boolean radioOn;

  public void arrancarMotor() {

  }

  public void encenderRadio() {
    radioOn = true;
  }

  public void apagarRadio() {
    radioOn = false;
  }

  public void encenderCamara() {
    // no tendria que estar obligado a implementar este metodo para un automovil
  }

  public void apagarCamara() {
    // no tendria que estar obligado a implementar este metodo para un automovil
  }
}

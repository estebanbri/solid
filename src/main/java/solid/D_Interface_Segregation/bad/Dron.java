package solid.D_Interface_Segregation.bad;

public class Dron implements Interruptores {

  private boolean cameraOn;

  public void arrancarMotor() {

  }

  public void encenderRadio() {
    // no tendria que estar obligado a implementar este metodo para un drone
  }

  public void apagarRadio() {
    // no tendria que estar obligado a implementar este metodo para un drone
  }

  public void encenderCamara() {
    cameraOn = true;
  }

  public void apagarCamara() {
    cameraOn = false;
  }
}

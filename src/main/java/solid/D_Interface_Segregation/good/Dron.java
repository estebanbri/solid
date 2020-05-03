package solid.D_Interface_Segregation.good;

public class Dron implements InterruptorMotor, InterruptorCamara {

  private boolean cameraOn;

  public void encenderMotor() {

  }

  public void encenderCamara() {
    cameraOn = true;
  }

  public void apagarCamara() {
    cameraOn = false;
  }

}

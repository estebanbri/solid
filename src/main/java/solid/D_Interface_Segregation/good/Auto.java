package solid.D_Interface_Segregation.good;

public class Auto implements InterruptorMotor, InterruptorRadio {

  private boolean radioOn;

  public void encenderMotor() {

  }

  public void encenderRadio() {
    radioOn = true;
  }

  public void apagarRadio() {
    radioOn = false;
  }

}

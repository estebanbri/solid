package solid.B_Open_Close.good.impl;

import solid.B_Open_Close.good.ModoConduccion;

public class ModoConduccionComfort implements ModoConduccion {

  private static final int POWER = 400;
  private static final int SUSPENSION_HEIGHT = 20;

  public int getPoder() {
    return POWER;
  }

  public int getAlturaSuspension() {
    return SUSPENSION_HEIGHT;
  }

}

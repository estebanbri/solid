package solid.B_Open_Close.good.impl;

import solid.B_Open_Close.good.ModoConduccion;

public class ModoConduccionSport implements ModoConduccion {

  private static final int POWER = 500;
  private static final int SUSPENSION_HEIGHT = 10;

  public int getPoder() {
    return POWER;
  }

  public int getAlturaSuspension() {
    return SUSPENSION_HEIGHT;
  }

}

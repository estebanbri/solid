package solid.E_Dependency_Inversion.good;

public class AutoCarrera implements Auto {

  private int combustibleRemanente;
  private int poder;

  public AutoCarrera(final int combustible) {
    combustibleRemanente = combustible;
  }


  public void acelerar() {
    poder++;
    combustibleRemanente--;
  }

}

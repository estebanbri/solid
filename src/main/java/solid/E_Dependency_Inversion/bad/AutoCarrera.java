package solid.E_Dependency_Inversion.bad;

public class AutoCarrera {

  private int combustibleRemanente;
  private int poder;

  public AutoCarrera(final int combustible) {
    combustibleRemanente = combustible;
  }

  void acelerar() {
    poder++;
    combustibleRemanente--;
  }

}

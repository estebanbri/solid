package solid.A_Single_Responsability.good;

public class Vehiculo {

  private final int combustibleMaximoSoportado;
  private int combustibleRemanente;

  public Vehiculo(final int combustibleMaximoSoportado) {
    this.combustibleMaximoSoportado = combustibleMaximoSoportado;
    combustibleRemanente = combustibleMaximoSoportado;
  }

  public int getCombustibleMaximoSoportado() {
    return combustibleMaximoSoportado;
  }

  public int getCombustibleRemanente() {
    return combustibleRemanente;
  }

  public void setCombustibleRemanente(int combustibleRemanente) {
    this.combustibleRemanente = combustibleRemanente;
  }
}

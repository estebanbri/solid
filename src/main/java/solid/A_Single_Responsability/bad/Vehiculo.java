package solid.A_Single_Responsability.bad;

// No cumple con SRP, ya que tiene dos responsabilidades:
// 1 - Modela un vehiculo y sus propiedades
// 2 - Reabastecer el tanque combustible
// Por tanto si cambia el modelo Vehiculo o si cambia la forma de reabastecer combustible esta clase tendrá dos motivos para cambiar.

public class Vehiculo {

  private final int combustibleMaximoSoportado;
  private int combustibleRemanente;

  public Vehiculo(final int combustibleMaximoSoportado) {
    this.combustibleMaximoSoportado = combustibleMaximoSoportado;
    combustibleRemanente = combustibleMaximoSoportado;
  }

  //FIXME > ERROR! Esto no es responsabilidad de la clase 'Vehiculo'
  public void reabastecerCombustible() {
    final int combustibleAdicional = combustibleMaximoSoportado - combustibleRemanente;
    combustibleRemanente = combustibleRemanente + combustibleAdicional;
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

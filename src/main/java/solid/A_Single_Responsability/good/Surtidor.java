package solid.A_Single_Responsability.good;

public class Surtidor {

  // Esto no es responsabilidad de la clase 'Vehiculo'
  public void reabastecerCombustible(Vehiculo vehiculo) {
    final int combustibleRemanente = vehiculo.getCombustibleRemanente();
    final int combustibleAdicional = vehiculo.getCombustibleMaximoSoportado() - combustibleRemanente;
    vehiculo.setCombustibleRemanente(combustibleRemanente + combustibleAdicional);
  }
}

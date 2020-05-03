package solid.B_Open_Close.good;

public class EventHandler {

  private Vehiculo vehiculo;

  public EventHandler(final Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }

  void cambiarModoConduccion(final ModoConduccion modoConduccion) {
    vehiculo.setPoder(modoConduccion.getPoder());
    vehiculo.setAlturaSuspension(modoConduccion.getAlturaSuspension());
    // Ahora, cuando necesitemos añadir otro modo (e.g. ECONOMY) sólo hay que crear la clase 'Economy'.
  }

}

package solid.B_Open_Close.bad;

public class EventHandler {

  enum ModoConduccion {
    SPORT, COMFORT
  }

  private Vehiculo vehiculo;

  public EventHandler(final Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }

  void cambiarModoConduccion(final ModoConduccion modoConduccion) {
    switch (modoConduccion) {
      case SPORT:
        vehiculo.setPoder(500);
        vehiculo.setAlturaSuspension(10);
        break;
      case COMFORT:
        vehiculo.setPoder(400);
        vehiculo.setAlturaSuspension(20);
        break;
      default:
        vehiculo.setPoder(200);
        vehiculo.setAlturaSuspension(30);
        break;
      //FIXME > Error! Cuando necesitemos añadir otro modo (e.g. ECONOMICA) deberemos cambiar la clase 'EventHandler' y la enumeración 'ModoConduccion'.
    }
  }
}

package solid.E_Dependency_Inversion.bad;

public class Piloto {

  private AutoCarrera autoCarrera;

  Piloto(){
    autoCarrera = new AutoCarrera(100);
  }

  void aumentarVelocidad() {
    this.autoCarrera.acelerar();
  }

}

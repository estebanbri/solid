package solid.E_Dependency_Inversion.good;


public class Piloto {

  private Auto auto;

  Piloto(Auto auto){
    auto = auto;
  }

  void aumentarVelocidad() {
    this.auto.acelerar();
  }

}

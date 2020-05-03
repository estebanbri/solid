package solid.C_Liskov_Substitution.good;

public class Pato extends PajaroVolador {

  @Override
  void volar() {
    System.out.println("Vuelo como un pato");
  }

  @Override
  void comer() {
    System.out.println("Como como un pato");
  }

}

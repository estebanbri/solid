package solid.C_Liskov_Substitution.bad;

public class Avestruz extends Pajaro {

  @Override
  void volar(){
    throw new UnsupportedOperationException("Un avestruz no puede volar..."); // FIXME > ERROR!
  }

}

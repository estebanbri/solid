package solid.C_Liskov_Substitution.good;


public class Main {

  public static void main(String[] args) {

    // comer

    Pajaro pajaro = new Pajaro();
    pajaro.comer();

    pajaro = new Avestruz();
    pajaro.comer();

    pajaro = new Pato();
    pajaro.comer();

    // volar

    PajaroVolador pajaroVolador = new PajaroVolador();
    pajaroVolador.volar();

    pajaroVolador = new Pato();
    pajaroVolador.volar();

  }
}

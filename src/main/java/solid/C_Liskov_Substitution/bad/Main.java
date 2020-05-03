package solid.C_Liskov_Substitution.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * Según el "Liskov Substitution Principle" deberíamos poder utilizar las clases Pato y/o Avestruz
 * en lugar de la superclase Bird. Debido a que no se cumple este principio no se puede usar
 * de forma indistinta la superclase o las subclases sin generar errores en la aplicación
 * ya que la subclase Avestruz tiene unas restricciones superiores a la superclase
 * en el método volar(). Este método lanza una excepción
 * de tipo 'UnsupportedOperationException' que no se lanza ni en la otra subclase ni
 * en la superclase. Por tanto no se pueden usar de forma indistinta.
 * Si usamos la subclase Avestruz deberemos capturar o relanzar dicha excepción.
 */

public class Main {

  public static void main(String[] args) {

    Pajaro pajaro = new Pajaro();
    pajaro.volar();

    pajaro = new Pato();
    pajaro.volar();

    pajaro = new Avestruz();
    pajaro.volar();   // FIXME! al no cumplir LSP no puedo usar de manera indistinta la superclase y las subclases

  }

}

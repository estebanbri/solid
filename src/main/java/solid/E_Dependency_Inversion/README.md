####  D - Principio de Inversión de Dependencias ("Dependency Inversion Principle" - DIP)

> Este principio consta de dos partes:

- Módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

- Abstracciones no deberían depender de detalles. Los detalles debieran depender de abstracciones.

La idea general de este principio es tan simple como importante: los módulos de alto nivel, que brindan una lógica compleja, deben ser fácilmente reutilizables y no verse afectados por los cambios en los módulos de bajo nivel, que brindan funciones de utilidad. Para lograr eso, se deben introducir una abstracción que desacople los módulos de alto y bajo nivel entre sí.
La definición de este principio según Robert C. Martin consta de dos partes:

Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deberían depender de abstracciones.
Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.

Un importante detalle de esta definición es que tanto los módulos de alto nivel como los de bajo nivel dependen de una abstracción. Por tanto no se invierte la dirección de la dependencia como cabría esperar por el nombre del principio sino que se divide la dependencia entre los módulos de alto y bajo nivel introduciendo una abstracción entre ellos.

Si se han aplicado correctamente el "Open/Closed Principle" y el "Liskov Substitution Principle" también se ha aplicado este principio.

El "Open/Closed Principle" requiere que el componente esté abierto a extensión pero cerrado a modificación. Se puede lograr introduciendo interfaces para las que puede proporcionar diferentes implementaciones. La interfaz en sí misma está cerrada a modificaciones y puede ampliarse fácilmente proporcionando una nueva implementación de interfaz.

Sus implementaciones deben seguir el "Liskov Substitution Principle" para que pueda reemplazarlas con otras implementaciones de la misma interfaz sin "romper" la aplicación o sistema.
####  O - Principio de Abierto/Cerrado ("Open/Closed Principle" - OCP)

- Este principio establece que «una entidad de software (clase, módulo, función, etc.) debe quedar abierta para su extensión, pero cerrada para su modificación». Es decir, se debe poder extender el comportamiento de la entidad pero sin modificar su código fuente.

>La idea es escribir código de forma que sea posible añadir nuevas funcionalidades pero sin modificar el código existente. Esto previene situaciones en que al modificar clases base nos veamos obligados también a adaptar todas las clases dependientes.

>Inicialmente este principio se basaba en el uso de la herencia pero Robert C. Martin y otros autores con el tiempo y la experiencia llegaron a la conclusión que la herencia crea una fuerte dependencia entre las clases. Es recomendable el uso de interfaces en lugar de la herencia.

>El mayor beneficio es que las interfaces introducen una capa extra de abstracción que otorga un bajo nivel de acoplamiento. Las implementaciones que hace cada clase de esa interfaz son independientes unas de otras y no necesitan compartir el código.

>En el caso de que los beneficios de compartir código fueran notables sería mejor optar por la herencia o la composición.
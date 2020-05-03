#### L - Principio de Substitución de Liskov ("Liskov Substitution Principle" - LSP)

- Este principo puede definirse como: «cada clase que hereda de otra puede usarse como su padre sin necesidad de conocer las diferencias entre ellas».

> El "Liskov Substitution Principle" extiende el "Open/Closed Principle" pero focalizado en el comportamiento de una superclase y sus subtipos.

> Este principio define que los objetos de una superclase deben ser reemplazables por objetos de sus subclases sin "romper" la aplicación o sistema y sin efectos secundarios. Eso requiere que los objetos de las subclases se comporten de la misma manera que los objetos de la superclase de forma que se puedan usar de forma indistinta.
 
#### Para conseguir esto las subclases deberían seguir estas reglas:
 
- No implementar reglas de validación más estrictas en los parámetros de entrada que las implementadas por la clase base.
- Aplicar al menos las mismas reglas a todos los parámetros de salida aplicados por la clase base.
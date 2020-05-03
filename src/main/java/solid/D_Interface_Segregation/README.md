####  I - Principio de Segregación de la Interfaz ("Interface Segregation Principle" - ISP)

- Este principio establece que los clientes de un programa dado sólo deberían conocer aquellos 
métodos del programa que realmente usan, y no aquellos que no necesitan usar.

> "Clients should not be forced to depend upon interfaces that they do not use"
-- Robert C. Martin

El objetivo de este principio, al igual que el "Single Responsibility Principle" es reducir los efectos secundarios y la frecuencia de los cambios si dividimos el código en múltiples partes independientes.

Al seguir este principio se evitan interfaces infladas que definen métodos para múltiples responsabilidades.
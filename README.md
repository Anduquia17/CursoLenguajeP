Preguntas de reflexión:
¿Qué pasa si se envía una clase que no hereda de Mascota?
R/ Lanza un error de compilación, porque la clase no es compatible con Mascota
¿Cómo se comporta si eliminas el instanceof y casteas directamente?
R/ Si se elimina el instanceof y se hace el casteo directamente, el programa compila, pero si el objeto no es realmente del tipo al que se esta casteando, lanza un error en tiempo de ejecución llamado: ClassCastException

Preguntas de cierre:
1. ¿Qué modificadores son accesibles desde una subclase en otro paquete?
2. R/ Solo los public y protected.
3. ¿Qué modificadores permiten acceder desde cualquier clase del mismo paquete?
4. R/public, protected y default sin modificador.
5. ¿Qué pasaría si todos los atributos fueran public?
6. R/Cualquier clase desde cualquier paquete, podría acceder y modificar directamente esos atributos, rompiendo la encapsulación y haciendo el código menos seguro.


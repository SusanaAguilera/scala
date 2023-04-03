package curso;

import java.security.Principal

// Scala no cuenta con el keyword "static", pero se logra con los singleton

object Asignatura { // Una clase del tipo estatica
    def aprobado = {
        println("Aprobado");
    }

    def suspende = {
        println("Suspendido");
    }
}

/* El singleton Principal puede estar disponible de manera global y solo tienen una instancia en todo el programa.
Es decir, sus metodos y valriables son compartidas.

Puede usarse para definir constantes globales, funciones utiles y/u objetos que deberian existir en una solo instancia.
*/
object Principal {
    def main(args: Array[String]): Unit = {
        Asignatura.aprobado
        Asignatura.suspende
        // var asig = new Asignatura() // Causa un error, porque no es un objeto como una clase
    }
}
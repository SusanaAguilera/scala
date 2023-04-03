package curso;
/*
    Los trait no pueden ser instanciados, pero son usados para definir metodos y ser reutilizados e incluzo modificados
    en las clases que los extiende.
*/
trait Trait1 {

    var edad : Int =_;
    def Imprimir(nombre:String) : Unit

    def imprimi1 : Unit = {
        println("Metodo implementado en el trait");
    }
}

class Persona extends Trait1 {
    def Imprimir(nombre:String) : Unit = {
        println(nombre.toUpperCase());
    }

    // Comentar para ver método de trait.
    override def imprimi1: Unit = { // Override para sobreescribir el metodo definido en el trait
        println("Estoy en la clase");
    }
}

object Principal {
    def main(args: Array[String]): Unit = {
        var persona1 = new Persona();
        persona1.Imprimir("Susana");
        persona1.imprimi1
        persona1.edad = 27;
        println(persona1.edad);
    }
}
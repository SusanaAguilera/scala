package curso;

trait Trait1 {
    var edad : Int =_;
    def Imprimir(nombre:String) : Unit

    def imprimi1 : Unit = {
        println("Metodo implementado en el trait");
    }
}

trait Trait2 {
    def imprimir2 : Unit;
}

class Persona extends Trait1 with Trait2 { // Separa los diferentes traits con WITH
    def Imprimir(nombre:String) : Unit = {
        println(nombre.toUpperCase());
    }

    override def imprimi1: Unit = { 
        println("Estoy en la clase");
    }

    override def imprimir2: Unit = {
        println("Estoy en el trait2");
    }
}

object Principal {
    def main(args: Array[String]): Unit = {
        var persona1 = new Persona();
        persona1.Imprimir("Susana");
        persona1.imprimi1
        persona1.edad = 27;
        println(persona1.edad);
        println(persona1.imprimir2);
    }
}
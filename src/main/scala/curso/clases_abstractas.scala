package curso;

abstract class Persona(nombre: String, apellido: String) {
    def mayusculas: Unit = {
        println(nombre.toUpperCase());
    }

    def nombreCompleto : String // No lo he definido para que sea abstracta.
}

class Estudiante(nombre: String, apellido: String) extends Persona(nombre, apellido) {
    def nombreCompleto: String = nombre + " " + apellido;

}

object Principal {
    def main(args: Array[String]): Unit = {
        var estudiante1 = new Estudiante("Susana", "Aguilera");
        println(estudiante1.nombreCompleto);
        println(estudiante1.mayusculas);

        // No se recomienda crear objetos directamente de la clase abstracta, pero se hace de la siguiente manera.
        var estudiante2 = new Persona("Daniel", "Muñoz") {
            override def nombreCompleto: String = "hola";
        }

        println(estudiante2.nombreCompleto);
    }
}

